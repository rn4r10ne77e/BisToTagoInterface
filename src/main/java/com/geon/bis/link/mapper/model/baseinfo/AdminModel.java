package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdminModel {
	/** 지역 코드 */
	private String origin = null;
	/** 관할관청 ID */
	private String adminId = null;
	/** 행정자치부 ID */
	private String MoiId = null;
	/** 광역시도명 */
	private String adminNm1 = null;
	/** 시군구명 */
	private String adminNm2 = null;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
