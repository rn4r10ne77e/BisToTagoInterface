package com.geon.bis.link.config;

import lombok.Getter;

import java.util.Objects;

@Getter
public enum RegionCode {

    TAEAN("taean", 299),
    BORYEONG("boryeong", 287),
    GEUMSAN("geumsan", 292),
    CHEONGYANG("cheongyang", 296),
    SEOCHEON("seocheon", 295);

    private final String region;
    private final int code;

    RegionCode(String region, int code) {
        this.region = region;
        this.code = code;
    }

    public static RegionCode findByCode(int code) {
        for (RegionCode region : values()) {
            if (region.getCode() == code) {
                return region;
            }
        }
        throw new IllegalArgumentException("Invalid code: " + code);
    }
    public static RegionCode findByRegion(String name) {
        for (RegionCode region : values()) {
            if (region.getRegion().equals(name)) {
                return region;
            }
        }
        throw new IllegalArgumentException("Invalid name: " + name);
    }
}
