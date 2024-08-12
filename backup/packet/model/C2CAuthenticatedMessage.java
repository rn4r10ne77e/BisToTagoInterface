package com.geon.bis.tago.bistotagointerface.packet.model;

import com.geon.bis.tago.bistotagointerface.packet.body.cmm.HeaderOption;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class C2CAuthenticatedMessage {
    /** 각 시스템 간의 연결을 위해 각 메시지에 포함하기로 동의한 인증 정보 | OCTET STRING (0..255) */
    private String datexAuthenticationInfoTxt;
    /** 데이터의 패킷 번호 0부터 1씩 증가하여 부여 | INTEGER (0..4294967295) */
    private long datexDataPacketNumber; // unsigned int
    /** 메시지의 우선 순위 | INTEGER (0..10) */
    private short datexDataPacketPriorityNumber;
    /** IP 주소 정보, 패킷 생성 시간 정보 포함 */
    private HeaderOption headerOption;

}
