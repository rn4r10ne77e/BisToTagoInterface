package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;

public class PDUs extends Choice {

    public static final int  datex_initiate_null_chosen = 1;
    public static final int  login_chosen = 2;
    public static final int  fred_chosen = 3;
    public static final int  terminate_chosen = 4;
    public static final int  logout_chosen = 5;
    public static final int  subscription_chosen = 6;
    public static final int  publication_chosen = 7;
    public static final int  transfer_done_chosen = 8;
    public static final int  accept_chosen = 9;
    public static final int  reject_chosen = 10;



    @Override
    public AbstractData createInstance(int i) {
        switch (i) {
            case datex_initiate_null_chosen -> { return new Initiate(); }
            case login_chosen -> { return new Login(); }
            default -> throw new InternalError("Choice.createInstance()");
        }
    }




}
