package com.geon.bis.tago.bistotagointerface.packet;

import com.geon.bis.tago.bistotagointerface.packet.model.C2CAuthenticatedMessage;
import com.geon.bis.tago.bistotagointerface.packet.model.DatexVersionNumber;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DatexDataPacket {
    /** Datex 버전 번호 */
    private DatexVersionNumber datexVersionNumber;
    /** 실제 데이터가 들어가는 부분( code 201, 202, ... ) */
    private String datexData;
    /** 인증정보, 메시지 우선 순위, 패킷 번호가 포함된 구조체 클래스 */
    private C2CAuthenticatedMessage c2CAuthenticatedMessage;
    /** 데이터 에러를 체크하기 위해 사용되는 코드 */
    private String datexCrcNbr;
}

