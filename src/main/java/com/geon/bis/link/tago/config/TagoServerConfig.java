package com.geon.bis.link.tago.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Getter
@Component
public class TagoServerConfig {

	@Value("${server.sender}")
	private String sender;
	
	@Value("${server.origin}")
	private String[] origin;
	
	@Value("${server.datagram-size}")
	private int datagramSize;
	
	@Value("${server.sendCnt}")
	private int sendCnt;
	
	@Value("${server.server-login-pass}")
	private boolean LOGIN_PASS;
	
	@Value("${server.server-pub-test-on}")
	private boolean PUB_TEST_ON;
	
}
