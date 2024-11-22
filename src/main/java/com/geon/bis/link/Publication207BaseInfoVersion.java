package com.geon.bis.link;

import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.config.RegionCode;
import com.geon.bis.link.mapper.BaseInfoVersionMapper;
import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import com.geon.bis.link.tago.config.Common;
import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import datex.businfomation.BusBaseInformationVersion;
import datex.iso14827_1.Message_MESSAGE_BODY_3;
import datex.iso14827_2.*;
import datex.iso14827_2.Publish_Format.DatexPublish_Data;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.TooLongFrameException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static com.geon.bis.link.config.ChannelAttribute.INFO;

//버스기반정보에대한 퍼블리케이션 모듈 이벤트, 주기방식 구독에대한 스케쥴 실행
//버스기반정보는 기반정보 버전정보를 모듈 시동시 동기화 하고, 이후 버전정보를 이벤트로 수신하며, 버전정보 변경시 해당 정보 전송하는 방식으로 진행
@Slf4j
@Component
@RequiredArgsConstructor
public class Publication207BaseInfoVersion {

	private final Util util;
	private final BaseInfoVersionMapper baseInfoVersionMapper;

	@Value("${server.sender}")
	private String sender;
	@Value("${server.sendCnt}")
	private int sendCnt;
	@Value("${server.timeCnt}")
	private int timeCnt;

	public  void procSinglePublication(ChannelHandlerContext ctx, String requiredOrigin) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {

		List<Integer> origin = List.of(RegionCode.findByRegion(requiredOrigin).getCode());
		List<ResultBaseInfoVersion> versionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
				.origin(origin)
				.build());

		makePublicationData( ctx, requiredOrigin, versionList );
	}

	public void procEventPublication (ChannelHandlerContext ctx, String requiredOrigin) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {

		List<Integer> origin = List.of(RegionCode.findByRegion(requiredOrigin).getCode());
		List<ResultBaseInfoVersion> versionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
				.origin(origin)
				.build());

		makePublicationData( ctx, requiredOrigin, versionList );
	}

	/**
	 * DB로 부터 가져온 "버스위치정보"를 각 지역별로 분류 된 상태의 목록을 받아서 "정주기", "이벤트" 데이터로 분류하여 최대 5개의 행을 하나의 패킷으로 만들어서 보냄
	 * @param ctx 요청한 핸들러
	 * @param origin 지역
	 * @throws EncodeFailedException 인코딩 실패시
	 * @throws EncodeNotSupportedException 인코딩 실패시
	 */
	private void makePublicationData(ChannelHandlerContext ctx, String origin, List<ResultBaseInfoVersion> versionList) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {

		if (!versionList.isEmpty()) {
			List<ResultBaseInfoVersion> sendList = new ArrayList<>();
			for (ResultBaseInfoVersion el : versionList) {
				sendList.add(el);
				if( sendList.size() >= sendCnt ) {
					C2CAuthenticatedMessage data = publication(pubData(sendList), origin, ctx);
					this.testEncoding(data);

					ctx.writeAndFlush(data);
					sendList.clear();
				}

			}

			if( !sendList.isEmpty() ) {
				C2CAuthenticatedMessage data = publication(pubData(sendList), origin, ctx);
				this.testEncoding(data);

				ctx.writeAndFlush(data);
			}
		}
	}

	public void procPeriodicPublication ( ChannelHandlerContext ctx ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {
		List<String> origin = ctx.channel().attr(INFO).get().getOrigin();
		List<ResultBaseInfoVersion> versionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
						.mode("EVENT")
				.origin(origin.stream()
						.map(Integer::parseInt) // 문자열을 정수로 변환
						.collect(Collectors.toList()))
				.build());

		if( versionList.size() != 1 ) return;

		for( RegionCode regionCode : RegionCode.values() ){
			this.makePublicationData(
					ctx,
					regionCode.getRegion(),
					versionList.stream().filter(e-> e.getOrigin().equals(String.valueOf(regionCode.getCode()))).toList());
		}

	}

	/**
	 * 퍼블리케이션을 요청한다.
	 * @param EndAppMsg - event-driven일 경우 데이터가 있으며, null인 경우는 Periodic이다.
	 * @return boolean - true : 정상 수행, false : 비정상 수행
	 */
	public C2CAuthenticatedMessage publication(EndApplicationMessage EndAppMsg, String origin, ChannelHandlerContext ctx ) {
		EndApplicationMessage DatexPublish_Data = EndAppMsg;

		C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
		
		c2c.setDatex_AuthenticationInfo_text(new OctetString());
		c2c.setDatex_DataPacket_number(util.getDataPacketNumber() + 1);
		c2c.setDatex_DataPacketPriority_number(0);

		c2c.setOptions(this.getOptions(origin, ctx));

		PublicationData publicationData = new PublicationData();
		publicationData.setDatexPublish_SubscribeSerial_nbr(util.getSubSerialNbr());
		publicationData.setDatexPublish_Serial_nbr(util.getPubSerialNbr());
		publicationData.setDatexPublish_LatePublicationFlag(false);
		publicationData.setDatexPublish_Type(
				PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublish_Data));
		
		DatexPublish_Data datexPublish_Data = new DatexPublish_Data();
		datexPublish_Data.add(publicationData);

		Publication publication = new Publication();
		publication.setDatexPublish_Guaranteed_bool(ctx.channel().attr(INFO).get().isSubGuarantee());
		publication.setDatexPublish_Format(
				Publish_Format.createPublish_FormatWithDatexPublish_Data(datexPublish_Data));

		c2c.setPdu(PDUs.createPDUsWithPublication(publication));

		return c2c;
	}
	
	/**
	 * 테스트용 퍼블리케이션을 생성한다.
	 * 
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubTestData() {
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = sdf.format(new Date());

		BusBaseInformationVersion BaseinfoVersion = new BusBaseInformationVersion();
		BaseinfoVersion.setTsmg_MessageGenerationTime(new GeneralizedTime(date));
		BaseinfoVersion.setBase_Node_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Link_version(new UTF8String16(date));
		BaseinfoVersion.setBase_LinkCoords_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Station_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Route_version(new UTF8String16(date));
		BaseinfoVersion.setBase_RoutePlan_version(new UTF8String16(date));
		BaseinfoVersion.setBase_RouteStation_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Vehicle_version(new UTF8String16(date));
		BaseinfoVersion.setBase_RouteLink_version(new UTF8String16(date));
		BaseinfoVersion.setBase_RouteAllocate_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Company_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Admin_version(new UTF8String16(date));
		BaseinfoVersion.setBase_Remark(new UTF8String16("버스 기반정보버전 테스트 메세지"));

		Message_MESSAGE_BODY_3 message_MESSAGE_BODY_3 = new Message_MESSAGE_BODY_3();
		message_MESSAGE_BODY_3.add(BaseinfoVersion);

		try {
			DatexPublish_Data
					.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_VERSION_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_3));

		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 버전전정보를 생성한다.
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubData(List<ResultBaseInfoVersion> BaseinfoVersionList) {
		
		Message_MESSAGE_BODY_3 message_MESSAGE_BODY_3 = new Message_MESSAGE_BODY_3();

		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String formattedDateTime = dateTime.format(formatter);

		if (!BaseinfoVersionList.isEmpty()) {
			for (ResultBaseInfoVersion el : BaseinfoVersionList) {

				BusBaseInformationVersion baseInfoVersion = new BusBaseInformationVersion();
				baseInfoVersion.setTsmg_MessageGenerationTime(new GeneralizedTime(util.TimeToString(el.getMessageGenerationTime())));
				if(el.getNodeVersion() != null) {
					baseInfoVersion.setBase_Node_version(new UTF8String16(util.StringToVerTime( formattedDateTime, el.getNodeVersion() )));
				}
				if(el.getNodeVersion() != null) {
					baseInfoVersion.setBase_Link_version(new UTF8String16(util.StringToVerTime( formattedDateTime, el.getLinkVersion() )));
				}
				if(el.getLinkVersion() != null) {
					baseInfoVersion.setBase_LinkCoords_version(new UTF8String16(util.StringToVerTime( formattedDateTime, el.getLinkCoordsVersion())));
				}
				if(el.getStationVersion() != null) {
					baseInfoVersion.setBase_Station_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getStationVersion())));
				}
				if(el.getRouteVersion() != null) {
					baseInfoVersion.setBase_Route_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getRouteVersion())));
				}
				if(el.getRoutePlanVersion() != null) {
					baseInfoVersion.setBase_RoutePlan_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getRoutePlanVersion())));
				}
				if(el.getRouteStationVersion() != null) {
					baseInfoVersion.setBase_RouteStation_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getRouteStationVersion())));
				}
				if(el.getVehicleVersion() != null) {
					baseInfoVersion.setBase_Vehicle_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getVehicleVersion())));
				}
				if(el.getRouteLinkVersion() != null) {
					baseInfoVersion.setBase_RouteLink_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getRouteLinkVersion())));
				}
				if(el.getRouteAllocateVersion() != null) {
					baseInfoVersion.setBase_RouteAllocate_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getRouteAllocateVersion())));
				}
				if(el.getCompanyVersion() != null) {
					baseInfoVersion.setBase_Company_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getCompanyVersion())));
				}
				if(el.getAdminVersion() != null) {
					baseInfoVersion.setBase_Admin_version(new UTF8String16( util.StringToVerTime( formattedDateTime, el.getAdminVersion())));
				}
				baseInfoVersion.setBase_Remark(new UTF8String16(formattedDateTime));

				message_MESSAGE_BODY_3.add(baseInfoVersion);
			}
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_VERSION_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_3));
		
		return DatexPublish_Data;
	}


	public HeaderOptions getOptions(String origin, ChannelHandlerContext ctx) {
		HeaderOptions options = new HeaderOptions();
		options.setDatex_Sender_text(new UTF8String16(sender));

		ChannelAttribute.ChannelInfo channelInfo = ctx.channel().attr(INFO).get();


		if (channelInfo.getDestination() != null) {
			options.setDatex_Destination_text(new UTF8String16(channelInfo.getDestination()));
		}
		if (origin != null) {
			options.setDatex_Origin_text(new UTF8String16(origin));
		}
		options.setDatex_DataPacket_time(util.getCurrentAsnTime());

		return options;
	}
	/**
	 * 스케줄러에서 ctx.writeAndFlush 이전에 인코딩을 테스트 하기 위함.
	 *
	 * @param dummy - 인코딩할 데이터
	 * @throws EncodeFailedException - 인코딩 할때 발생하는 예외를 던짐.
	 * @throws EncodeNotSupportedException - 지원하지 않는 인코딩 포맷일 경우.
	 */
	void testEncoding(C2CAuthenticatedMessage dummy) throws EncodeFailedException, EncodeNotSupportedException, TooLongFrameException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.reset();
		util.getCoder().encode(dummy, baos);
		byte[] encoding = baos.toByteArray();

		DatexDataPacket datexDataPacket = new DatexDataPacket();
		datexDataPacket.setDatex_Version_number(DatexDataPacket.Datex_Version_number.version1);
		datexDataPacket.setDatex_Data(new OctetString(encoding));
		datexDataPacket.setDatex_Crc_nbr(new OctetString(util.getCrc16(encoding)));

		baos.reset();
		util.getCoder().encode(datexDataPacket, baos);

		if (baos.size() > util.getDataGramSize()) {
			throw new TooLongFrameException( "The maximum size of the datagram has been exceeded. Maximum size: %d".formatted(util.getDataGramSize()) );
		}
	}
}
