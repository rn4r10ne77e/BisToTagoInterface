package com.geon.bis.link.netty.handler;

import com.geon.bis.link.tago.datex.iso14827_2.C2CAuthenticatedMessage;
import com.geon.bis.link.tago.datex.iso14827_2.DatexDataPacket;
import com.geon.bis.link.tago.config.Util;
import com.geon.bis.link.mapper.BusLocationInfo;
import com.geon.bis.link.mapper.model.ParamBusLocationInfo;
import com.oss.asn1.Coder;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.OctetString;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class InboundHandler extends ChannelInboundHandlerAdapter {

    private final BusLocationInfo busLocationInfo;
    private final Util util;
    private final Coder coder;



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
        log.info("handlerRemoved");
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        byteBuf = PooledByteBufAllocator.DEFAULT.directBuffer(DATAGRAM_SIZE, DATAGRAM_SIZE*2);
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
        if ( byteBuf.readableBytes() == 0 ){
            return;
        }

        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.readBytes(bytes);
        byteBuf.clear();

        decodeData(bytes);

    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("exceptionCaught: {}", ExceptionUtils.getRootCauseMessage(cause));
    }

    private void decodeData(byte[] bytes) {
        C2CAuthenticatedMessage c2c = null;

        try {
            if (bytes != null) {
                ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

                DatexDataPacket datexDataPacket = null;
                datexDataPacket = coder.decode(bais, new DatexDataPacket());
                datexDataPacket.getDatex_Version_number(); // nothing
                OctetString datex_Data = datexDataPacket.getDatex_Data();
                OctetString Crc = new OctetString(util.getCrc16(datex_Data.byteArrayValue()));

                if (!Crc.equalTo(datexDataPacket.getDatex_Crc_nbr())) {
                    log.warn("[CRC error] Correct = " + Crc.toString() + ", Wrong = "
                            + datexDataPacket.getDatex_Crc_nbr().toString());
                }

                bais = new ByteArrayInputStream(datex_Data.byteArrayValue());

                c2c = (C2CAuthenticatedMessage) coder.decode(bais, new C2CAuthenticatedMessage());
            }
        } catch (DecodeFailedException | DecodeNotSupportedException e) {
            log.error(e.getMessage());
            return;
        }

        //processData(c2c);
    }







}