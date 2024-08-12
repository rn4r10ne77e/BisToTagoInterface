package com.geon.bis.link.tago.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class TagoServerConfig {
	
	@Value("${server.serverPort}")
	private int serverPort;
	
	@Value("${server.sender}")
	private String sender;
	
	@Value("${server.origin}")
	private String[] origin;
	
	@Value("${server.datagramSize}")
	private int datagramSize;
	
	@Value("${server.sendCnt}")
	private int sendCnt;
	
	@Value("${server.serverLoginPass}")
	private boolean LOGIN_PASS;
	
	@Value("${server.serverPubTestOn}")
	private boolean PUB_TEST_ON;
	
}
