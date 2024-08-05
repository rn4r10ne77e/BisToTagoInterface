package com.geon.bis.tago.bistotagointerface.packet;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TailInfo {
    /** Error 체크하기 위해 사용 되는 코드 */
    private byte[] datexCrcNbr;
}
