package com.geon.bis.link.netty.handler;

import com.geon.bis.link.TagoService;
import com.geon.bis.link.tago.datex.iso14827_2.C2CAuthenticatedMessage;
import com.geon.bis.link.mapper.BusLocationInfoMapper;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class InboundHandler extends ChannelInboundHandlerAdapter {

    private final BusLocationInfoMapper busLocationInfoMapper;
    private final TagoService tagoService;
    private final ChannelGroup channelGroup;

    @Value("${datagram-size}")
    private int DATAGRAM_SIZE;
    private ByteBuf byteBuf = null;

    /* @ChannelHandler.Sharable 일때는 사용하지 말것 채널 파이프라인에서 new 키워드로 인스턴스화 시킨 핸들러만 멤버변수 사용 가능 */
//    private ScheduledFuture<?> scheduledFuture;
//    private static final AttributeKey<ScheduledFuture<?>> SCHEDULED_FUTURE = AttributeKey.valueOf("scheduledFuture");

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
        channelGroup.remove(ctx.channel());
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        byteBuf = PooledByteBufAllocator.DEFAULT.directBuffer(DATAGRAM_SIZE, DATAGRAM_SIZE*2);
        channelGroup.add(ctx.channel());
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
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws DecodeNotSupportedException, DecodeFailedException {
        if ( byteBuf.readableBytes() == 0 ){
            return;
        }

        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bytes);
        byteBuf.clear();

        C2CAuthenticatedMessage c2c = tagoService.decodeData(bytes, null);

        // Logout에 대해 처리한다.
        if (c2c.getPdu().hasLogout()) {
//            stopAllTimer();
            ctx.close();
        }
        C2CAuthenticatedMessage rC2c = tagoService.processData(c2c, ctx);
        if( rC2c != null ){
            // 서브스크립션 처리
            if (rC2c.getPdu().hasAccept()) {
                tagoService.processSubscription(rC2c.getPdu().getSubscription(), ctx);
            }
            ctx.writeAndFlush(c2c);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("exceptionCaught: {}", ExceptionUtils.getRootCauseMessage(cause));
    }
}