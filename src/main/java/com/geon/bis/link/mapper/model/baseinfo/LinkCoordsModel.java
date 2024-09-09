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
	private String LinkId = null;
	/** 순번 */
	private int Sequence = -1;
	/** 위치 좌표 위도 */
	private float CoordinateLati = -1;
	/** 위치 좌표 경도 */
	private float CoordinateLong = -1;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
