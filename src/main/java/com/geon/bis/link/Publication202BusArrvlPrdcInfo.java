package com.geon.bis.link;

import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.config.RegionCode;
import com.geon.bis.link.mapper.BusArrvlPrdcInfoMapper;
import com.geon.bis.link.mapper.model.ParamArrivalPredictionTimeInfo;
import com.geon.bis.link.mapper.model.ResultArrivalPredictionTimeInfo;
import com.geon.bis.link.tago.config.Common;
import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import datex.businfomation.ArrivalPredictionTimeInfo;
import datex.iso14827_1.Message_MESSAGE_BODY_2;
import datex.iso14827_2.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.TooLongFrameException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.ByteArrayOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import static com.geon.bis.link.config.ChannelAttribute.INFO;

@Slf4j
@Component
@RequiredArgsConstructor
public class Publication202BusArrvlPrdcInfo {

    private final Util util;
    private final BusArrvlPrdcInfoMapper busArrvlPrdcInfoMapper;

    @Value("${server.sender}")
    private String sender;
    @Value("${server.sendCnt}")
    private int sendCnt;


    private void makePublicationData(ChannelHandlerContext ctx, String origin, List<ResultArrivalPredictionTimeInfo> busList) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {

        if (!busList.isEmpty()) {
            List<ResultArrivalPredictionTimeInfo> countedList = new ArrayList<>();
            for (ResultArrivalPredictionTimeInfo el : busList) {

                countedList.add(el);

                if( countedList.size() >= sendCnt ) {
                    C2CAuthenticatedMessage data = publication(pubData(countedList), origin, ctx);
                    this.testEncoding(data);
                    ctx.writeAndFlush(data);
                    countedList.clear();
                }
            }

            if( !countedList.isEmpty() ) {
                C2CAuthenticatedMessage data = publication(pubData(countedList), origin, ctx);
                this.testEncoding(data);
                ctx.writeAndFlush(data);
            }
        }
    }
    @Transactional
    public void procSinglePublication ( ChannelHandlerContext ctx, String requiredOrigin ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {
        List<Integer> origin = List.of(RegionCode.findByRegion(requiredOrigin).getCode());
        List<ResultArrivalPredictionTimeInfo> busList = busArrvlPrdcInfoMapper.getBusArr(ParamArrivalPredictionTimeInfo.builder()
          .beforeMinute(0)
          .mode("SINGLE")
          .origin(origin)
          .build());

        this.makePublicationData( ctx, requiredOrigin, busList );
    }
    @Transactional
    public void procEventPublication ( ChannelHandlerContext ctx, String requiredOrigin ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {
        List<Integer> origin = List.of(RegionCode.findByRegion(requiredOrigin).getCode());
        List<ResultArrivalPredictionTimeInfo> busList = busArrvlPrdcInfoMapper.getBusArr(ParamArrivalPredictionTimeInfo.builder()
          .beforeMinute(1)
          .mode("EVENT")
          .origin(origin)
          .build());
        log.debug("data cnt : {}",busList.size());
        makePublicationData( ctx, requiredOrigin, busList );

    }

    private C2CAuthenticatedMessage publication(EndApplicationMessage EndAppMsg, String origin, ChannelHandlerContext ctx ) {
        ChannelAttribute.ChannelInfo info = ctx.channel().attr(INFO).get();

        EndApplicationMessage DatexPublish_Data = EndAppMsg;

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number( info.getDataPacketNumber() );
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(this.getOptions(origin, ctx));

        PublicationData publicationData = new PublicationData();
        publicationData.setDatexPublish_SubscribeSerial_nbr(info.getSubSerialNbr());
        publicationData.setDatexPublish_Serial_nbr(info.getPubSerialNbr());
        publicationData.setDatexPublish_LatePublicationFlag(false);
        publicationData.setDatexPublish_Type(
                PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublish_Data));
		/*
		PublicationType.createPublicationTypeWithDatexPublication_Management_cd(
				DatexPublication_Management_cd.temporarilySuspended);
		*/
        Publish_Format.DatexPublish_Data datexPublish_Data = new Publish_Format.DatexPublish_Data();
        datexPublish_Data.add(publicationData);

        Publication publication = new Publication();
        publication.setDatexPublish_Guaranteed_bool(ctx.channel().attr(INFO).get().isSubGuarantee());
        publication.setDatexPublish_Format(
                Publish_Format.createPublish_FormatWithDatexPublish_Data(datexPublish_Data));

        c2c.setPdu(PDUs.createPDUsWithPublication(publication));
        return c2c;
    }

    private EndApplicationMessage pubData(List<ResultArrivalPredictionTimeInfo> ArrivalPredictionTimeInfoList) {

        EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();

        Message_MESSAGE_BODY_2 message_MESSAGEBODY_2 = new Message_MESSAGE_BODY_2();

        try {

            if (!ArrivalPredictionTimeInfoList.isEmpty()) {

                for (ResultArrivalPredictionTimeInfo el : ArrivalPredictionTimeInfoList) {

                    ArrivalPredictionTimeInfo ArrPTInfo = new ArrivalPredictionTimeInfo();

                    //메시지 발생시각
                    ArrPTInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(util.TimeToString(Timestamp.from(el.getMessageGenerationTime().toInstant()))));
                    //이벤트 분류코드
                    ArrPTInfo.setTpfc_BusEventCodeNumber(ArrivalPredictionTimeInfo.Tpfc_BusEventCodeNumber.enter_BusStop);
                    //정류장 ID
                    ArrPTInfo.setTpif_BITIdentifyNumber(new UTF8String16(el.getBITIdentityNumber()));
                    //노선 ID
                    ArrPTInfo.setTpif_SubRouteIdentityNumber(new UTF8String16(el.getSubRouteIdentityNumber()));
                    //차량 ID
                    ArrPTInfo.setTsfc_PTVehicleIDNumber(new UTF8String16(el.getPTVehicleIDNumber()));
                    //도착 예정시간
                    ArrPTInfo.setTpif_AccesspointArrivalTime(el.getAccesspoINTArrivalTime());
                    //남은 정류장 수
                    ArrPTInfo.setTpif_AccesspointArrivalCount(el.getAccesspoINTArrivalCount());
                    //출발(최근통과) 정류장 ID
                    if (el.getLastBITIdentifyNumber() != null) {
                        ArrPTInfo.setTpif_LastBITIdentifyNumber(new UTF8String16(el.getLastBITIdentifyNumber()));
                    }
                    //노선 내 순번
                    ArrPTInfo.setTsvh_NodeRouteSequence(el.getNodeRouteSequence());
                    //(최근통과정류장)진입시각
                    ArrPTInfo.setTsvh_LastBITZoneEntryTime(new GeneralizedTime(util.TimeToString(Timestamp.from(el.getLastBITZoneEntryTime().toInstant()))));
                    //(최근통과정류장)진출시각
                    if (el.getLastBITZoneExitTime() != null) {
                        ArrPTInfo.setTsvh_LastBITZoneExitTime(new GeneralizedTime(util.TimeToString(Timestamp.from(el.getLastBITZoneExitTime().toInstant()))));
                    }
                    //(최근통과정류장)통과시간
                    ArrPTInfo.setTsvh_LastBITZoneTripTime(el.getLastBITZoneTripTime());
                    //평균 통행속도
                    ArrPTInfo.setTsvh_RollingAverageSpeedRate(el.getRollingAverageSpeedRate());
                    //막차 정보
                    ArrPTInfo.setTsfc_LastPTVehicle(el.isLastPTVehicle());
                    //종점 정류장 ID
                    ArrPTInfo.setTpif_EndNodeZoneIDNumber(new UTF8String16(el.getEndNodeZoneIDNumber()));
                    //종점 정류장의 노선 내 순번
                    ArrPTInfo.setTpif_EndNodeRouteSequence(el.getEndNodeRouteSequence());
                    //총 좌석 수
                    ArrPTInfo.setTsfc_BusTotalSeatsNumber(el.getBusTotalSeatsNumber());
                    //버스 재차 인원
                    ArrPTInfo.setTsfc_BusPassengerNumber(el.getBusPassengerNumber());
                    //버스 잔여 좌석 정보
                    ArrPTInfo.setTsfc_BusRemainSeatsNumber(el.getBusRemainSeatsNumber());

                    message_MESSAGEBODY_2.add(ArrPTInfo);

                }
            }



            DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.ARR_PRE_TIME_INFO_RESP));
            DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGEBODY_2));

            log.trace(DatexPublish_Data.toString());

        } catch (BadObjectIdentifierException e) {
            log.error(e.getMessage());
        }

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
     * @throws EncodeFailedException -
     * @throws EncodeNotSupportedException -
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
