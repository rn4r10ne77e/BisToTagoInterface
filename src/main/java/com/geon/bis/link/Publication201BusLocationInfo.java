package com.geon.bis.link;

import com.geon.bis.link.config.BusRunEventCode;
import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.mapper.BusLocationInfoMapper;
import com.geon.bis.link.mapper.model.ParamBusLocationInfo;
import com.geon.bis.link.mapper.model.ResultBusLocationInfo;
import com.geon.bis.link.tago.config.Common;
import com.geon.bis.link.tago.config.Util;
//import com.geon.bis.link.tago.datex.iso14827_2.*;
import datex.businfomation.BusLocationEvent;
import datex.businfomation.BusLocationInfo;
import datex.businfomation.BusLocationPolling;
import datex.businfomation.NMEACoord;
import datex.iso14827_1.Message_MESSAGE_BODY_1;
import datex.iso14827_2.*;
import datex.iso14827_2.Publish_Format.DatexPublish_Data;
import com.oss.asn1.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.TooLongFrameException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import static com.geon.bis.link.config.ChannelAttribute.INFO;
import static datex.iso14827_2.Publish_Format.createPublish_FormatWithDatexPublish_Data;

@Slf4j
@Component
@RequiredArgsConstructor
public class Publication201BusLocationInfo {

    private final BusLocationInfoMapper busLocationInfoMapper;
    private final Util util;

    @Value("${server.sender}")
    private String sender;
    @Value("${server.server-pub-test-on}")
    private boolean serverPubTestOn;
    @Value("${server.sendCnt}")
    private int sendCnt;

    public void procPeriodicPublication (ChannelHandlerContext ctx) throws Exception {
        // 일정주기 10분이내 데이터(col, msg 둘중 하나라도 10분이내) 조회하여 전체 전송
        // 주기적으로 전체 데이터 가져와서 publication(중복데이터 전송)
        try {
//            Timestamp lastTime = new Timestamp(util.nowTime().getTime() - (10 * 60 * 1000)); // 10분전 타임
            String origin = ctx.channel().attr(INFO).get().getOrigin().get(0);
            log.info("start");
            List<ResultBusLocationInfo> busList = busLocationInfoMapper.find(ParamBusLocationInfo.builder()
                    .stdTime(ZonedDateTime.now(ZoneId.of("Asia/Seoul")).minusMinutes(1))
                    .origin(origin)
                    .build());
            log.debug("list size: {}", busList.size());

            if (!busList.isEmpty()) {
                List<ResultBusLocationInfo> part = new ArrayList<>();
                for (ResultBusLocationInfo el : busList) {

                    // 메세지를 정의된 개수만큼 쪼개서 보내기
                    part.add(el);
                    if(part.size() >= sendCnt) {
                        // 구분 할 수 있는 플래그값 필요
    //                    ctx.writeAndFlush(publication(makePublishDataBusEvent(part), util.getSubSerialNbr(), util.getPubSerialNbr(), origin, ctx));
                        C2CAuthenticatedMessage data = publication(makePublishDataPeriodPolling(part), util.getSubSerialNbr(), util.getPubSerialNbr(), origin, ctx);
                        this.testEncoding(data);
                        ctx.writeAndFlush(data);

                        part.clear();
                    }
                    if(!part.isEmpty()) {
                        // 구분 할 수 있는 플래그값 필요
    //                ctx.writeAndFlush(publication(makePublishDataBusEvent(part), util.getSubSerialNbr(), util.getPubSerialNbr(), origin, ctx));
                        C2CAuthenticatedMessage data = publication(makePublishDataPeriodPolling(part), util.getSubSerialNbr(), util.getPubSerialNbr(), origin, ctx);
                        this.testEncoding(data);
                        ctx.writeAndFlush(data);

                    }
                }
            }
        } catch ( Exception e) {
            throw new Exception(e);
        }
    }


    private BusLocationInfo CommonDataGen(ResultBusLocationInfo el) {

        BusLocationInfo busLocationInfo = new BusLocationInfo();
        //차량 ID
        busLocationInfo.setTsfc_PTVehicleIDNumber(new UTF8String16(el.getPTVehicleIDNumber()));
        //노선 ID
        busLocationInfo.setTpif_SubRouteIdentityNumber(new UTF8String16(el.getSubRouteIdentityNumber()));
        //이벤트 분류코드
        switch (el.getBusEventCodeNumber()){
            case 11:
                busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.enter_BusStop);
                break;
            case 12:
                busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.exit_BusStop);
                break;
            case 21:
                busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.fixed_Cycle);
                break;

            default: busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.pass_Cross);
        }

//        if (el.getBusEventCodeNumber() != -1) {
//            busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.valueOf(Long.valueOf(el.getBusEventCodeNumber())));
//        } else {
//            busLocationInfo.setTpfc_BusEventCodeNumber(BusLocationInfo.Tpfc_BusEventCodeNumber.exit_BusStop);
//        }

        // 운행 조건 코드
        if (el.getBusRunCodeNumber() != -1) {
            busLocationInfo.setTpfc_BusRunCodeNumber(
                    BusLocationInfo.Tpfc_BusRunCodeNumber.valueOf(Long.valueOf(el.getBusRunCodeNumber())));
        } else {
            busLocationInfo.setTpfc_BusRunCodeNumber(BusLocationInfo.Tpfc_BusRunCodeNumber.normal_Run);
        }

        //막차 정보
        busLocationInfo.setTsfc_LastPTVehicle(el.isLastPTVehicle());

        // 종점 정류장 ID
        if(el.getEndNodeZoneIDNumber() != null) {
            busLocationInfo.setTpif_EndNodeZoneIDNumber(new UTF8String16(el.getEndNodeZoneIDNumber()));
        }

        // 종점 정류장의 노선 내 순번
        if(el.getEndNodeRouteSequence() != -1) {
            busLocationInfo.setTpif_EndNodeRouteSequence(el.getEndNodeRouteSequence());
        }

        // 총 좌석 수
        if(el.getBusTotalSeatsNumber() != -1) {
            busLocationInfo.setTsfc_BusTotalSeatsNumber(el.getBusTotalSeatsNumber());
        }

        // 버스 재차 인원
        if(el.getBusPassengerNumber() != -1) {
            busLocationInfo.setTsfc_BusPassengerNumber(el.getBusPassengerNumber());
        }

        // 버스 잔여 좌석 정보
        if(el.getBusRemainSeatsNumber() != -1) {
            busLocationInfo.setTsfc_BusRemainSeatsNumber(el.getBusRemainSeatsNumber());
        }

        return busLocationInfo;
    }
    /**
     * 버스위치정보 이벤트메세지를 생성한다.
     *
     * @return BusLocationEvent
     */
    private BusLocationEvent EventDataGen(ResultBusLocationInfo el) {

        //메시지 발생시각, 이벤트 정보 수집 노드 ID, 노선 내 순번
        BusLocationEvent busLocationEvent = new BusLocationEvent(
                new GeneralizedTime(util.TimeToString(Timestamp.valueOf(el.getMessageGenerationTime().toLocalDateTime()))),
                new UTF8String16(el.getNodeZoneIDNumber()), el.getNodeRouteSequence());

        //노드 진입시각
        if (el.getNodeZoneEntryTime() != null) {
            busLocationEvent.setTsvh_NodeZoneEntryTime(new GeneralizedTime(util.TimeToString(Timestamp.valueOf(el.getNodeZoneEntryTime().toLocalDateTime()))));
        }
        //노드 진출시각
        if (el.getNodeZoneExitTime() != null) {
            busLocationEvent.setTsvh_NodeZoneExitTime(new GeneralizedTime(util.TimeToString(Timestamp.valueOf(el.getNodeZoneExitTime().toLocalDateTime()))));
        }
        //노드 통행시간
        if (el.getNodeZoneTripTime() != -1) {
            busLocationEvent.setTsvh_NodeZoneTripTime(el.getNodeZoneTripTime());
        }

        return busLocationEvent;
    }
    /**
     * 버스위치정보 정주기 메세지를 생성한다.
     * @param el ResultBusLocationInfo
     * @return EndApplicationMessage
     * @return BusLocationPolling
     */
    private BusLocationPolling pollingDataGen(ResultBusLocationInfo el) {
        BusLocationPolling busLocationPolling = new BusLocationPolling();

        //GPS_LATI
        String latiFrac = String.valueOf(el.getPTVehicleCoordinateLati()).split("\\.")[1];
        //GPS_LONG
        String longFrac = String.valueOf(el.getPTVehicleCoordinateLong()).split("\\.")[1];

        NMEACoord.Latitude latitude = new NMEACoord.Latitude((int) el.getPTVehicleCoordinateLati(), Long.valueOf(latiFrac),
                latiFrac.length(), NMEACoord.Latitude.Compass1.north);
        NMEACoord.Longitude longitude = new NMEACoord.Longitude((int) el.getPTVehicleCoordinateLong(), Long.valueOf(longFrac),
                longFrac.length(), NMEACoord.Longitude.Compass2.east);

        NMEACoord nMEACoord = new NMEACoord(latitude, longitude);
        busLocationPolling.setTsfc_PTVehicleCoordinate(nMEACoord);

        //위치정보 수집시각
        if (el.getPTVehicleCollectedTime() != null) {
            busLocationPolling.setTsfc_PTVehicleCollectedTime(
                    new GeneralizedTime(util.TimeToString(Timestamp.valueOf(el.getPTVehicleCollectedTime().toLocalDateTime()))));
        }

        //정보수집주기
        if (el.getPTVehicleCollectedCycleTime() != -1) {
            busLocationPolling.setTsfc_PTVehicleCollectedCycleTime(el.getPTVehicleCollectedCycleTime());
        }

        return busLocationPolling;
    }
    /**
     * 주기방식 버스위치정보 ( 버스이벤트 ) 퍼블리케이션을 생성한다.
     * @param BusLocationList List of ResultBusLocationInfo
     * @return EndApplicationMessage
     */
    private EndApplicationMessage makePublishDataBusEvent(List<ResultBusLocationInfo> BusLocationList ) {

        Message_MESSAGE_BODY_1 message_MESSAGEBODY_1 = new Message_MESSAGE_BODY_1();
        log.debug("pubPeriodicEventData 1" + BusLocationList.toString());

        if (!BusLocationList.isEmpty()) {
            for (ResultBusLocationInfo el : BusLocationList) {
                log.debug("pubPeriodicEventData 2" + el.toString());
                //공통메세지 생성
                BusLocationInfo busLocationInfo = CommonDataGen(el);

                //이벤트 정보
                if(el.getMessageGenerationTime() != null || el.getNodeZoneIDNumber() != null || el.getNodeRouteSequence() != -1) {

                    busLocationInfo.setBusLocationInfoType(BusLocationInfo.BusLocationInfoType.createBusLocationInfoTypeWithBusLocationEvent(EventDataGen(el)));

                    message_MESSAGEBODY_1.add(busLocationInfo);
                    log.debug("버스이벤트 추가 : " + message_MESSAGEBODY_1);
                }
            }
        }

        EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();

        try {
            DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BUS_LOC_INFO_RESP));
        } catch (BadObjectIdentifierException e) {
            log.error(e.getMessage());
        }

        DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGEBODY_1));

        return DatexPublish_Data;
    }
    /**
     * 주기방식 버스위치정보 ( 정주기 ) 퍼블리케이션을 생성한다.
     *
     * @return EndApplicationMessage
     */
    private EndApplicationMessage makePublishDataPeriodPolling(List<ResultBusLocationInfo> BusLocationList) {

        Message_MESSAGE_BODY_1 message_MESSAGEBODY_1 = new Message_MESSAGE_BODY_1();

        if (!BusLocationList.isEmpty()) {
            for (ResultBusLocationInfo el : BusLocationList) {
                //공통메세지 생성
                BusLocationInfo busLocationInfo = CommonDataGen(el);

                //정주기 정보
                if(el.getPTVehicleCoordinateLati() != 0.0f && el.getPTVehicleCoordinateLong() != 0.0f ) {

                    busLocationInfo.setBusLocationInfoType(BusLocationInfo.BusLocationInfoType.createBusLocationInfoTypeWithBusLocationPolling(pollingDataGen(el)));

                    message_MESSAGEBODY_1.add(busLocationInfo);
                    log.debug("버스정주기 추가 : " + message_MESSAGEBODY_1);
                }
            }
        }

        EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();

        try {
            DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BUS_LOC_INFO_RESP));
        } catch (BadObjectIdentifierException e) {
            log.error(e.getMessage());
        }

        DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGEBODY_1));

        return DatexPublish_Data;
    }

    private void periodicPubProc(){
        // 일정주기 10분이내 데이터(col, msg 둘중 하나라도 10분이내) 조회하여 전체 전송
        // 주기적으로 전체 데이터 가져와서 publication(중복데이터 전송)
        // Timestamp lastTime = new Timestamp(util.nowTime().getTime() - (10 * 60 * 1000)); // 10분전 타임

        List<ResultBusLocationInfo> info = busLocationInfoMapper.find(ParamBusLocationInfo.builder().build());
        log.info("[버스위치정보] 전체데이터 조회건수 : {}", info.size());

        if (!info.isEmpty()) {
            List<ResultBusLocationInfo> part = new ArrayList<>();

            for (ResultBusLocationInfo el : info) {
                // 메세지를 정의된 개수만큼 쪼개서 보내기
                log.debug("vo결과 : " + el.toString());
                part.add(el);

//                if(part.size() >= sendCnt) {
//                    boolean result = publication(makePublishDataBusEvent(part), subSerialNbr, pubSerialNbr);
//                    // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                    if (result) {
//                        pubSerialNbr++;
//                    }
//                    result = publication(makePublishDataPeriodPolling(part), subSerialNbr, pubSerialNbr);
//                    // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                    if (result) {
//                        pubSerialNbr++;
//                    }
//                    part.clear();
//                }
                log.debug("PartList 결과 : {}", part);

            }

            // 남은거 보내기
//            if(!part.isEmpty()) {
//                boolean result = publication(makePublishDataBusEvent(part), subSerialNbr, pubSerialNbr);
//                // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                if (result) {
//                    pubSerialNbr++;
//                }
//                result = publication(makePublishDataPeriodPolling(part), subSerialNbr, pubSerialNbr);
//                // 퍼블리케이션 할 데이터가 있을 경우만 pubSerialNbr를 증가시킴
//                if (result) {
//                    pubSerialNbr++;
//                }
//            }
        }
    }

    public C2CAuthenticatedMessage publication(EndApplicationMessage EndAppMsg, long subSerialNbr, long pubSerialNbr, String origin, ChannelHandlerContext ctx ) {
        EndApplicationMessage DatexPublishData = EndAppMsg;

//        if (serverPubTestOn) {
//            log.info("[Publication Test]");
//            // 실시간 정보 테스트 데이터 생성
//            DatexPublishData = pubTestData();
//        } else {
//            // 데이터가 없을 경우 패킷을 생성하지 않음.
//            if (DatexPublishData == null) {
//                log.info("[No Publication]");
//                return false;
//            }
//
//            log.info("[Publication]");
//        }

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(util.getDataPacketNumber() + 1);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(origin , ctx));

        PublicationData publicationData = new PublicationData();
        publicationData.setDatexPublish_SubscribeSerial_nbr(subSerialNbr);
        publicationData.setDatexPublish_Serial_nbr(pubSerialNbr);
        publicationData.setDatexPublish_LatePublicationFlag(false);
        publicationData.setDatexPublish_Type(PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublishData));
		/*
		PublicationType.createPublicationTypeWithDatexPublication_Management_cd(
				DatexPublication_Management_cd.temporarilySuspended);
		*/
        DatexPublish_Data datexPublish_Data = new DatexPublish_Data();
        datexPublish_Data.add(publicationData);

        Publication publication = new Publication();
        publication.setDatexPublish_Guaranteed_bool(true);
        publication.setDatexPublish_Guaranteed_bool(ctx.channel().attr(INFO).get().isSubGuarantee());
//        publication.setDatexPublish_Guaranteed_bool(serverHandler.isSubGuarantee());
        publication.setDatexPublish_Format(createPublish_FormatWithDatexPublish_Data(datexPublish_Data));

        c2c.setPdu(PDUs.createPDUsWithPublication(publication));

        return c2c;
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

}