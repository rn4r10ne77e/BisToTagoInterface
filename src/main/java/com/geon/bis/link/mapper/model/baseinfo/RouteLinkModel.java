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
	private String routeId = null;
	/** 순번 */
	private int sequence = -1;
	/** 링크 ID */
	private String linkId = null;
	/** 정류장 포함 여부(0,1) */
	private int stationYn = -1;
	/** 상하행 구분(0,1,2) */
	private int upDown = -1;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
