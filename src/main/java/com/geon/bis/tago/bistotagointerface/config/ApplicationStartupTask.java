package com.geon.bis.tago.bistotagointerface.config;

import com.geon.bis.tago.bistotagointerface.netty.config.NettyServerSocket;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.BusLocationInfo;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusEvenCodeNumber;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusLocationPolling;
import com.geon.bis.tago.bistotagointerface.packet.body.code201.model.BusRunCodeNumber;
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

        BusLocationInfo.<BusLocationPolling>builder()
                .vehId("02차1073")
                .choice(BusLocationPolling.builder()
                        .collectionCycleTime("1000")
                        .collectionCycleTime("30")
                        .build())
                .busRunCodeNumber(BusRunCodeNumber.normalRun)
                .busEvenCodeNumber(BusEvenCodeNumber.enterBusStop)
                .build();
        nettyServerSocket.start();
    }
}
