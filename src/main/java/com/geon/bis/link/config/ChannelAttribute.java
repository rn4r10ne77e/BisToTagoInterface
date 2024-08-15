package com.geon.bis.link.config;

import io.netty.channel.Channel;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.ScheduledFuture;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChannelAttribute {



    public static final AttributeKey<Boolean> IS_SESSION_CONNECTED = AttributeKey.valueOf("isSessionConnected");
    public static final AttributeKey<Integer> HEARTBEAT_DURATION_MAX = AttributeKey.valueOf("heartbeatDurationMax");
    public static final AttributeKey<Integer> RESPONSE_TIMEOUT = AttributeKey.valueOf("responseTimeOut");
    public static final AttributeKey<ScheduledFuture<?>> PERIOD_PUBLISH = AttributeKey.valueOf("periodPublish");
    public static final AttributeKey<List<String>> ORIGIN = AttributeKey.valueOf("origin");
    public static final AttributeKey<String> DESTINATION = AttributeKey.valueOf("destination");

    public void release(Channel channel){
        ScheduledFuture<?> attr = channel.attr(PERIOD_PUBLISH).get();
        if( attr != null ){
            attr.cancel(true);
        }

    }

    public void init(Channel channel){
        channel.attr(IS_SESSION_CONNECTED).set(false);
        channel.attr(HEARTBEAT_DURATION_MAX).set(0);
        channel.attr(RESPONSE_TIMEOUT).set(0);
        channel.attr(ORIGIN).set(List.of());
        channel.attr(DESTINATION).set("");
    }


}
