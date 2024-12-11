package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Slf4j
@RequiredArgsConstructor
public class OutboundQueueHandler extends ChannelOutboundHandlerAdapter {

  private final Queue<C2CAuthenticatedMessage> queue = new ConcurrentLinkedQueue<>();
  private ScheduledFuture<?> scheduledFuture;
  private ChannelHandlerContext currentCtx;
  private final int queueMaxSize = 10000;

  private final DefaultEventExecutorGroup executors = new DefaultEventExecutorGroup(10);

  @Override
  public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
    currentCtx = ctx;
//    currentCtx.executor().scheduleAtFixedRate(() -> {
//      executors.submit(()->{
//        synchronized (queue) {
//          int queueSize = queue.size();
//          log.info("Current queue size: {}/{}", queueSize, queueMaxSize);
//          currentCtx.pipeline().context(OutboundCacheHandler.class).writeAndFlush(queue.poll());
//          if (queueSize >= queueMaxSize) {
//            queue.clear();
//          }
//        }
//      });
//
//    }, 0, 5, TimeUnit.SECONDS);

  }
  @Override
  public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
    // 데이터 전송일 경우에 만 큐에 담아 두기
    if (((C2CAuthenticatedMessage)msg).getPdu().hasPublication()) {
      if( queue.isEmpty() ) {
        super.write(ctx, msg, promise);
      }
      queue.offer((C2CAuthenticatedMessage)msg);
    } else {
      super.write(ctx, msg, promise);
    }
  }
  // 퍼블리케이션에 대한 Accept 를 받았을 때 메세지 큐에서 삭제 한다.
  public void fire( long packetNo, boolean isAccept ) {
    if( isAccept ){ // case accept
//      queue.removeIf( e -> e.getDatex_DataPacket_number() == packetNo );
      queue.poll();
      if( !queue.isEmpty() ) {
        currentCtx.pipeline().context(OutboundCacheHandler.class).writeAndFlush(queue.peek());
      }
    } else { // case reject
      if( !queue.isEmpty() ) {
        log.info("가져온 메시지: {}",queue.peek().getDatex_DataPacket_number());
        currentCtx.pipeline().context(OutboundCacheHandler.class).writeAndFlush(queue.peek());
      }
    }

  }

  @Override
  public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
    if( scheduledFuture != null ) {
      scheduledFuture.cancel(true);
      scheduledFuture = null;
    }


    executors.shutdownGracefully();
    queue.clear();
    super.handlerRemoved(ctx);
  }
}
