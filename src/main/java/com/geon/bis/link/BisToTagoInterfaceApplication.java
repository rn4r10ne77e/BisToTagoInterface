package com.geon.bis.link;

import com.geon.bis.link.config.AccountProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Slf4j
@EnableConfigurationProperties(AccountProperties.class)
@SpringBootApplication
public class BisToTagoInterfaceApplication {

    public static void main(String[] args) {

        String activeProfile = System.getProperty("spring.profiles.active");
        String configLocation = "conf/application.yml,conf/accounts.yml";
        configLocation = switch (activeProfile) {
            case "dev" -> "conf/application.yml,conf/application-dev.yml,conf/accounts.yml";
            case "vpn" -> "file:conf/application.yml,file:conf/application-vpn.yml,file:conf/accounts.yml";
            case "prod" -> "file:conf/application.yml,file:conf/application-prod.yml,file:conf/accounts.yml";
            default -> configLocation;
        };

        // Log4jdbc 설정 파일 경로 설정
        String log4jdbcConfigPath = "file:conf/log4jdbc.log4j2.properties";
        System.setProperty("log4jdbc.config.file", log4jdbcConfigPath);
        log.info("Log4jdbc configuration set to: {}", log4jdbcConfigPath);

        new SpringApplicationBuilder(BisToTagoInterfaceApplication.class)
                .properties(String.format("spring.config.location=%s",configLocation))
                .run(args);
    }
}
