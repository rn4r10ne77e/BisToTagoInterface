package com.geon.bis.link.config;

import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.Coder;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

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
    public ChannelGroup getTagoChannelGroup(){
        return new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
