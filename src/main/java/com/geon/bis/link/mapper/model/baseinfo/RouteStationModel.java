package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteStationModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String routeId = null;
	/** 진행순서 */
	private int sequence;
	/** 정류장 ID */
	private String stationId = null;
	/** 상하행 구분(0,1,2) */
	private int upDown = -1;
	/** 기점 기준 누적거리 */
	private int sumDist = -1;
	/** 종점 기준 잔여거리 */
	private int remainDist = -1;
	/** 이전 정류장 거리 */
	private int statDist = -1;
	/** 다음 정류장 거리 */
	private int nextDist = -1;
	/** 버스 정류장 구분(0,1,2,3) */
	private int statTp = -1;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
