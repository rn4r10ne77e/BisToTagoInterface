package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VehicleModel {
	/** 지역 코드 */
	private String origin = null;
	/** 차량 ID */
	private String vehId = null;
	/** 차량번호 */
	private String plateNo = null;
	/** 차종(0,1,2,3) */
	private int vehTp = -1;
	/** 특수버스 구분(0,1,2,3) */
	private int busTp = -1;
	/** 승차정원 */
	private int vehCapa = -1;
	/** 관할관청 ID */
	private String adminId = null;
	/** 운수회사 ID */
	private String companyId = null;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
