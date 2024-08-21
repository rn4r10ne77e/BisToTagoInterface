package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParamArrivalPredictionTimeInfo {
	/** 메시지 발생시각 */
	private Timestamp MessageGenerationTime = null;
	/** 이벤트 분류코드 */
	private int BusEventCodeNumber = -1;
	/** 정류장 ID */
	private String BITIdentityNumber;
	/** 노선 ID */
	private String SubRouteIdentityNumber;
	/** 차량 ID */
	private String PTVehicleIDNumber;
	/** 도착 예정시간 */
	private int AccesspoINTArrivalTime = -1;
	/** 남은 정류장 수 */
	private int AccesspoINTArrivalCount = -1;
	/** 출발(최근통과) 정류장 ID */
	private String LastBITIdentifyNumber = null;
	/** 노선 내 순번 */
	private int NodeRouteSequence = -1;
	/** (최근통과정류장)진입시각 */
	private Timestamp LastBITZoneEntryTime = null;
	/** (최근통과정류장)진출시각 */
	private Timestamp LastBITZoneExitTime = null;
	/** (최근통과정류장)통과시간 */
	private int LastBITZoneTripTime = -1;
	/** 평균 통행속도 */
	private int RollingAverageSpeedRate = -1;
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
	/** 메세지 기록시간(DB 서버시간) */
	private Timestamp WritedTime = null;
}
