package com.geon.bis.tago.bistotagointerface.netty.config;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import jakarta.annotation.PreDestroy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Slf4j
@RequiredArgsConstructor
@Component
public class NettyServerSocket {
    private final ServerBootstrap serverBootstrap;
    private final InetSocketAddress tcpPort;
    private Channel serverChannel;

    public void start() {
        try {
            // ChannelFuture: I/O operation 의 결과나 상태를 제공하는 객체
            // 지정한 host, port 로 소켓을 바인딩하고 incoming connections 을 받도록 준비함
            ChannelFuture serverChannelFuture = serverBootstrap.bind(tcpPort).sync();
            // ChannelFuture d = serverBootstrap.bind(tcpPort);

            // 서버 소켓이 닫힐 때까지 기다림
            serverChannel = serverChannelFuture.channel().closeFuture().sync().channel();
        }
        catch (InterruptedException e) {
            log.error(e.getMessage());
        }
    }

    // Bean을 제거하기 전에 해야할 작업이 있을 때 설정
    @PreDestroy
    public void stop() {
        if (serverChannel != null) {
            serverChannel.close();
            serverChannel.parent().closeFuture();
        }
    }
}