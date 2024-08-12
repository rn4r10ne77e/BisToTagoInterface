package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Initiate extends Sequence {

    private UTF8String16 datexSenderTxt;
    private UTF8String16 datexDestinationTxt;

    @Override
    public void initComponents() {

        super.mComponents = new AbstractData[] {
            this.datexSenderTxt,
            this.datexDestinationTxt
        };
    }
}
