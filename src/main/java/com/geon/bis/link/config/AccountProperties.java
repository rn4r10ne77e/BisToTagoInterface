package com.geon.bis.link.config;

import jdk.jfr.SettingDefinition;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Primary
@Configuration
@Getter
@Setter
@ConfigurationProperties(prefix = "accounts")
public class AccountProperties {
    private List<Account> account;
}
