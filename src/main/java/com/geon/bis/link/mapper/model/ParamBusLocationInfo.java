package com.geon.bis.link.mapper.model;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ParamBusLocationInfo {
    /** 조회할 시군*/
    private String origin;
    /** 조회기간 시작시간 */
    private String dtStart;
    /** 조회기간 종료시간 */
    private String dtEnd;
}
