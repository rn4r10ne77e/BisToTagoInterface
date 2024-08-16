package com.geon.bis.link.mapper.model;

import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultBusLocationInfo {
    /** origin */
    private String origin;
    /** 차량 ID */
    private String PTVehicleIDNumber;
    /** 노선 ID */
    private String SubRouteIdentityNumber;
    /** 이벤트 분류코드 */
    private int BusEventCodeNumber = -1;
    /** 운행 조건 코드 */
    private int BusRunCodeNumber = -1;
    /** 막차 정보 */
    private boolean LastPTVehicle = false;
    /** 종점 정류장 ID */
    private String EndNodeZoneIDNumber = null;
    /** 종점 정류장의 노선 내 순번 */
    private int EndNodeRouteSequence = -1;
    /** 총 좌석 수 */
    private int BusTotalSeatsNumber = -1;
    /** 버스 재차 인원 */
    private int BusPassengerNumber = -1;
    /** 버스 잔여 좌석 정보 */
    private int BusRemainSeatsNumber = -1;
// 이벤트 정보
    /** 메시지 발생시각 */
    private Timestamp MessageGenerationTime = null;
    /** 이벤트 정보 수집 노드 ID */
    private String NodeZoneIDNumber;
    /** 노선 내 순번 */
    private int NodeRouteSequence = -1;
    /** 노드 진입시각 */
    private Timestamp NodeZoneEntryTime = null;
    /** 노드 진출시각 */
    private Timestamp NodeZoneExitTime = null;
    /** 노드 통행시간 */
    private int NodeZoneTripTime = -1;
// 정주기 정보
    /** GPS_LATI */
    private float PTVehicleCoordinateLati = 0.0f;
    /** GPS_LONG */
    private float PTVehicleCoordinateLong = 0.0f;
    /** 위치정보 수집시각 */
    private Timestamp PTVehicleCollectedTime = null;
    /** 정보수집주기 */
    private int PTVehicleCollectedCycleTime = -1;


    /** 메세지 기록시간(DB 서버시간) */
    private Timestamp WritedTime = null;

    private boolean EventSendYN = false;
    private boolean PreSendYN = false;
}
