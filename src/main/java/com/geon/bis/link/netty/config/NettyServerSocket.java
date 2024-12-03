package com.geon.bis.link.netty.config;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

@Slf4j
@RequiredArgsConstructor
@Component
public class NettyServerSocket {

    private final ServerBootstrap serverBootstrap;
    private final EventLoopGroup workerGroup;
    private final InetSocketAddress tcpPort;
    private Channel serverChannel;

    public void start() {
        try {
            ChannelFuture serverChannelFuture = serverBootstrap.bind(tcpPort).sync();
            serverChannel = serverChannelFuture.channel().closeFuture().sync().channel();
        }
        catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }

    @PreDestroy
    public void stop() {
        if (serverChannel != null) {
            serverChannel.close();
            serverChannel.parent().closeFuture();
        }
    }
}