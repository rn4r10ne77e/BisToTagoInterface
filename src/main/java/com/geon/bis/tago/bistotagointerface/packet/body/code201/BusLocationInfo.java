package com.geon.bis.tago.bistotagointerface.packet.body.code201;

import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusEvenCodeNumber;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusLocationInfoChoice;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusRunCodeNumber;
import lombok.*;

/**
 * 버스 위치 정보
 * 메세지 코드 201(버스 위치 정보)
 * 아래 링크 참조 국가법령정보센터 > 행정규칙 > 본문
 * <a href="https://www.law.go.kr/admRulLsInfoP.do?admRulId=32717&efYd=0">...</a>
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusLocationInfo<T extends BusLocationInfoChoice> {
    /** 차량 ID - tsfc-PTVehicleIDNumber : UTF8String (SIZE(1..255)) */
    private String vehId;
    /** 이벤트 정보 or 정주기 정보 둘중 한 종류만 */
    private T choice;
    /** 노선 ID */
    private String routeId;
    /** 이벤트 분류코드 */
    private BusEvenCodeNumber busEvenCodeNumber;
    /** 운행 조건코드 */
    private BusRunCodeNumber busRunCodeNumber;
    /** 막차 정보 */
    private boolean isLast;
    /** 종점 정류장 ID*/
    private int endNodeZoneId;
    /** 종점 정류장의 노선 내 순번 */
    private int endNodeRouteSeq;
    /** 총 좌석 수 */
    private int busTotalSeatsNumber;
    /** 버스 재차 인원 */
    private int busPassengerNumber;
    /** 버스 잔여 좌석 정보 */
    private int busRemainSeatsNumber;
}
