package com.geon.bis.link;

import com.geon.bis.link.config.AccountProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AccountProperties.class)
@SpringBootApplication
public class BisToTagoInterfaceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BisToTagoInterfaceApplication.class)
                .properties("spring.config.location=classpath:application.yml,classpath:accounts.yml")
                .run(args);
    }
}
