package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.AbstractData;
import com.oss.asn1.INTEGER;
import com.oss.asn1.Sequence;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Time extends Sequence {

    public static final com.oss.asn1.INTEGER time_Hour_qty__default = new com.oss.asn1.INTEGER(0);
    public static final com.oss.asn1.INTEGER time_Minute_qty__default = new com.oss.asn1.INTEGER(0);
    public static final com.oss.asn1.INTEGER time_Second_qty__default = new com.oss.asn1.INTEGER(0);

    private INTEGER timeYearQty = new INTEGER();
    private INTEGER timeMonthQty = new INTEGER();
    private INTEGER timeDayQty = new INTEGER();
    private INTEGER timeHourQty = new INTEGER();
    private INTEGER timeMinuteQty = new INTEGER();
    private INTEGER timeSecondQty = new INTEGER();
    private TimeSecondFractions timeSecondFractions = new TimeSecondFractions();
    private TimeTimeZone timeTimeZone = new TimeTimeZone();

    {
        super.mComponents = new AbstractData[8];
    }

    @Override
    public void initComponents() {
        super.mComponents[0] = timeYearQty;
        super.mComponents[1] = timeMonthQty;
        super.mComponents[2] = timeDayQty;
        super.mComponents[3] = timeHourQty;
        super.mComponents[4] = timeMinuteQty;
        super.mComponents[5] = timeSecondQty;
        super.mComponents[6] = timeSecondFractions;
        super.mComponents[7] = timeTimeZone;
    }
}
