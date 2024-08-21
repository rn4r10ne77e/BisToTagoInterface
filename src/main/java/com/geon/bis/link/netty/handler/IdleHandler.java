package com.geon.bis.link.netty.handler;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.timeout.IdleStateEvent;
import io.netty.util.AttributeKey;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class IdleHandler extends ChannelDuplexHandler {

    @Value("${setting.idle.read-time}")
    private int idleReadTime;
    @Value("${setting.idle.write-time}")
    private int idleWriteTime;

    private static final AttributeKey<Integer> HEARTBEAT_COUNT = AttributeKey.valueOf("heartbeatCount");

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.channel().attr(HEARTBEAT_COUNT).set(0);
        super.channelActive(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ctx.channel().attr(HEARTBEAT_COUNT).set(0);
        super.channelRead(ctx, msg);
    }

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {

        if(evt instanceof IdleStateEvent e){
            switch (e.state()) {
                case READER_IDLE -> {
                    log.info("'{}'로부터 '{}'초 동안 입력이 없음", ctx.channel().remoteAddress(), idleReadTime);
                    Integer count = ctx.channel().attr(HEARTBEAT_COUNT).get();
                    if( count == null ) count = 0;
                    if( count < 2 ) {
                        ctx.writeAndFlush("AreYouOk?");
                        ctx.channel().attr(HEARTBEAT_COUNT).set(count + 1);
                        log.info("나 지금 '{}'번째 물어봤어",count + 1);
                    } else {
                        log.info("두번 물어봤는데 답이 없어? 그럼 꺼져");
                        ctx.close();
                    }
                }
                case ALL_IDLE -> {
                    log.info("어색한 침묵 상태");
                }
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}
