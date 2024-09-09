package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LinkModel {
	/** 지역 코드 */
	private String origin = null;
	/** 링크 ID */
	private String LinkId = null;
	/** 시작 노드 ID */
	private String FNode = null;
	/** 도착 노드 ID */
	private String TNode = null;
	/** 차선 수 */
	private int Lanes = -1;
	/** 도로 등급 */
	private String RoadRank = null;
	/** 도로 유형 */
	private String RoadType = null;
	/** 도로 번호 */
	private String RoadNo = null;
	/** 도로 이름 */
	private String RoadName = null;
	/** 도로 사용 여부 */
	private String RoadUse = null;
	/** 중용 구간 여부 */
	private String MultiLink = null;
	/** 연결로 코드 */
	private String Connect = null;
	/** 최고 제한 속도 */
	private int MaxSpd = -1;
	/** 통행 제한 차량 */
	private String RestVeh = null;
	/** 통과 제한 하중 */
	private int ResTw = -1;
	/** 통과 제한 높이 */
	private int ResTh = -1;
	/** 등록일자 */
	private String RegDate = null;
	/** 비고 */
	private String Remark = null;
	/** 버전 */
	private String Ver = null;
	/** 전체 사이즈 */
	private int Total = -1;
}
