package com.geon.bis.link.config;

import datex.Datex;
import datex.iso14827_2.C2CAuthenticatedMessage;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.ScheduledFuture;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@Component
public class  ChannelAttribute {

    public static final AttributeKey<ChannelAttribute.ChannelInfo> INFO = AttributeKey.newInstance("channelInfo");

    public void release(ChannelHandlerContext ctx){

        ChannelInfo channelInfo = ctx.channel().attr(INFO).get();

        if( channelInfo.getPub201() != null ){
            channelInfo.getPub201().cancel(true);
            channelInfo.setPub201(null);
        }
        if( channelInfo.getPub202() != null ){
            channelInfo.getPub202().cancel(true);
            channelInfo.setPub202(null);
        }
        if( channelInfo.getPub207() != null ){
            channelInfo.getPub207().cancel(true);
            channelInfo.setPub207(null);
        }

        if( channelInfo.getPub208() != null ){
            channelInfo.getPub208().cancel(true);
            channelInfo.setPub208(null);
        }
    }

    public void init(ChannelHandlerContext ctx){
        ctx.channel().attr(INFO).set(ChannelInfo.builder()
                        .sessionConnected(false)
                        .heartbeatDurationMax(0)
                        .responseTimeOut(0)
                        .messages(new LinkedBlockingQueue<>())
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
        private boolean subGuarantee;
        private Queue<C2CAuthenticatedMessage> messages;

        private ScheduledFuture<?> pub201;
        private ScheduledFuture<?> pub202;
        private ScheduledFuture<?> pub207;
        private ScheduledFuture<?> pub208;

        private int responseTimeOut;
        private List<String> origin;
        private String destination;
    }
}
