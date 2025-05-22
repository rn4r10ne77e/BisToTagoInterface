package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@Slf4j
@RequiredArgsConstructor
public class OutboundQueueHandler extends ChannelOutboundHandlerAdapter {

  private final Queue<C2CAuthenticatedMessage> queue = new ConcurrentLinkedQueue<>();
  private ScheduledFuture<?> scheduledFuture;
  private ChannelHandlerContext currentCtx;
  private final int queueMaxSize = 50000;

  private final DefaultEventExecutorGroup executors = new DefaultEventExecutorGroup(10);
  private final AtomicReference<LocalDateTime> stamp = new AtomicReference<>(LocalDateTime.now());

  @Override
  public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
    currentCtx = ctx;

    // Schedule the task to run every 5 seconds
    scheduledFuture = currentCtx.executor().scheduleAtFixedRate(() -> {
      try {
        executors.submit(() -> {
          try {
            int queueSize = queue.size();
            log.info("CURRENT QUEUE SIZE : {}/{}", queueSize, queueMaxSize);

            if (stamp.get().isBefore(LocalDateTime.now().minusSeconds(5))) {
              log.info("RECENT ACCEPT DATE : {}", stamp.get());

              C2CAuthenticatedMessage msg = queue.poll();
              if (msg != null) {
                log.info("RESEND AFTER 5 SECONDS: {}", msg);
                currentCtx.writeAndFlush(msg);
              } else {
                log.info("QUEUE IS NULL");
              }
            }

            if (queueSize >= queueMaxSize) {
              log.warn("QUEUE SIZE EXCEEDED! CLEARING QUEUE!");
              queue.clear();
            }
          } catch (Exception e) {
            log.error("Error in scheduled task", e);
          }
        });
      } catch (Exception e) {
        log.error("Error in scheduleAtFixedRate task", e);
      }
    }, 0, 5, TimeUnit.SECONDS);
  }

  @Override
  public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
    try {
      if (((C2CAuthenticatedMessage) msg).getPdu().hasPublication()) {
        if (queue.isEmpty()) {
          ctx.writeAndFlush(msg, promise);
        }
        if (queue.size() < queueMaxSize) {
          queue.offer((C2CAuthenticatedMessage) msg);
        } else {
          log.warn("QUEUE IS FULL, MESSAGE DROPPED: {}", msg);
        }
      } else {
        ctx.writeAndFlush(msg, promise);
      }
    } catch (Exception e) {
      log.error("Error while writing message", e);
      throw e;
    }
  }

  public void fire(long packetNo, boolean isAccept) {
    if (isAccept) { // case accept
      stamp.set(LocalDateTime.now());
      queue.poll();
      if (!queue.isEmpty()) {
        currentCtx.pipeline().context(OutboundCacheHandler.class).writeAndFlush(queue.peek());
      }
    } else { // case reject
      if (!queue.isEmpty()) {
        log.info("가져온 메시지: {}", queue.peek().getDatex_DataPacket_number());
        currentCtx.pipeline().context(OutboundCacheHandler.class).writeAndFlush(queue.peek());
      }
    }
  }

  @Override
  public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
    if (scheduledFuture != null) {
      scheduledFuture.cancel(true);
      scheduledFuture = null;
    }

    executors.shutdownGracefully();
    queue.clear();
    super.handlerRemoved(ctx);
  }
}
