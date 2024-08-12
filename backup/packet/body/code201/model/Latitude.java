package com.geon.bis.tago.bistotagointerface.packet.body.code201.model;

import com.geon.bis.tago.bistotagointerface.packet.body.code201.BusLocationInfo;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Latitude {
    /** 좌표의 정수 부분 */
    private int integerValue;
    /** 좌표의 소수 부분 */
    private int fractionValue;
    /** 소수 부분의 자릿수 */
    private int fracSize;
    /** 북, 남 */
    private Compass1 compass1;
}
