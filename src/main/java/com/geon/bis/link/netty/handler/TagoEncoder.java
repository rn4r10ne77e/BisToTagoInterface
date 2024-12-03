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

import java.io.ByteArrayOutputStream;

@Slf4j
@RequiredArgsConstructor
public class TagoEncoder extends MessageToByteEncoder<Object> {

	private final Util util;
	private long testCnt = 0;

	@Override
	protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) {

		if (!(msg instanceof C2CAuthenticatedMessage c2c)) {
			log.error("C2C instance error");
			return;
		}

		long packetNumber = c2c.getDatex_DataPacket_number();

		log.info("패킷번호 {}",packetNumber);
		log.info("패킷내용 {}",c2c);

      	ByteArrayOutputStream baos = new ByteArrayOutputStream();

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
//		if( testCnt % 100 == 0 && testCnt != 0 && c2c.getPdu().hasPublication()) {
//			log.info("잘못된 데이터 보냄");
//			byte[] result = baos.toByteArray();
//			byte[] invalidByte = new byte[result.length-10];
//			System.arraycopy(result, 0, invalidByte, 0, result.length-10);
//			out.writeBytes(invalidByte);
//		} else {
//			out.writeBytes(baos.toByteArray());
//		}


		out.writeBytes(baos.toByteArray());

		testCnt++;
	}
}
