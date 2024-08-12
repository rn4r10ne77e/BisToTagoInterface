package com.geon.bis.tago.bistotagointerface.packet.body.code201.model;

import lombok.*;

/**
 * 정주기 정보
 * CHOICE 형태로 "BusLocationInfo"에 포함
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusLocationPolling extends BusLocationInfoChoice {
    /** 위치정보 수집시각 | tsfc-PTVehicleCollectedTime | GeneralizedTime | OPTIONAL */
    private String collectionTime;
    /** 정보 수집 주기 | tsfc-PTVehicleCollectedCycleTime | INTEGER (0..3600) | OPTIONAL */
    private String collectionCycleTime;
}