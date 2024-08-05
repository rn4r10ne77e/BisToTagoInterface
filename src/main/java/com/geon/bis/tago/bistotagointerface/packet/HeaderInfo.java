package com.geon.bis.tago.bistotagointerface.packet;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HeaderInfo {
    /** Datex 버전 번호 */
    private byte datexVersionNumber;
    /** 각 시스템 간의 연결을 위해 각 메시지에 포함하기로 동의한 인증 정보 */
    private byte[] datexAuthenticationInfoTxt;
    /** 데이터의 패킷 번호 */
    private Integer datexDataPacketNumber;
    /** 메시지의 우선순위 */
    private Integer datexDataPacketPriorityNumber;
    /** 송신부 시스템의 유일한 주소 */
    private String datexOriginAddressLocation;
    /** 수신부 시스템의 유일한 주소 */
    private String datexDestinationAddressLocation;
    /** 데이터 패킷이 생성된 시간 */
    private String datexDataPacketTime;
}
