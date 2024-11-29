package com.geon.bis.link.netty;

import com.geon.bis.link.config.ChannelAttribute;
import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Queue;

import static com.geon.bis.link.config.ChannelAttribute.INFO;

@Slf4j
@Getter
@Setter
@Component
@RequiredArgsConstructor
public class NettyMessageQueue {

  private final ChannelGroup channelGroup;

  private boolean QueueMode = false;


  public void send(){
    for( Channel ch : channelGroup ){
      ChannelAttribute.ChannelInfo info = ch.attr(INFO).get();
      Queue<C2CAuthenticatedMessage> queue = info.getMessages();
      while(ch.isWritable() && !queue.isEmpty() ){

        ch.writeAndFlush(queue.poll());
        log.info("현재 큐 사이즈: {}",queue.size());
      }
    }
  }
}
