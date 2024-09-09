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
	private String Vehid = null;
	/** 차량번호 */
	private String PlateNo = null;
	/** 차종(0,1,2,3) */
	private int VehTp = -1;
	/** 특수버스 구분(0,1,2,3) */
	private int BusTp = -1;
	/** 승차정원 */
	private int VehCapa = -1;
	/** 관할관청 ID */
	private String AdminId = null;
	/** 운수회사 ID */
	private String CompanyId = null;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
