package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoutePlanModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String RouteId = null;
	/** 운행 요일(0,1,2,3,4) */
	private int OperationWeek = -1;
	/** 일일 운행 횟수 */
	private int OperationCnt = -1;
	/** 기점 첫차 출발시각 */
	private String StartFirstTm = null;
	/** 기점 막차 출발시각 */
	private String StartLastTm = null;
	/** 종점 첫차 출발시각 */
	private String EndFirstTm = null;
	/** 종점 막차 출발시각 */
	private String EndLastTm = null;
	/** 최소 배차간격 */
	private int MinHead = -1;
	/** 최대 배차간격 */
	private int MaxHead = -1;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
