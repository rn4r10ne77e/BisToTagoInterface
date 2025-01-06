package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoutePlanModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String routeId = null;
	/** 운행 요일(0,1,2,3,4) */
	private int operationWeek = -1;
	/** 일일 운행 횟수 */
	private int operationCnt = -1;
	/** 기점 첫차 출발시각 */
	private String startFirstTm = null;
	/** 기점 막차 출발시각 */
	private String startLastTm = null;
	/** 종점 첫차 출발시각 */
	private String endFirstTm = null;
	/** 종점 막차 출발시각 */
	private String endLastTm = null;
	/** 최소 배차간격 */
	private int minHead = -1;
	/** 최대 배차간격 */
	private int maxHead = -1;
	/** 등록일자 */
	private ZonedDateTime regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
