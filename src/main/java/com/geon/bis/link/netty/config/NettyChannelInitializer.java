package com.geon.bis.link.netty.config;

import com.geon.bis.link.netty.handler.*;
import com.geon.bis.link.tago.config.Util;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {

    private final OutboundHandler outboundHandler;
    private final InboundHandler inboundHandler;

    private final IdleHandler idleHandler;

    private final Util util;

    @Value("${server.read-time}")
    private int idleReadTime;
    @Value("${server.write-time}")
    private int idleWriteTime;

    @Override
    protected void initChannel(SocketChannel ch) {
        ch.pipeline()
                .addLast("TagoEncoder", new TagoEncoder(util))
                .addLast(outboundHandler)
                .addLast("TagoQueue", new MessageQueue())
                .addLast("TagoDecoder", new TagoDecoder(util))
                .addLast(inboundHandler);
    }
}