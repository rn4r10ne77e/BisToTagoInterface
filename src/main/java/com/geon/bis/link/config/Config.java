package com.geon.bis.link.config;

import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.ASN1Project;
import com.oss.asn1.Coder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.ChannelGroupFuture;
import io.netty.channel.group.ChannelMatcher;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collection;
import java.util.Iterator;

@Configuration
@EnableConfigurationProperties(AccountProperties.class)
@RequiredArgsConstructor
public class Config {

    private final Util util;

    @Bean
    public Coder getCoder(){
        return util.getCoder();
    }

    @Bean
    public ChannelGroup getChannelGroup(){
        return new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    }
}
