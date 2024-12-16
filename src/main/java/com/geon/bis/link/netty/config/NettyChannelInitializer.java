package com.geon.bis.link.netty.config;

import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.netty.handler.*;
import com.geon.bis.link.tago.config.BeanUtil;
import com.geon.bis.link.tago.config.Util;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.socket.SocketChannel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {

    private final Util util;
    private final InboundHandler inboundHandler;

    @Override
    protected void initChannel(SocketChannel ch) {

        ch.pipeline()
          .addLast("TagoEncoder", new TagoEncoder(util))
          .addLast("TagoCache",new OutboundCacheHandler())
          .addLast("TagoQueue", new OutboundQueueHandler())
          .addLast("TagoDecoder", new TagoDecoder(util))
          .addLast(inboundHandler);
    }
}