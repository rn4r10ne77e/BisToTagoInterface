package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String routeId = null;
	/** 노선 명칭 */
	private String routeNm = null;
	/** 운행형태(10,11,12,13,21,22,23,30,41,42,43) */
	private int routeTy = -1;
	/** 기점 정류장 ID */
	private String stStaId = null;
	/** 종점 정류장 ID */
	private String edStaId = null;
	/** 회차 정류장 ID */
	private String mdStaId = null;
	/** 인가대수 */
	private int permVol = -1;
	/** 운행 개시일 */
	private String beginDate = null;
	/** 운행 종료일 */
	private String closeDate = null;
	/** 노선 설명 */
	private String routeEx = null;
	/** 운수회사 ID */
	private String companyId = null;
	/** 관할관청 ID */
	private String adminId = null;
	/** 총 거리 */
	private int distance = -1;
	/** 소요시간 */
	private int reqTime = -1;
	/** 요금 */
	private int charge = -1;
	/** 등록일자 */
	private ZonedDateTime regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
	
}
