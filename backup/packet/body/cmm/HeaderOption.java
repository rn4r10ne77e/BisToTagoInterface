package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.geon.bis.tago.bistotagointerface.packet.DatexDataPacket;
import com.oss.asn1.AbstractData;
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;
import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HeaderOption extends Sequence {

    private UTF8String16 datexOriginText;
    private OctetString datexOriginAddressLocation ;
    private UTF8String16 datexSenderText;
    private OctetString datexSenderAddressLocation;
    private UTF8String16 datexDestinationText;
    private OctetString datexDestinationAddressLocation;
    private Cost datexCost;
    private Time datexDataPacketTime;

    @Override
    public void initComponents() {

        super.mComponents = new AbstractData[]{
            this.datexOriginText,
            this.datexOriginAddressLocation,
            this.datexSenderText,
            this.datexSenderAddressLocation,
            this.datexDestinationText,
            this.datexDestinationAddressLocation,
            this.datexCost,
            this.datexDataPacketTime
        };
    }
}
