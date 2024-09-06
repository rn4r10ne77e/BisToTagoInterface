package com.geon.bis.link.mapper.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultBaseInfoVersion {
    /** 메세지 발생시각 */
    private Timestamp MessageGenerationTime = null;
    /** 노드정보 */
    private String NodeVersion = null;
    /** 링크정보 */
    private String LinkVersion = null;
    /** 링크형상정보 */
    private String LinkCoordsVersion = null;
    /** 정류장정보 */
    private String StationVersion = null;
    /** 노선기본정보 */
    private String RouteVersion = null;
    /** 노선운행정보 */
    private String RoutePlanVersion = null;
    /** 노선부가정보 */
    private String RouteStationVersion = null;
    /** 차량정보 */
    private String VehicleVersion = null;
    /** 노선표출정보 */
    private String RouteLinkVersion = null;
    /** 노선운행예정정보 */
    private String RouteAllocateVersion = null;
    /** 운수회사정보 */
    private String CompanyVersion = null;
    /** 관할관청정보 */
    private String AdminVersion = null;
    /** 비고 */
    private String Remark = null;
}
