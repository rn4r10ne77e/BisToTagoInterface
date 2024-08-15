package com.geon.bis.link.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Getter
@Setter
public class Account {
    private String username;
    private String password;
    private String ip;
    private List<String> origins;
}
