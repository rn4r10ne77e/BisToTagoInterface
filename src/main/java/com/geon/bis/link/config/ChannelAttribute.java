package com.geon.bis.link.config;

import io.netty.util.AttributeKey;
import io.netty.util.concurrent.ScheduledFuture;

import java.util.List;

public class ChannelAttribute {

    public static final AttributeKey<Boolean> IS_SESSION_CONNECTED = AttributeKey.valueOf("isSessionConnected");
    public static final AttributeKey<Integer> HEARTBEAT_DURATION_MAX = AttributeKey.valueOf("heartbeatDurationMax");
    public static final AttributeKey<Integer> RESPONSE_TIMEOUT = AttributeKey.valueOf("responseTimeOut");
    public static final AttributeKey<ScheduledFuture<?>> PERIOD_PUBLISH = AttributeKey.valueOf("periodPublish");
    public static final AttributeKey<List<String>> ORIGIN = AttributeKey.valueOf("origin");
    public static final AttributeKey<String> DESTINATION = AttributeKey.valueOf("destination");



}
