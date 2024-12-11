package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OutboundCacheHandler extends ChannelOutboundHandlerAdapter {

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {

        C2CAuthenticatedMessage packet = (C2CAuthenticatedMessage) msg;
        log.info("아웃바운드 캐시 핸들러에서 받은 메시지: {}",packet.getDatex_DataPacket_number());
        ctx.writeAndFlush(msg, promise);
    }
}
