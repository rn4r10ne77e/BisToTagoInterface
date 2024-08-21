package com.geon.bis.link;

import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import datex.businfomation.ArrivalPredictionTimeInfo;
import datex.iso14827_1.Message_MESSAGE_BODY_2;
import datex.iso14827_2.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
@RequiredArgsConstructor
public class Publication202BusArrvlPrdcInfo {

    private final Util util;


//    private void eventPubProcess () {
//        // 짧은 주기 신규 데이터만 스캔하여 publication (중복데이터 미전송)
//
//        //이벤트정보
//        List<ArrivalPredictionTimeInfoVo> eventList = ServerMapper.getArrivalPredictionTimeInfo_event(origin);
//
//        //중복데이터 제거
//        eventList = checkEventList(eventList);
//
//        if (eventList.size() != 0) {
//            log.info("[버스도착예정정보] 조회건수 : " + eventList.size());
//
//            List<ArrivalPredictionTimeInfoVo> PartList = new ArrayList<ArrivalPredictionTimeInfoVo>();
//
//            for (ArrivalPredictionTimeInfoVo Vo : eventList) {
//                // 메세지를 정의된 개수만큼 쪼개서 보내기
//                Vo.setOrigin(origin);
//                PartList.add(Vo);
//
//                if(PartList.size() >= sendCnt) {
//                    boolean result = publication(pubData(PartList), subSerialNbr, pubSerialNbr);
//                    // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                    if (result) {
//                        sendOk(PartList);
//                        pubSerialNbr++;
//                    }
//                    PartList.clear();
//                }
//
//            }
//
//            // 남은거 보내기
//            if(PartList.size() > 0) {
//                boolean result = publication(pubData(PartList), subSerialNbr, pubSerialNbr);
//                // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                if (result) {
//                    sendOk(PartList);
//                    pubSerialNbr++;
//                }
//            }
//
//        }
//
//    }
//
//    private void periodicPubProcess () {
//        // 주기적으로 전체 데이터 가져와서 publication(중복데이터 전송)
//        Timestamp lastTime = new Timestamp(util.nowTime().getTime() - (10 * 60 * 1000)); // 10분전 타임
//
//        List<ArrivalPredictionTimeInfoVo> AllList = ServerMapper.getArrivalPredictionTimeInfo_pre(origin, util.TimeToString(lastTime), util.TimeToString(lastTime));
//        log.info("[버스도착예정정보] 전체데이터 조회건수 : " + AllList.size());
//
//        if (AllList.size() != 0) {
//            List<ArrivalPredictionTimeInfoVo> PartList = new ArrayList<ArrivalPredictionTimeInfoVo>();
//
//            for (ArrivalPredictionTimeInfoVo Vo : AllList) {
//                // 메세지를 정의된 개수만큼 쪼개서 보내기
//                log.debug("vo결과 : " + Vo.toString());
//                PartList.add(Vo);
//
//                if(PartList.size() >= sendCnt) {
//                    boolean result = publication(pubData(PartList), subSerialNbr, pubSerialNbr);
//                    // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                    if (result) {
//                        pubSerialNbr++;
//                    }
//
//                    PartList.clear();
//                }
//                log.debug("PartList결과 : " + PartList.toString());
//
//            }
//
//            // 남은거 보내기
//            if(PartList.size() > 0) {
//                boolean result = publication(pubData(PartList), subSerialNbr, pubSerialNbr);
//                // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                if (result) {
//                    pubSerialNbr++;
//                }
//            }
//        }
//    }
//
//    private void singlePubProcess () {
//        //단일호출시
//    }
//
//    /**
//     * 퍼블리케이션을 요청한다.
//     * @param oId - 오브젝트 ID
//     * @param EndAppMsg - event-driven일 경우 데이터가 있으며, null인 경우는 Periodic이다.
//     * @param subSerialNbr - 구독 고유번호
//     * @param pubSerialNbr - 전송 고유번호
//     * @return boolean - true : 정상 수행, false : 비정상 수행
//     */
//    private boolean publication(EndApplicationMessage EndAppMsg, long subSerialNbr, long pubSerialNbr) {
//
//        EndApplicationMessage DatexPublish_Data = EndAppMsg;
//
//        if (env.isPUB_TEST_ON()) {
//            log.info("[Publication Test]");
//            // 실시간 정보 테스트 데이터 생성
//            DatexPublish_Data = pubTestData();
//        } else {
//            // 데이터가 없을 경우 패킷을 생성하지 않음.
//            if (DatexPublish_Data == null) {
//                log.info("[No Publication]");
//                return false;
//            }
//
//            log.info("[Publication]");
//        }
//
//
//        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
//        c2c.setDatex_AuthenticationInfo_text(new OctetString());
//        c2c.setDatex_DataPacket_number(serverHandler.getDataPacketNumber() + 1);
//        c2c.setDatex_DataPacketPriority_number(0);
//
//        c2c.setOptions(serverHandler.getOptions(origin));
//
//        PublicationData publicationData = new PublicationData();
//        publicationData.setDatexPublish_SubscribeSerial_nbr(subSerialNbr);
//        publicationData.setDatexPublish_Serial_nbr(pubSerialNbr);
//        publicationData.setDatexPublish_LatePublicationFlag(false);
//        publicationData.setDatexPublish_Type(
//                PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublish_Data));
//		/*
//		PublicationType.createPublicationTypeWithDatexPublication_Management_cd(
//				DatexPublication_Management_cd.temporarilySuspended);
//		*/
//        Publish_Format.DatexPublish_Data datexPublish_Data = new Publish_Format.DatexPublish_Data();
//        datexPublish_Data.add(publicationData);
//
//        Publication publication = new Publication();
//        publication.setDatexPublish_Guaranteed_bool(serverHandler.isSubGuarantee());
//        publication.setDatexPublish_Format(
//                Publish_Format.createPublish_FormatWithDatexPublish_Data(datexPublish_Data));
//
//        c2c.setPdu(PDUs.createPDUsWithPublication(publication));
//
//        log.debug("[Publication 메세지] " + c2c.toString());
//
//        serverHandler.getCtx().writeAndFlush(c2c);
//
//        return true;
//    }
//
//    /**
//     * 테스트용 퍼블리케이션을 생성한다.
//     *
//     * @return EndApplicationMessage
//     */
//    private EndApplicationMessage pubTestData() {
//        EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
//        ArrivalPredictionTimeInfo ArrPTInfo = new ArrivalPredictionTimeInfo();
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
//        String date = sdf.format(new Date());
//
//        //메시지 발생시각
//        ArrPTInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(date));
//        //이벤트 분류코드
//        ArrPTInfo.setTpfc_BusEventCodeNumber(ArrivalPredictionTimeInfo.Tpfc_BusEventCodeNumber.valueOf(3));
//        //정류장 ID
//        ArrPTInfo.setTpif_BITIdentifyNumber(new UTF8String16("TESTBIT001"));
//        //노선 ID
//        ArrPTInfo.setTpif_SubRouteIdentityNumber(new UTF8String16("TESTROUTE001"));
//        //차량 ID
//        ArrPTInfo.setTsfc_PTVehicleIDNumber(new UTF8String16("TESTVEHICLE001"));
//        //도착 예정시간
//        ArrPTInfo.setTpif_AccesspointArrivalTime(60);
//        //남은 정류장 수
//        ArrPTInfo.setTpif_AccesspointArrivalCount(1);
//
//        Message_MESSAGE_BODY_2 message_MESSAGEBODY_2 = new Message_MESSAGE_BODY_2();
//        message_MESSAGEBODY_2.add(ArrPTInfo);
//
//
//        try {
//            DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.ARR_PRE_TIME_INFO_RESP));
//        } catch (BadObjectIdentifierException e) {
//            log.error(e.getMessage());
//        }
//
//        DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGEBODY_2));
//
//        return DatexPublish_Data;
//    }
//
//    /**
//     * 주기방식 버스도착예정정보 퍼블리케이션을 생성한다.
//     *
//     * @param List<ArrivalPredictionTimeInfoVo>
//     * @return EndApplicationMessage
//     */
//    private EndApplicationMessage pubData(List<ArrivalPredictionTimeInfoVo> ArrivalPredictionTimeInfoList) {
//
//        EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
//
//        Message_MESSAGE_BODY_2 message_MESSAGEBODY_2 = new Message_MESSAGE_BODY_2();
//
//        try {
//
//            if (ArrivalPredictionTimeInfoList.size() != 0) {
//
//                for (ArrivalPredictionTimeInfoVo Vo : ArrivalPredictionTimeInfoList) {
//
//                    ArrivalPredictionTimeInfo ArrPTInfo = new ArrivalPredictionTimeInfo();
//
//                    //메시지 발생시각
//                    ArrPTInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(util.TimeToString(Vo.getMessageGenerationTime())));
//                    //이벤트 분류코드
//                    if (Vo.getBusEventCodeNumber() != -1) {
//                        ArrPTInfo.setTpfc_BusEventCodeNumber(
//                                ArrivalPredictionTimeInfo.Tpfc_BusEventCodeNumber.valueOf(Long.valueOf(Vo.getBusEventCodeNumber())));
//                    } else {
//                        ArrPTInfo.setTpfc_BusEventCodeNumber(ArrivalPredictionTimeInfo.Tpfc_BusEventCodeNumber.fixed_Cycle);
//                    }
//
//                    //정류장 ID
//                    ArrPTInfo.setTpif_BITIdentifyNumber(new UTF8String16(Vo.getBITIdentityNumber()));
//                    //노선 ID
//                    ArrPTInfo.setTpif_SubRouteIdentityNumber(new UTF8String16(Vo.getSubRouteIdentityNumber()));
//                    //차량 ID
//                    ArrPTInfo.setTsfc_PTVehicleIDNumber(new UTF8String16(Vo.getPTVehicleIDNumber()));
//                    //도착 예정시간
//                    ArrPTInfo.setTpif_AccesspointArrivalTime(Vo.getAccesspoINTArrivalTime());
//                    //남은 정류장 수
//                    ArrPTInfo.setTpif_AccesspointArrivalCount(Vo.getAccesspoINTArrivalCount());
//                    //출발(최근통과) 정류장 ID
//                    if (Vo.getLastBITIdentifyNumber() != null) {
//                        ArrPTInfo.setTpif_LastBITIdentifyNumber(new UTF8String16(Vo.getLastBITIdentifyNumber()));
//                    }
//                    //노선 내 순번
//                    ArrPTInfo.setTsvh_NodeRouteSequence(Vo.getNodeRouteSequence());
//                    //(최근통과정류장)진입시각
//                    ArrPTInfo.setTsvh_LastBITZoneEntryTime(new GeneralizedTime(util.TimeToString(Vo.getLastBITZoneEntryTime())));
//                    //(최근통과정류장)진출시각
//                    if (Vo.getLastBITZoneExitTime() != null) {
//                        ArrPTInfo.setTsvh_LastBITZoneExitTime(new GeneralizedTime(util.TimeToString(Vo.getLastBITZoneExitTime())));
//                    }
//                    //(최근통과정류장)통과시간
//                    ArrPTInfo.setTsvh_LastBITZoneTripTime(Vo.getLastBITZoneTripTime());
//                    //평균 통행속도
//                    ArrPTInfo.setTsvh_RollingAverageSpeedRate(Vo.getRollingAverageSpeedRate());
//                    //막차 정보
//                    ArrPTInfo.setTsfc_LastPTVehicle(Vo.isLastPTVehicle());
//                    //종점 정류장 ID
//                    ArrPTInfo.setTpif_EndNodeZoneIDNumber(new UTF8String16(Vo.getEndNodeZoneIDNumber()));
//                    //종점 정류장의 노선 내 순번
//                    ArrPTInfo.setTpif_EndNodeRouteSequence(Vo.getEndNodeRouteSequence());
//                    //총 좌석 수
//                    ArrPTInfo.setTsfc_BusTotalSeatsNumber(Vo.getBusTotalSeatsNumber());
//                    //버스 재차 인원
//                    ArrPTInfo.setTsfc_BusPassengerNumber(Vo.getBusPassengerNumber());
//                    //버스 잔여 좌석 정보
//                    ArrPTInfo.setTsfc_BusRemainSeatsNumber(Vo.getBusRemainSeatsNumber());
//
//                    message_MESSAGEBODY_2.add(ArrPTInfo);
//
//                }
//            }
//
//
//
//            DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.ARR_PRE_TIME_INFO_RESP));
//            DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGEBODY_2));
//
//            log.trace(DatexPublish_Data.toString());
//
//        } catch (BadObjectIdentifierException e) {
//            log.error(e.getMessage());
//        }
//
//        return DatexPublish_Data;
//    }
//
//    /**
//     * 버스도착예정정보 메세지중 전송된 중복 메세지를 제거한다.
//     *
//     * @param List<BusLocationInfoVo>
//     * @return List<BusLocationInfoVo>
//     */
//    private List<ArrivalPredictionTimeInfoVo> checkEventList(List<ArrivalPredictionTimeInfoVo> lists) {
//        List<ArrivalPredictionTimeInfoVo> result = new ArrayList<ArrivalPredictionTimeInfoVo>();
//
//        for(ArrivalPredictionTimeInfoVo vo:lists) {
//            // 각 라인별로 hash 코드 생성
//            int context = vo.toString().hashCode();
//            String key = vo.getBITIdentityNumber()+"-"+vo.getPTVehicleIDNumber();
//
//            if (eventHashMap.containsKey(key)) {
//                int hashValue = eventHashMap.get(key);
//                if (hashValue != context) {
//                    //vehicle_id 가 존재하나 hash 값이 다른경우 라인에 추가
//                    result.add(vo);
//                    eventHashMap.put(key, context);
//                }
//            } else {
//                //vehicle_id가 없는 경우 라인에 추가
//                result.add(vo);
//                eventHashMap.put(key, context);
//            }
//        }
//        log.debug("[중복제거 Resul개수] "+ result.size());
//        return result;
//    }
//
//    private void sendOk(List<ArrivalPredictionTimeInfoVo> lists) {
//        log.debug("[sendok] ArrivalPredictionTimeInfo (send : " + lists.size() + " 건)");
//        for(ArrivalPredictionTimeInfoVo Vo : lists) {
//            ServerMapper.sendOk_ArrivalPredictionTimeInfo_event(Vo);
//        }
//    }
}
