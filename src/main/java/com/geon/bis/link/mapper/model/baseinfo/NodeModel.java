package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NodeModel {
	/** 지역 코드 */
	private String origin = null;
	/** 노드 ID */
	private String nodeId = null;
	/** 노드 유형 */
	private String type = null;
	/** 노드 한글명칭 */
	private String name = null;
	/** 위치 좌표 위도 */
	private float coordinateLati = -1;
	/** 위치 좌표 경도 */
	private float coordinateLong = -1;
	/** 회전 제한 유무 */
	private String turnLimit = null;
	/** 등록일자 */
	private ZonedDateTime regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
