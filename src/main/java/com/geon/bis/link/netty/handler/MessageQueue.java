package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import lombok.extern.slf4j.Slf4j;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Slf4j
public class MessageQueue extends ChannelOutboundHandlerAdapter {

  private final Queue<C2CAuthenticatedMessage> queue = new LinkedBlockingQueue<>();

  @Override
  public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
    ctx.executor().scheduleAtFixedRate(() -> {
      int queueSize = queue.size();
      log.info("Current queue size: {}", queueSize);
    }, 0, 5, java.util.concurrent.TimeUnit.SECONDS);
  }

  @Override
  public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
    queue.offer((C2CAuthenticatedMessage)msg);

    while (ctx.channel().isWritable() && !queue.isEmpty()) {
      ctx.writeAndFlush(queue.poll());
    }
  }
  @Override
  public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
    super.handlerRemoved(ctx);
  }

}
