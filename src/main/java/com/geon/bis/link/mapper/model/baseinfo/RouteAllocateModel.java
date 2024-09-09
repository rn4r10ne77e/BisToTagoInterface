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
	private String RouteId = null;
	/** 운행 요일(0,1,2,3,4) */
	private int OperationWeek = -1;
	/** 배차 순번 */
	private int AllocSeq = -1;
	/** 배차 시간 */
	private String AllocTime = null;
	/** 기점 정류장 ID */
	private String StartStation = null;
	/** 종점 정류장 ID */
	private String EndStation = null;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
