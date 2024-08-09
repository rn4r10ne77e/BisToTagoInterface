package com.geon.bis.tago.bistotagointerface.netty.handler;

import com.geon.bis.tago.bistotagointerface.mapper.BusLocationInfo;
import com.geon.bis.tago.bistotagointerface.mapper.model.ParamBusLocationInfo;
import com.geon.bis.tago.bistotagointerface.mapper.model.ResultBusLocationInfo;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.AttributeKey;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class InboundHandler extends ChannelInboundHandlerAdapter {

    private final BusLocationInfo busLocationInfo;

    /* @ChannelHandler.Sharable 일때는 사용하지 말것 채널 파이프라인에서 new 키워드로 인스턴스화 시킨 핸들러만 멤버변수 사용 가능 */
    private ScheduledFuture<?> scheduledFuture;
    private static final AttributeKey<ScheduledFuture<?>> SCHEDULED_FUTURE = AttributeKey.valueOf("scheduledFuture");

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
//      ctx.executor().scheduleAtFixedRate() // 실행 시간 기준
//        ScheduledFuture<?> scheduledFuture = ctx.executor().scheduleWithFixedDelay(()->{
//            log.info("이게 10초마다 실행{}",ctx.channel().remoteAddress());
//            }, 0, 10, TimeUnit.SECONDS
//        ); // 종료 시간 기준

//        ctx.channel().attr(SCHEDULED_FUTURE).set(scheduledFuture);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
//        ctx.channel().attr(SCHEDULED_FUTURE).get().cancel(false);
        log.info("handlerRemoved");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        log.info("channelActive for {}", ctx.channel().remoteAddress());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg)  {

//        CompletableFuture<ResultBusLocationInfo> future = CompletableFuture.supplyAsync(()->{
//            busLocationInfo.delay();
//            log.info("10초 지남");
//            return busLocationInfo.find(ParamBusLocationInfo.builder().build());
//        });
//        future.thenAccept( result -> ctx.writeAndFlush(result.getResultStr()) );
//        future.exceptionally( ex -> {
//            log.error("error : {}", ExceptionUtils.getRootCauseMessage(ex));
//            ctx.writeAndFlush( "ERROR");
//            ctx.close();
//            return ResultBusLocationInfo.builder().build();
//        });
        busLocationInfo.delay();
        ctx.channel().writeAndFlush(busLocationInfo.find(ParamBusLocationInfo.builder().build()).getResultStr());
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("exceptionCaught: {}", ExceptionUtils.getRootCauseMessage(cause));
    }
}