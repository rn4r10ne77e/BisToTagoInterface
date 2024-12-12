package com.geon.bis.link.netty.handler;

import com.geon.bis.link.TagoService;
import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.tago.config.BeanUtil;
import datex.iso14827_2.C2CAuthenticatedMessage;
import datex.iso14827_2.PDUs;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.group.ChannelGroup;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

@Slf4j

public class InboundHandler extends ChannelInboundHandlerAdapter {

    private TagoService tagoService;
    private ChannelGroup channelGroup;
    private ChannelAttribute channelAttribute;

    @Override
    public void channelActive(ChannelHandlerContext ctx) {

        channelGroup = BeanUtil.getBeanByName("tagoChannelGroup", ChannelGroup.class);
        channelAttribute = BeanUtil.getBeanByType(ChannelAttribute.class);

        this.tagoService = new TagoService();
        channelAttribute.init(ctx);
        channelGroup.add(ctx.channel());
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {

        channelAttribute.release(ctx);
        channelGroup.remove(ctx.channel());
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        C2CAuthenticatedMessage c2c = (C2CAuthenticatedMessage) msg;
        switch (c2c.getPdu().getChosenFlag()) {

            case PDUs.login_chosen:
                ctx.writeAndFlush(tagoService.responseLogin(c2c, ctx));
                break;

            case PDUs.fred_chosen:
                ctx.writeAndFlush(tagoService.responseFrED(ctx));
                break;

            case PDUs.logout_chosen:
                break;

            case PDUs.subscription_chosen:
                C2CAuthenticatedMessage rtnC2c = tagoService.responseSubscription(c2c, ctx);
                if ( rtnC2c.getPdu().hasAccept() ) {
                    tagoService.processSubscription(c2c, ctx);
                }
                ctx.writeAndFlush(rtnC2c);
                break;

            case PDUs.accept_chosen:
            case PDUs.reject_chosen:
                log.info("accept or reject : {}",c2c);
                tagoService.acceptRejectPublication(c2c, ctx);
                break;
            default:
                log.debug("[{}] received",c2c.getPdu().getChosenFlag());
                break;
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("exceptionCaught: {}", ExceptionUtils.getStackTrace(cause));
        channelAttribute.release(ctx);
        channelGroup.remove(ctx.channel());
        ctx.close();
    }


    @Override
    public void channelWritabilityChanged( ChannelHandlerContext ctx ){
        boolean writable = ctx.channel().isWritable();
        if( writable ){
            log.error("Channel writable");
        } else {
            log.error("Channel not writable");
        }
        ctx.fireChannelWritabilityChanged();
    }

}