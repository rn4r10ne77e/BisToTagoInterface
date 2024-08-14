package com.geon.bis.link.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "accounts")
@Getter
public class AccountProperties {
    private List<Account> accounts;
}
