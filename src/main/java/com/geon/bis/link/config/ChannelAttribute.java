package com.geon.bis.link.config;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.ScheduledFuture;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
public class  ChannelAttribute {

    public static final AttributeKey<ChannelAttribute.ChannelInfo> INFO = AttributeKey.newInstance("channelInfo");

    public void release(ChannelHandlerContext ctx){

        ChannelInfo channelInfo = ctx.channel().attr(INFO).get();
        if( channelInfo.getPubSingle201() != null ){
            channelInfo.getPubSingle201().cancel(true);
            channelInfo.setPubPeriod201(null);
        }
        if( channelInfo.getPubPeriod201() != null ){
            channelInfo.getPubPeriod201().cancel(true);
            channelInfo.setPubPeriod201(null);
        }
        if( channelInfo.getPubEventt201() != null ){
            channelInfo.getPubEventt201().cancel(true);
            channelInfo.setPubEventt201(null);
        }
    }

    public void init(ChannelHandlerContext ctx){
        ctx.channel().attr(INFO).set(ChannelAttribute.ChannelInfo.builder()
                        .sessionConnected(false)
                        .heartbeatDurationMax(0)
                        .responseTimeOut(0)
                        .origin(new ArrayList<>())
                        .destination("")
                .build());
    }

    /**
     * 접속한 채널의 정보. <br>
     * 클라이언트가 접속이 활성화 될때( channelActive ) 생성 <br>
     * 클라이언트의 접속이 종료 될때( channelInactive ) 해제 <br>
     * Channel 객체의 attr 에 담겨 각각의 Handler 에서 참조 가능 <br>
     */
    @Getter
    @Setter
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ChannelInfo {
        private boolean sessionConnected;
        private int heartbeatDurationMax;

        private ScheduledFuture<?> pubSingle201;
        private ScheduledFuture<?> pubPeriod201;
        private ScheduledFuture<?> pubEventt201;
        private int responseTimeOut;
        private List<String> origin;
        private String destination;
    }
}
