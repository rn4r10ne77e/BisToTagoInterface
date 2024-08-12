package com.geon.bis.link.config;

import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.ASN1Project;
import com.oss.asn1.Coder;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Config {

    private final Util util;

    @Bean
    public Coder getCoder(){
        return util.getCoder();
    }
}
