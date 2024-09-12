package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteAllocateModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String routeId = null;
	/** 운행 요일(0,1,2,3,4) */
	private int operationWeek = -1;
	/** 배차 순번 */
	private int allocSeq = -1;
	/** 배차 시간 */
	private String allocTime = null;
	/** 기점 정류장 ID */
	private String startStation = null;
	/** 종점 정류장 ID */
	private String endStation = null;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
