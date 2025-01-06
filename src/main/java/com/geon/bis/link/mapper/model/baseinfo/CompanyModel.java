package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyModel {
	/** 지역 코드 */
	private String origin = null;
	/** 운수회사 ID */
	private String companyId = null;
	/** 전화번호 */
	private String phoneNo = null;
	/** FAX번호 */
	private String faxNo = null;
	/** 주소 */
	private String address = null;
	/** 대표자 */
	private String ceoNm = null;
	/** 보유대수 */
	private int busCnt = -1;
	/** 인가대수 */
	private int regCnt = -1;
	/** 예비차량대수 */
	private int spareCnt = -1;
	/** 관할관청 ID */
	private String adminId = null;
	/** 회사명칭 */
	private String companyNm = null;
	/** 등록일자 */
	private ZonedDateTime regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
