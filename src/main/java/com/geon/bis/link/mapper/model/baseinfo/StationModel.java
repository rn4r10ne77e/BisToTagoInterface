package com.geon.bis.link.mapper.model.baseinfo;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StationModel {
	/** 지역 코드 */
	private String origin = null;
	/** 정류장 ID */
	private String stationId = null;
	/** 정류장 한글명칭 */
	private String stationKnm = null;
	/** 정류장 유형( 0,1,2,3,4,5,6,7 ) */
	private int stationTp = -1;
	/** 중앙차로 여부(0,1) */
	private int centerYn = -1;
	/** 관할관청 ID */
	private String adminId = null;
	/** 정류장 영문명칭 */
	private String stationEnm = null;
	/** GPS_LATI */
	private float coordinateLati = -1;
	/** GPS_LONG */
	private float coordinateLong = -1;
	/** 설치 링크 ID */
	private String installLinkId = null;
	/** 등록일자 */
	private String regDate = null;
	/** 비고 */
	private String remark = null;
	/** 버전 */
	private String ver = null;
	/** 전체 사이즈 */
	private int total = -1;
}
