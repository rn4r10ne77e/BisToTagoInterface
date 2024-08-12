package com.geon.bis.tago.bistotagointerface.packet.body.code202;


import com.geon.bis.tago.bistotagointerface.packet.body.cmm.BusEventCodeNumber;
import lombok.*;

/**
 * 도착 예정 정보
 * 메세지 코드 202
 * 아래 링크 참조
 * <a href="https://www.law.go.kr/admRulLsInfoP.do?admRulId=32717&efYd=0">국가법령정보센터 > 행정규칙 > 본문</a>
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArrivalPredictionTimeInfo {
    /** 메세지 발생시각 | tsmg-MessageGenerationTime | GeneralizedTime */
    private String eventTime;
    /** 이벤트 분류코드 | tpfc-BusEventCodeNumber | ENUMERATED */
    private BusEventCodeNumber busEventCodeNumber;
    /** 정류장 ID | tpif-BITIdentifyNumber | UTF8String (SIZE(1..40)) */
    private String stopId;
    /** 노선 ID | tpif-SubRouteIdentityNumber | UTF8String (SIZE(1..255)) */
    private String routeId;
    /** 차량 ID | tsfc-PTVehicleIDNumber | UTF8String (SIZE(1..255)) */
    private String vehId;
    /** 도착 예정시간 | tpif-AccessPointArrivalTime | INTEGER (0..72000) */
    private int arrTime;
    /** 남은 정류장 수 | tpif-AccessPointArrivalCount | INTEGER (0..512) */
    private int arrCnt;
    /** 노선 내 순번 | tsvn-NodeRouteSequence | INTEGER (0..512) */
    private int nodeRouteSeq;
    /** 출발(최근 통과) 정류장 ID | tsvh-LastBITIdentifyNumber | UTF8String (SIZE(1..255)) OPTIONAL */
    private String lastStopId;
    /** (최근통과정류장) 진입시각 | tsvh-LastBITZoneEntryTime | GeneralizedTime OPTIONAL */
    private String lastStopInTime;
    /** (최근통과정류장) 진출시각 | tsvh-LastBITZoneExitTime | GeneralizedTIme OPTIONAL */
    private String lastStopOutTime;
    /** (최근통과정류장) 통과시간 | tsvh-LastBITZoneTripTime | INTEGER (0..1200) OPTIONAL */
    private String lastStopPassTime;
    /** 평균 통행속도 | tsvh-RollingAverageSpeedRate | INTEGER (0..300) OPTIONAL */
    private String averageSpeedRate;
    /** 막차 정보 | tsfc-LastPTVehicle | BOOLEAN OPTIONAL */
    private boolean isLast;
    /** 종점 정류장 ID | tpif-EndNodeZoneIDNumber | UTF8String (SIZE(1..40)) OPTIONAL */
    private String endStopId;
    /** 종점 정류장의 노선 내 순번 | tpif-EndNodeRouteSequence | INTEGER (SIZE(1..40))  OPTIONAL */
    private int endStopSeq;
    /** 총 좌석 수 | tsfc-BusTotalSeatsNumber | INTEGER (0..512) OPTIONAL */
    private int totalSeatsCnt;
    /** 버스 재차 인원 |  tsfc-BUsPassengerNumber | INTEGER (0..512) OPTIONAL */
    private int passengerCnt;
    /** 버스 잔여 좌석 정보 | tsfc-BUsRemainSeatsNumber | INTEGER (0..512) OPTIONAL */
    private int remainSeatsCnt;
}
