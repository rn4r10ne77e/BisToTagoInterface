package com.geon.bis.link.config;

import datex.Datex;
import datex.iso14827_2.C2CAuthenticatedMessage;
import datex.iso14827_2.DatexDataPacket;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.ScheduledFuture;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

@Component
public class  ChannelAttribute {

    public static final AttributeKey<ChannelAttribute.ChannelInfo> INFO = AttributeKey.newInstance("channelInfo");

    public void release(ChannelHandlerContext ctx){

        ChannelInfo channelInfo = ctx.channel().attr(INFO).get();
        channelInfo.setStorage(null);

        if (channelInfo.getPub201boryeong() != null ) {
            channelInfo.getPub201boryeong().cancel(true);
            channelInfo.setPub202boryeong(null);
        }
        if (channelInfo.getPub201cheongyang() != null) {
            channelInfo.getPub201cheongyang().cancel(true);
            channelInfo.setPub202cheongyang(null);
        }
        if (channelInfo.getPub201taean() != null) {
            channelInfo.getPub201taean().cancel(true);
            channelInfo.setPub202taean(null);
        }
        if (channelInfo.getPub201seocheon() != null) {
            channelInfo.getPub201seocheon().cancel(true);
            channelInfo.setPub202seocheon(null);
        }
        if (channelInfo.getPub201geumsan() != null) {
            channelInfo.getPub201geumsan().cancel(true);
            channelInfo.setPub202geumsan(null);
        }

        if (channelInfo.getPub202boryeong() != null ) {
            channelInfo.getPub202boryeong().cancel(true);
            channelInfo.setPub202boryeong(null);
        }
        if (channelInfo.getPub202cheongyang() != null ) {
            channelInfo.getPub202cheongyang().cancel(true);
            channelInfo.setPub202cheongyang(null);
        }
        if (channelInfo.getPub202taean() != null ) {
            channelInfo.getPub202taean().cancel(true);
            channelInfo.setPub202taean(null);
        }
        if (channelInfo.getPub202seocheon() != null ) {
            channelInfo.getPub202seocheon().cancel(true);
            channelInfo.setPub202seocheon(null);
        }
        if (channelInfo.getPub202geumsan() != null ) {
            channelInfo.getPub202geumsan().cancel(true);
            channelInfo.setPub202geumsan(null);
        }

        if( channelInfo.getPub207boryeong() != null ) {
            channelInfo.getPub207boryeong().cancel(true);
            channelInfo.setPub207boryeong(null);
        }
        if( channelInfo.getPub207cheongyang() != null ) {
            channelInfo.getPub207cheongyang().cancel(true);
            channelInfo.setPub207cheongyang(null);
        }
        if( channelInfo.getPub207taean() != null ) {
            channelInfo.getPub207taean().cancel(true);
            channelInfo.setPub201taean(null);
        }
        if( channelInfo.getPub207seocheon() != null ) {
            channelInfo.getPub207seocheon().cancel(true);
            channelInfo.setPub207seocheon(null);
        }
        if( channelInfo.getPub207geumsan() != null ) {
            channelInfo.getPub207geumsan().cancel(true);
            channelInfo.setPub207geumsan(null);
        }

        if( channelInfo.getPub208() != null ) {
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
                        .storage(new ArrayList<>())
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
        private List<C2CAuthenticatedMessage> storage;

        private ScheduledFuture<?> pub201boryeong;
        private ScheduledFuture<?> pub201cheongyang;
        private ScheduledFuture<?> pub201taean;
        private ScheduledFuture<?> pub201seocheon;
        private ScheduledFuture<?> pub201geumsan;

        private ScheduledFuture<?> pub202boryeong;
        private ScheduledFuture<?> pub202cheongyang;
        private ScheduledFuture<?> pub202taean;
        private ScheduledFuture<?> pub202seocheon;
        private ScheduledFuture<?> pub202geumsan;

        private ScheduledFuture<?> pub207boryeong;
        private ScheduledFuture<?> pub207cheongyang;
        private ScheduledFuture<?> pub207taean;
        private ScheduledFuture<?> pub207seocheon;
        private ScheduledFuture<?> pub207geumsan;

        private ScheduledFuture<?> pub208;

        private int responseTimeOut;
        private List<String> origin;
        private String destination;

        private long dataPacketNumber;

        public long getDataPacketNumber(){
            return ++dataPacketNumber;
        }
        private long subSerialNbr;
        public long getSubSerialNbr(){
            return ++subSerialNbr;
        }
        private long pubSerialNbr;
        public long getPubSerialNbr(){
            return ++pubSerialNbr;
        }

    }
}
