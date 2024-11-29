package com.geon.bis.link.mapper.model;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultBusLocationInfo {
    /** origin */
    private String origin;
    /** 차량 ID */
    private String pTVehicleIDNumber;
    /** 노선 ID */
    private String subRouteIdentityNumber;
    /** 이벤트 분류코드 */
    private int busEventCodeNumber = -1;
    /** 운행 조건 코드 */
    private int busRunCodeNumber = -1;
    /** 막차 정보 */
    private boolean lastPTVehicle = false;
    /** 종점 정류장 ID */
    private String endNodeZoneIDNumber = null;
    /** 종점 정류장의 노선 내 순번 */
    private int endNodeRouteSequence = -1;
    /** 총 좌석 수 */
    private int busTotalSeatsNumber = -1;
    /** 버스 재차 인원 */
    private int busPassengerNumber = -1;
    /** 버스 잔여 좌석 정보 */
    private int busRemainSeatsNumber = -1;

    // 이벤트 정보
    /** 메시지 발생시각 */
    private ZonedDateTime messageGenerationTime;
    /** 이벤트 정보 수집 노드 ID */
    private String nodeZoneIDNumber;
    /** 노선 내 순번 */
    private int nodeRouteSequence = -1;
    /** 노드 진입시각 */
    private ZonedDateTime nodeZoneEntryTime;
    /** 노드 진출시각 */
    private ZonedDateTime nodeZoneExitTime;
    /** 노드 통행시간 */
    private int nodeZoneTripTime = -1;

    // 정주기 정보
    /** GPS_LATI */
    private float pTVehicleCoordinateLati = 0.0f;
    /** GPS_LONG */
    private float pTVehicleCoordinateLong = 0.0f;
    /** 위치정보 수집시각 */
    private ZonedDateTime pTVehicleCollectedTime;
    /** 정보수집주기 */
    private int pTVehicleCollectedCycleTime = -1;


    /** 메세지 기록시간(DB 서버시간) */
    private ZonedDateTime writedTime;

    private boolean eventSendYN = false;
    private boolean preSendYN = false;
}
