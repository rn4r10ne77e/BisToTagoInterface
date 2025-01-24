package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParamArrivalPredictionTimeInfo {

	/** 조회 할 시군 */
	private int targetOrigin;
	/** "싱글모드"일 경우 'SINGLE', "주기모드"일 경우 'PERIOD', "이벤트모드"일 경우 'EVENT' */
	private String mode;
}
