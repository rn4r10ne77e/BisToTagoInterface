package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkCoordsModel {
	/** 지역코드 */
	private String origin = null;
	/** 링크 ID */
	private String linkId = null;
	/** 순번 */
	private int sequence = -1;
	/** 위치 좌표 위도 */
	private float coordinateLati = -1;
	/** 위치 좌표 경도 */
	private float coordinateLong = -1;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
