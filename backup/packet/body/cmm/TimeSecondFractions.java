package com.geon.bis.tago.bistotagointerface.packet.body.cmm;

import com.oss.asn1.AbstractData;
import com.oss.asn1.Choice;
import com.oss.asn1.INTEGER;
import com.oss.metadata.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimeSecondFractions extends Choice {

    public static final int deci_seconds_chosen = 1;
    public static final int centi_seconds_chosen = 2;
    public static final int milliseconds_chosen = 3;

    @Override
    public AbstractData createInstance(int i) {
        switch (i) {
            case deci_seconds_chosen -> {
                return new INTEGER();
            }
            case centi_seconds_chosen -> {
                return new INTEGER();
            }
            case milliseconds_chosen -> {
                return new INTEGER();
            }
            default -> throw new InternalError("Choice.df");
        }
    }
}
