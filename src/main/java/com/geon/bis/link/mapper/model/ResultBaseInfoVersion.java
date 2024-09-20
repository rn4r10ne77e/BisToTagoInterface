package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultBaseInfoVersion {
    /** 지역 코드 */
    private String origin;
    /** 메세지 발생시각 */
    private Timestamp messageGenerationTime;
    /** 노드정보 */
    private String nodeVersion;
    /** 링크정보 */
    private String linkVersion;
    /** 링크형상정보 */
    private String linkCoordsVersion;
    /** 정류장정보 */
    private String stationVersion;
    /** 노선기본정보 */
    private String routeVersion;
    /** 노선운행정보 */
    private String routePlanVersion;
    /** 노선부가정보 */
    private String routeStationVersion;
    /** 차량정보 */
    private String vehicleVersion;
    /** 노선표출정보 */
    private String routeLinkVersion;
    /** 노선운행예정정보 */
    private String routeAllocateVersion;
    /** 운수회사정보 */
    private String companyVersion;
    /** 관할관청정보 */
    private String adminVersion;
    /** 비고 */
    private String remark;
}
