package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeTimeZone extends Sequence {

    private INTEGER timeZoneHourQty = new INTEGER();
    private INTEGER timeZoneMinuteQty = new INTEGER();

    @Override
    public void initComponents() {
        super.mComponents[0] = timeZoneHourQty;
        super.mComponents[1] = timeZoneMinuteQty;
    }
}
