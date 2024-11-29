package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultArrivalPredictionTimeInfo {

	/** 메시지 발생시각 */
	private ZonedDateTime messageGenerationTime = null;
	/** 이벤트 분류코드 */
	private int busEventCodeNumber = -1;
	/** 정류장 ID */
	private String bITIdentityNumber;
	/** 노선 ID */
	private String subRouteIdentityNumber;
	/** 차량 ID */
	private String pTVehicleIDNumber;
	/** 도착 예정시간 */
	private int accesspoINTArrivalTime = -1;
	/** 남은 정류장 수 */
	private int accesspoINTArrivalCount = -1;
	/** 출발(최근통과) 정류장 ID */
	private String lastBITIdentifyNumber = null;
	/** 노선 내 순번 */
	private int nodeRouteSequence = -1;
	/** (최근통과정류장) 진입시각 */
	private ZonedDateTime lastBITZoneEntryTime = null;
	/** (최근통과정류장) 진출시각 */
	private ZonedDateTime lastBITZoneExitTime = null;
	/** (최근통과정류장) 통과시간 */
	private int lastBITZoneTripTime = -1;
	/** 평균 통행속도 */
	private int rollingAverageSpeedRate = -1;
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
	/** 메세지 기록시간(DB 서버시간) */
	private ZonedDateTime writedTime = null;
}
