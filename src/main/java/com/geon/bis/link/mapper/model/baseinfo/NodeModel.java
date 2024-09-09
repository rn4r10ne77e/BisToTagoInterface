package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NodeModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노드 ID */
	private String NodeId = null;
	/** 노드 유형 */
	private String Type = null;
	/** 노드 한글명칭 */
	private String Name = null;
	/** 위치 좌표 위도 */
	private float CoordinateLati = -1;
	/** 위치 좌표 경도 */
	private float CoordinateLong = -1;
	/** 회전 제한 유무 */
	private String TurnLimit = null;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
