package com.geon.bis.link.netty.config;

import com.geon.bis.link.netty.handler.IdleHandler;
import com.geon.bis.link.netty.handler.InboundHandler;
import com.geon.bis.link.netty.handler.OutboundHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NettyChannelInitializer extends ChannelInitializer<SocketChannel> {
    private final OutboundHandler outboundHandler;
    private final InboundHandler inboundHandler;
    private final IdleHandler idleHandler;

    @Value("${setting.idle.read-time}")
    private int idleReadTime;
    @Value("${setting.idle.write-time}")
    private int idleWriteTime;

    @Override
    protected void initChannel(SocketChannel ch) {
        ChannelPipeline pipeline = ch.pipeline();

//        pipeline.addLast("idleStateHandler", new IdleStateHandler(idleReadTime, idleWriteTime,0));
//        pipeline.addLast("idleHandler", idleHandler);
//        pipeline.addLast("TestDecoder", new TestDecoder()); //
        pipeline.addLast("StringEncoder", new StringEncoder());
        pipeline.addLast(outboundHandler);
        pipeline.addLast("StringDecoder", new StringDecoder());
        pipeline.addLast(inboundHandler);


    }
}