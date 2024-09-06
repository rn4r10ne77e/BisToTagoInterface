package com.geon.bis.link;

import com.geon.bis.link.mapper.BaseInfoVersionMapper;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import datex.businfomation.BusBaseInformationVersion;
import datex.iso14827_1.Message_MESSAGE_BODY_3;
import datex.iso14827_2.*;
import datex.iso14827_2.Publish_Format.DatexPublish_Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//버스기반정보에대한 퍼블리케이션 모듈 이벤트, 주기방식 구독에대한 스케쥴 실행
//버스기반정보는 기반정보 버전정보를 모듈 시동시 동기화 하고, 이후 버전정보를 이벤트로 수신하며, 버전정보 변경시 해당 정보 전송하는 방식으로 진행
@Slf4j
@Component
@RequiredArgsConstructor
public class Publication207BaseInfoVersion {

	private final Util util;
	private final BaseInfoVersionMapper baseInfoVersionMapper;

	private void eventPubProcess () {
		// 버전정보 확인후 전달 이벤트 방식
		
		// 테스트모드 확인
		if (env.isPUB_TEST_ON()) {
			log.info("[" + clienID + "]["+ origin +"][BaseinfoVersion][Publication Test]");
			boolean result = publication(pubTestData(), subSerialNbr, pubSerialNbr);
			// 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
			if (result) {
				pubSerialNbr++;
			}
			
		} else {
			//이벤트정보
			List<BaseinfoVersionVo> eventList = ServerMapper.getBaseinfoVersion(origin);
			// 이벤트 정보가 이전과 동일한지 검사
			eventList = checkEventList(eventList);
			
			if (eventList.size() == 1) {
				boolean result = publication(pubData(eventList), subSerialNbr, pubSerialNbr);
				// 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
				if (result) {
					pubSerialNbr++;
				}
				
				// msgTime 마지막 시간으로 업데이트
				for(BaseinfoVersionVo Vo : eventList) {
					int cloneChk = msgTime.compareTo(Vo.getMessageGenerationTime());
					log.trace("[msgTime] " + msgTime + " [MessageGenerationTime] "+Vo.getMessageGenerationTime());
					if (cloneChk < 0) {
						msgTime = Vo.getMessageGenerationTime();
						log.debug("[BaseinfoVersion][msgTime]" + msgTime);
					}
				}
			}
		}
	}
	
	private void periodicPubProcess () {
		// 테스트모드 확인
		if (env.isPUB_TEST_ON()) {
			log.info("[" + clienID + "][Publication Test]");
			boolean result = publication(pubTestData(), subSerialNbr, pubSerialNbr);
			// 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
			if (result) {
				pubSerialNbr++;
			}
			
		} else {
			//이벤트정보
			List<BaseinfoVersionVo> eventList = ServerMapper.getBaseinfoVersion(origin);
			
			if (eventList.size() == 1) {
				boolean result = publication(pubData(eventList), subSerialNbr, pubSerialNbr);
				// 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
				if (result) {
					pubSerialNbr++;
				}
				
			}
		}
	}
	
	private void procSinglePublication() {

		List<BaseinfoVersionVo> eventList = ServerMapper.getBaseinfoVersion(origin);

		if (eventList.size() == 1) {
			boolean result = publication(pubData(eventList), subSerialNbr, pubSerialNbr);
			// 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
			if (result) {
				pubSerialNbr++;
			}
		}

	}
	
	/**
	 * 퍼블리케이션을 요청한다.
	 * @param oId - 오브젝트 ID
	 * @param EndAppMsg - event-driven일 경우 데이터가 있으며, null인 경우는 Periodic이다.
	 * @param subSerialNbr - 구독 고유번호
	 * @param pubSerialNbr - 전송 고유번호
	 * @return boolean - true : 정상 수행, false : 비정상 수행
	 */
	private boolean publication(EndApplicationMessage EndAppMsg, long subSerialNbr, long pubSerialNbr) {
		EndApplicationMessage DatexPublish_Data = EndAppMsg;

		C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
		
		c2c.setDatex_AuthenticationInfo_text(new OctetString());
		c2c.setDatex_DataPacket_number(serverHandler.getDataPacketNumber() + 1);
		c2c.setDatex_DataPacketPriority_number(0);

		c2c.setOptions(serverHandler.getOptions(origin));

		PublicationData publicationData = new PublicationData();
		publicationData.setDatexPublish_SubscribeSerial_nbr(subSerialNbr);
		publicationData.setDatexPublish_Serial_nbr(pubSerialNbr);
		publicationData.setDatexPublish_LatePublicationFlag(false);
		publicationData.setDatexPublish_Type(
				PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublish_Data));
		
		DatexPublish_Data datexPublish_Data = new DatexPublish_Data();
		datexPublish_Data.add(publicationData);

		Publication publication = new Publication();
		publication.setDatexPublish_Guaranteed_bool(serverHandler.isSubGuarantee());
		publication.setDatexPublish_Format(
				Publish_Format.createPublish_FormatWithDatexPublish_Data(datexPublish_Data));

		c2c.setPdu(PDUs.createPDUsWithPublication(publication));
		
		log.debug("[" + clienID + "][Publication 메세지] " + c2c.toString());

		serverHandler.getCtx().writeAndFlush(c2c);

		return true;
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
	 * 
	 * @param oId
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubData(List<BaseinfoVersionVo> BaseinfoVersionList) {
		
		Message_MESSAGE_BODY_3 message_MESSAGE_BODY_3 = new Message_MESSAGE_BODY_3();
		log.debug("[" + clienID + "][BaseinfoVersion]" + BaseinfoVersionList.toString());
		
		if (BaseinfoVersionList.size() != 0) {
			for (BaseinfoVersionVo Vo : BaseinfoVersionList) {
				BusBaseInformationVersion BaseinfoVersion = new BusBaseInformationVersion();
				BaseinfoVersion.setTsmg_MessageGenerationTime(new GeneralizedTime(util.TimeToString(Vo.getMessageGenerationTime())));
				if(Vo.getNodeVersion() != null) {
					BaseinfoVersion.setBase_Node_version(new UTF8String16(Vo.getNodeVersion()));	
				}
				if(Vo.getNodeVersion() != null) {
					BaseinfoVersion.setBase_Link_version(new UTF8String16(Vo.getLinkVersion()));
				}
				if(Vo.getLinkVersion() != null) {
					BaseinfoVersion.setBase_LinkCoords_version(new UTF8String16(Vo.getLinkCoordsVersion()));
				}
				if(Vo.getStationVersion() != null) {
					BaseinfoVersion.setBase_Station_version(new UTF8String16(Vo.getStationVersion()));
				}
				if(Vo.getRouteVersion() != null) {
					BaseinfoVersion.setBase_Route_version(new UTF8String16(Vo.getRouteVersion()));
				}
				if(Vo.getRouteplanVersion() != null) {
					BaseinfoVersion.setBase_RoutePlan_version(new UTF8String16(Vo.getRouteplanVersion()));
				}
				if(Vo.getRoutestationVersion() != null) {
					BaseinfoVersion.setBase_RouteStation_version(new UTF8String16(Vo.getRoutestationVersion()));
				}
				if(Vo.getVehicleVersion() != null) {
					BaseinfoVersion.setBase_Vehicle_version(new UTF8String16(Vo.getVehicleVersion()));
				}
				if(Vo.getRoutelinkVersion() != null) {
					BaseinfoVersion.setBase_RouteLink_version(new UTF8String16(Vo.getRoutelinkVersion()));
				}
				if(Vo.getRouteallocateVersion() != null) {
					BaseinfoVersion.setBase_RouteAllocate_version(new UTF8String16(Vo.getRouteallocateVersion()));
				}
				if(Vo.getCompanyVersion() != null) {
					BaseinfoVersion.setBase_Company_version(new UTF8String16(Vo.getCompanyVersion()));
				}
				if(Vo.getAdminVersion() != null) {
					BaseinfoVersion.setBase_Admin_version(new UTF8String16(Vo.getAdminVersion()));
				}
				if(Vo.getRemark() != null) {
					BaseinfoVersion.setBase_Remark(new UTF8String16(Vo.getRemark()));
				}			
				
				message_MESSAGE_BODY_3.add(BaseinfoVersion);
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
	
	/**
	 * 버스 기반정보 버전정보 이벤트 메세지중 이전에 전송된 메세지인지 확인
	 * 
	 * @param List<BusLocationInfoVo>
	 * @return List<BusLocationInfoVo>
	 */
	private List<ResultBaseInfoVersion> checkEventList(List<ResultBaseInfoVersion> lists) {
		List<ResultBaseInfoVersion> result = new ArrayList<ResultBaseInfoVersion>();
		
		if(lists.size() == 1) {
			for(ResultBaseInfoVersion vo:lists) {

				// 각 라인별로 hash 코드 생성
				int context = vo.toString().hashCode();		
	            if (hashValue != context) {
	            	//이전 값과 다르면 추가
	            	result.add(vo);
	            	hashValue = context;
	            }
			}
		}
		
		log.debug("[" + clienID + "][BaseinfoVersion][중복제거 Resul개수] "+ result.size());
		return result;
	}
}
