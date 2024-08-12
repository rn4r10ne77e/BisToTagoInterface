package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.INTEGER;
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class C2CAuthenticatedMessage extends Sequence {

    OctetString datexAuthenticationInfoTxt;
    INTEGER datexDataPacketNumber;
    INTEGER datexDataPacketPriorityNumber;
    HeaderOption headerOption;
    PDUs pdu;

    @Override
    public void initComponents() {



        super.mComponents[0] = datexAuthenticationInfoTxt;
        super.mComponents[1] = datexDataPacketNumber;
        super.mComponents[2] = datexDataPacketPriorityNumber;
        super.mComponents[3] = headerOption;
        super.mComponents[4] = pdu;
    }
}
