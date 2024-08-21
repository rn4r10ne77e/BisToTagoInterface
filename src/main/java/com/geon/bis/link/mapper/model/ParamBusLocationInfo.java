package com.geon.bis.link.mapper.model;

import lombok.*;

import java.time.ZonedDateTime;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParamBusLocationInfo {
    /** 조회할 시군*/
    private String origin;
    /** 조회 기준 시간. 기준 시간부터 가장 최근 데이터까지 조회 */
    private ZonedDateTime stdTime;
}
