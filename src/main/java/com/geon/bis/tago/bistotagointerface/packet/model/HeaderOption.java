package com.geon.bis.tago.bistotagointerface.packet.model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeaderOption {
    /** 송신부 시스템의 유일한 주소 */
    private String datexOriginAddressLocation;
    /** 수신부 시스템의 유일한 주소 */
    private String datexDestinationAddressLocation;
    /** 데이터 패킷이 생성된 시간 */
    private String datexDataPacketTime;
}
