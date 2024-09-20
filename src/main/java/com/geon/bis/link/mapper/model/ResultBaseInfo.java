package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultBaseInfo {
    /** 지역 코드 */
    private String origin;
    /** 메세지 발생시각 */
    private Timestamp messageGenerationTime;
    /** 노드정보 */
    private String nodeVersion;
    /** 링크정보 */
    private String linkVersion;
    /** 링크형상정보 */
    private String linkCoordsVersion = null;
    /** 정류장정보 */
    private String stationVersion = null;
    /** 노선기본정보 */
    private String routeVersion = null;
    /** 노선운행정보 */
    private String routePlanVersion = null;
    /** 노선부가정보 */
    private String routeStationVersion = null;
    /** 차량정보 */
    private String vehicleVersion = null;
    /** 노선표출정보 */
    private String routeLinkVersion = null;
    /** 노선운행예정정보 */
    private String routeAllocateVersion = null;
    /** 운수회사정보 */
    private String companyVersion = null;
    /** 관할관청정보 */
    private String adminVersion = null;
    /** 비고 */
    private String remark = null;
}
