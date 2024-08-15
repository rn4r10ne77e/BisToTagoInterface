package com.geon.bis.link.netty.handler;

import com.geon.bis.link.tago.config.Util;
import datex.iso14827_2.C2CAuthenticatedMessage;
import datex.iso14827_2.DatexDataPacket;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OctetString;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;

import java.io.ByteArrayOutputStream;

@Slf4j
@RequiredArgsConstructor
public class TagoEncoder extends MessageToByteEncoder<Object> {

	private final Util util;

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
		log.info("send : {}", msg);
		if (!(msg instanceof C2CAuthenticatedMessage)) {
			log.error("C2C instance error");
			return;
		}

		C2CAuthenticatedMessage c2c = (C2CAuthenticatedMessage) msg;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		log.debug(c2c.toString());

		try {
			baos.reset();
			util.getCoder().encode(c2c, baos);
		} catch (EncodeFailedException | EncodeNotSupportedException e) {
			log.error(e.getMessage());
			return;
		}

		byte[] encoding = baos.toByteArray();

		DatexDataPacket datexDataPacket = new DatexDataPacket();
		datexDataPacket.setDatex_Version_number(DatexDataPacket.Datex_Version_number.version1);
		datexDataPacket.setDatex_Data(new OctetString(encoding));
		datexDataPacket.setDatex_Crc_nbr(new OctetString(util.getCrc16(encoding)));


		log.debug("result : {}",datexDataPacket);
		try {
			baos.reset();
			util.getCoder().encode(datexDataPacket, baos);
		} catch (EncodeFailedException | EncodeNotSupportedException e) {
			log.error(e.getMessage());
			return;
		}

		if (baos.size() > util.getDataGramSize()) {
			log.error("DatagramSize is over : " + baos.size());
			return;
		}
		
		out.writeBytes(baos.toByteArray());
	}
}
