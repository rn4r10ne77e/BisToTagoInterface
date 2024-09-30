package com.geon.bis.link.config;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
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

    // region 목록을 구하는 메서드
    public static List<String> getRegionList() {
        List<String> regions = new ArrayList<>();
        for (RegionCode regionCode : values()) {
            regions.add(regionCode.getRegion());
        }
        return regions;
    }

    // code 목록을 구하는 메서드
    public static List<Integer> getCodeList() {
        List<Integer> codes = new ArrayList<>();
        for (RegionCode regionCode : values()) {
            codes.add(regionCode.getCode());
        }
        return codes;
    }
}
