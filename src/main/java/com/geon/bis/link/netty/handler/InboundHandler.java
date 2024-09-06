package com.geon.bis.link.netty.handler;

import com.geon.bis.link.TagoService;
import com.geon.bis.link.config.ChannelAttribute;
import datex.iso14827_2.C2CAuthenticatedMessage;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import datex.iso14827_2.PDUs;
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

import java.net.InetSocketAddress;

@Slf4j
@Component
@ChannelHandler.Sharable
@RequiredArgsConstructor
public class InboundHandler extends ChannelInboundHandlerAdapter {

    private final TagoService tagoService;
    private final ChannelGroup channelGroup;
    private final ChannelAttribute channelAttribute;

    @Value("${server.datagram-size}")
    private int DATAGRAM_SIZE;
    private ByteBuf byteBuf = null;

    /* @ChannelHandler.Sharable 일때는 사용하지 말것 채널 파이프라인에서 new 키워드로 인스턴스화 시킨 핸들러만 멤버변수 사용 가능 */
//    private ScheduledFuture<?> scheduledFuture;
//    private static final AttributeKey<ScheduledFuture<?>> SCHEDULED_FUTURE = AttributeKey.valueOf("scheduledFuture");

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        byteBuf = PooledByteBufAllocator.DEFAULT.directBuffer(DATAGRAM_SIZE, DATAGRAM_SIZE*2);
        channelAttribute.init(ctx);
        channelGroup.add(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        byteBuf.release();
        channelAttribute.release(ctx);
        channelGroup.remove(ctx.channel());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        C2CAuthenticatedMessage c2c = (C2CAuthenticatedMessage) msg;
//        log.info("received : {}", c2c);
        switch (c2c.getPdu().getChosenFlag()) {

            case PDUs.login_chosen:
                ctx.writeAndFlush(tagoService.responseLogin(c2c, ctx));
                break;

            case PDUs.fred_chosen:
                ctx.writeAndFlush(tagoService.responseFrED());
                break;

            case PDUs.logout_chosen:
                break;

            case PDUs.subscription_chosen:
                C2CAuthenticatedMessage rtnC2c = tagoService.responseSubscription(c2c, ctx);
                if (rtnC2c.getPdu().hasAccept()) {
                    tagoService.processSubscription(c2c.getPdu().getSubscription(), ctx);
                }
                ctx.writeAndFlush(rtnC2c);
                break;

            case PDUs.transfer_done_chosen:
//                return tagoService.responseTransferDone(c2c);
                break;

            case PDUs.accept_chosen:

//                log.info(" accept ------------- : {}", c2c.getPdu().getAccept().getDatexAccept_Type());
                break;
            case PDUs.reject_chosen:
                log.debug(c2c.toString());
//                tagoService.acceptRejectPublication(c2c);
                break;
            /*
            case PDUs.publication_chosen:
                break;
            */
            default:
                log.info("[" + c2c.getPdu().getChosenFlag() + "] received");
                log.debug(c2c.toString());

                break;
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("exceptionCaught: {}", ExceptionUtils.getRootCauseMessage(cause));
        channelGroup.remove(ctx.channel());
        channelAttribute.release(ctx);
        ctx.close();
    }
}