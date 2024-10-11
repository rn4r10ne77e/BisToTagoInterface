package com.geon.bis.link.config;

import com.geon.bis.link.Publication207BaseInfoVersion;
import com.geon.bis.link.netty.config.NettyServerSocket;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class ApplicationStartupTask implements ApplicationListener<ApplicationReadyEvent> {

    private final NettyServerSocket nettyServerSocket;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        log.info(event.getTimeTaken().toString());
        nettyServerSocket.start();
    }
}
