package com.geon.bis.link.config;

import lombok.Getter;

@Getter
public enum RegionCode {

    TAEAN("태안", 299),
    BORYEONG("보령", 287),
    GEUMSAN("금산", 292),
    CHEONGYANG("청양", 296),
    SEOCHEON("서천", 295);

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
}
