package com.geon.bis.link.tago.config;

public class Common {
	public static final int MAX_SESSION_COUNT = 10;
	public static final int RESPONSE_TIMEOUT_MIN = 5;
	public static final int RESPONSE_TIMEOUT_MAX = 10;
	public static final int HEARTBEAT_DURATION_MIN = 10;
	public static final int HEARTBEAT_DURATION_MAX = 30;
	public static final int DEFAULT_DATAGRAM_SIZE = 1024;

	public static final String BER_OID = "{ 2 1 1 }";

	// OID List
	public static final String BUS_LOC_INFO_REQ = "{ 1 0 14827 201 1 }";
	public static final String BUS_LOC_INFO_RESP = "{ 1 0 14827 201 2 }";
	public static final String ARR_PRE_TIME_INFO_REQ = "{ 1 0 14827 202 1 }";
	public static final String ARR_PRE_TIME_INFO_RESP = "{ 1 0 14827 202 2 }";
	// 신규 추가된 OID(미사용)
	public static final String BASE_INFO_VERSION_REQ = "{ 1 0 14827 207 1 }";
	public static final String BASE_INFO_VERSION_RESP = "{ 1 0 14827 207 2 }";
	public static final String BASE_INFO_REQ = "{ 1 0 14827 208 1 }";
	public static final String BASE_INFO_RESP = "{ 1 0 14827 208 2 }";

	public static final int BUS_LOC_ID = 201;
	public static final int ARR_PRE_ID = 202;
	public static final int BASE_INFO_VERSION_ID = 207;
	public static final int BASE_INFO_ID = 208;

}
