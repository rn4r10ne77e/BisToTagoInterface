package com.geon.bis.link.config;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Account {
    private String username;
    private String password;
    private List<String> ips;
    private List<String> origins;
}
