package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OutboundCacheHandler extends ChannelOutboundHandlerAdapter {

    private C2CAuthenticatedMessage currentMsg;
    private ChannelHandlerContext currentCtx;

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        currentCtx = ctx;
    }

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        ctx.write(msg, promise);
        currentMsg = (C2CAuthenticatedMessage) msg;
    }

    public void fire(){
        currentCtx.writeAndFlush(currentMsg);
    }
}
