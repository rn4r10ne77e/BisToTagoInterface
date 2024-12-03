package com.geon.bis.link.netty.handler;

import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledFuture;

@Slf4j
@RequiredArgsConstructor
public class OutboundQueueHandler extends ChannelOutboundHandlerAdapter {

  private final Queue<C2CAuthenticatedMessage> queue = new LinkedList<>();
  private ScheduledFuture<?> scheduledFuture;
  private ChannelHandlerContext currentCtx;
  private final int queueMaxSize= 1000;

  @Override
  public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
    currentCtx = ctx;
    scheduledFuture = ctx.executor().scheduleAtFixedRate(() -> {
      int queueSize = queue.size();
      log.info("Current queue size: {}/{}", queueSize,queueMaxSize);
      log.info("Current queue packet numbers : {}",queue.stream().map(C2CAuthenticatedMessage::getDatex_DataPacket_number).toList());

      if( queueSize >= queueMaxSize ) { queue.clear(); }

    },0,3,java.util.concurrent.TimeUnit.SECONDS);
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
      queue.removeIf( e -> e.getDatex_DataPacket_number() == packetNo );
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
    queue.clear();
    if( scheduledFuture != null ) {
      scheduledFuture.cancel(true);
      scheduledFuture = null;
    }
    super.handlerRemoved(ctx);
  }
}
