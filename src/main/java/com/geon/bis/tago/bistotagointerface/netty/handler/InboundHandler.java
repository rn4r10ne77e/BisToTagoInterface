package com.geon.bis.tago.bistotagointerface.netty.handler;

import com.geon.bis.tago.bistotagointerface.mapper.BusCompMapper;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledFuture;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class InboundHandler extends ChannelInboundHandlerAdapter {

    private final BusCompMapper busCompMapper;

    /* @ChannelHandler.Sharable 일때는 사용하지 말것 채널 파이프라인에서 new 키워드로 인스턴스화 시킨 핸들러만 멤버변수 사용 가능 */
    private ScheduledFuture<?> scheduledFuture;

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
//      ctx.executor().scheduleAtFixedRate() // 실행 시간 기준

//        scheduledFuture = ctx.executor().scheduleAtFixedRate(()->{
//
//            log.info("이게 5초마다 실행이 될까? {} ", testMapper.list());
//
//
//            }, 0, 1, TimeUnit.SECONDS
//        ); // 종료 시간 기준
        log.info("handlerAdded");
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
//        scheduledFuture.cancel(false);
        log.info("handlerRemoved");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        log.info("channelActive for {}", ctx.channel().remoteAddress());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg){
        log.info("받은 메세지 \n{}", ByteBufUtil.prettyHexDump((ByteBuf) msg));
        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        log.info("channelReadComplete 호출 : 수신 완료");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // Close the connection when an exception is raised.
        ctx.close();
        log.info(cause.getMessage());
    }

}