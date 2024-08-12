package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.INTEGER;
import com.oss.asn1.OctetString;
import com.oss.asn1.Sequence;

public class Cost extends Sequence {

    private OctetString amountCurrencyCode;
    private INTEGER amountFactorQuantity;
    private INTEGER amountQuantityQuantity;

    @Override
    public void initComponents() {

        super.mComponents[0] = amountCurrencyCode;
        super.mComponents[1] = amountFactorQuantity;
        super.mComponents[2] = amountQuantityQuantity;
    }
}
