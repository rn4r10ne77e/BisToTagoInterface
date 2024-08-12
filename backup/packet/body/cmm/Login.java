package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import com.oss.asn1.UTF8String16;

public class Login extends Sequence {

    private UTF8String16 datexSenderTxt;
    private UTF8String16 datexDestinationTxt;
    private UTF8String16 datexLoginUserNameTxt;
    private UTF8String16 datexLoginPasswordTxt;
    private DatexLoginEncodingRulesId datexLoginEncodingRulesId;
    private INTEGER datexLoginHeartBeatDurationMaxQty;
    private INTEGER datexLoginResponseTimeOutQty;
    private DatexLoginInitiatorCd datexLoginInitiatorCd;
    private INTEGER datexLoginDatagramSizeQty;

    @Override
    public void initComponents() {
        
        super.mComponents = new AbstractData[]{
            datexSenderTxt,
            datexDestinationTxt,
            datexLoginUserNameTxt,
            datexLoginPasswordTxt,
            datexLoginEncodingRulesId,
            datexLoginHeartBeatDurationMaxQty,
        };

    }
}
