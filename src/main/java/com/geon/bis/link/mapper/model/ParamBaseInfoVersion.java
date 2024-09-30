package com.geon.bis.link.mapper.model;

import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParamBaseInfoVersion {
    /** 조회할 시군 */
    private List<Integer> origin;
    /** 조회 기준 시간. 기준 시간부터 가장 최근 데이터까지 조회 */
    private ZonedDateTime stdTime;
    /** "싱글모드"일 경우 "SINGLE", "주기모드"일 경우 "PERIOD", "이벤트모드"일 경우 "EVENT" */
    private String mode;
    /** 버전명 */
    private String versionNm;
}
