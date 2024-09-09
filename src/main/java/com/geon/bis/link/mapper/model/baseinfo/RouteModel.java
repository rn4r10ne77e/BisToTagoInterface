package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String RouteId = null;
	/** 노선 명칭 */
	private String RouteNm = null;
	/** 운행형태(10,11,12,13,21,22,23,30,41,42,43) */
	private int RouteTy = -1;
	/** 기점 정류장 ID */
	private String StStaId = null;
	/** 종점 정류장 ID */
	private String EdStaId = null;
	/** 회차 정류장 ID */
	private String MdStaId = null;
	/** 인가대수 */
	private int PermVol = -1;
	/** 운행 개시일 */
	private String BeginDate = null;
	/** 운행 종료일 */
	private String CloseDate = null;
	/** 노선 설명 */
	private String RouteEx = null;
	/** 운수회사 ID */
	private String CompanyId = null;
	/** 관할관청 ID */
	private String AdminId = null;
	/** 총 거리 */
	private int Distance = -1;	
	/** 소요시간 */
	private int ReqTime = -1;
	/** 요금 */
	private int Charge = -1;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
	
}
