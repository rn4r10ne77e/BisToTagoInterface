package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;
import java.time.ZonedDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkModel {
	/** 지역 코드 */
	private String origin = null;
	/** 링크 ID */
	private String linkId = null;
	/** 시작 노드 ID */
	private String fNode = null;
	/** 도착 노드 ID */
	private String tNode = null;
	/** 차선 수 */
	private int lanes = -1;
	/** 도로 등급 */
	private String roadRank = null;
	/** 도로 유형 */
	private String roadType = null;
	/** 도로 번호 */
	private String roadNo = null;
	/** 도로 이름 */
	private String roadName = null;
	/** 도로 사용 여부 */
	private String roadUse = null;
	/** 중용 구간 여부 */
	private String multiLink = null;
	/** 연결로 코드 */
	private String connect = null;
	/** 최고 제한 속도 */
	private int maxSpd = -1;
	/** 통행 제한 차량 */
	private String restVeh = null;
	/** 통과 제한 하중 */
	private int resTw = -1;
	/** 통과 제한 높이 */
	private int resTh = -1;
	/** 등록일자 */
	private ZonedDateTime regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
