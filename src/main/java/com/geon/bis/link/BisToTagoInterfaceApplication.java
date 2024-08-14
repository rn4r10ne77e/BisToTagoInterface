package com.geon.bis.link;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BisToTagoInterfaceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BisToTagoInterfaceApplication.class)
                .properties("spring.config.location=classpath:application.yml,classpath:accounts.yml")
                .run(args);
    }

}
