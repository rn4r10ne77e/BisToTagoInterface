package com.geon.bis.tago.bistotagointerface.packet.body.code201.model;

import com.geon.bis.tago.bistotagointerface.packet.body.code201.BusLocationInfo;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NmeaCoords {
    /** 위도 */
    private Latitude latitude;
    /** 경도 */
    private Longitude longitude;
    /** 옵션 */
    private String optData;
}