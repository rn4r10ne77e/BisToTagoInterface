package com.geon.bis.tago.bistotagointerface.packet.body.code201.model;

import lombok.*;

/**
 * 이벤트 정보
 * CHOICE 형태로 "BusLocationInfo"에 포함
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusLocationEvent extends BusLocationInfoChoice{
    /** 메시지 발생시각 | tsmg-MessageGenerationTime | GeneralizedTime */
    private String eventDate;
    /** 이벤트정보 수집 노드( Zone/구역 ) ID | tsvh-NodeZoneIDNumber | UTF8String */
    private String eventNode;
    /** 노선 내 순번 | tsvh-NodeRouteSequence | INTEGER (0..512) */
    private String order;
    /** 노드 진입 시각 | tsvh-NodeZoneEntryTime | GeneralizedTime OPTIONAL */
    private String nodeInTime;
    /** 노드 진출 시각 | tsvh-NodeZoneExitTime | GeneralizedTime OPTIONAL */
    private String nodeOutTime;
    /** 노드 통행 시간 | tsvh-NodeZoneTripTime | INTEGER (0..1200) OPTIONAL */
    private String nodeTripTime;
}