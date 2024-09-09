package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RouteLinkModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노선 ID */
	private String RouteId = null;
	/** 순번 */
	private int Sequence = -1;
	/** 링크 ID */
	private String LinkId = null;
	/** 정류장 포함 여부(0,1) */
	private int StationYn = -1;
	/** 상하행 구분(0,1,2) */
	private int UpDown = -1;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
