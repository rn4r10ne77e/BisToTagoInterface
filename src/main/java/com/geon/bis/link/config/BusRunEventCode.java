package com.geon.bis.link.config;

import datex.businfomation.BusLocationInfo;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum BusRunEventCode {


//    public static final Tpfc_BusEventCodeNumber enter_BusStop = cNamedNumbers[0];
//    public static final BusLocationInfo.Tpfc_BusEventCodeNumber exit_BusStop = cNamedNumbers[1];
//    public static final BusLocationInfo.Tpfc_BusEventCodeNumber pass_Cross = cNamedNumbers[2];
//    public static final BusLocationInfo.Tpfc_BusEventCodeNumber fixed_Cycle = cNamedNumbers[3];
//    public static final BusLocationInfo.Tpfc_BusEventCodeNumber enter_Cross = cNamedNumbers[4];
//    public static final BusLocationInfo.Tpfc_BusEventCodeNumber exit_Cross = cNamedNumbers[5];


    PASS_SPOT("pass_Cross", 13),
    STATION_ARRIVAL("enter_BusStop", 11),
    STATION_DEPARTURE("exit_BusStop", 12),
    FIXED_CYCLE("fixed_Cycle", 21);

    private final String description;
    private final int code;

    BusRunEventCode(String description, int code) {
        this.description = description;
        this.code = code;
    }

    public static BusRunEventCode findByCode(int code) {
        for (BusRunEventCode eventCode : values()) {
            if (eventCode.getCode() == code) {
                return eventCode;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }

    public static BusRunEventCode findByDescription(String description) {
        for (BusRunEventCode eventCode : values()) {
            if (eventCode.getDescription().equals(description)) {
                return eventCode;
            }
        }
        throw new IllegalArgumentException("Invalid description: " + description);
    }

}
