package com.geon.bis.link.netty.handler;

import com.geon.bis.link.tago.config.Util;
import datex.iso14827_2.C2CAuthenticatedMessage;
import datex.iso14827_2.DatexDataPacket;
import com.oss.asn1.DecodeFailedException;
import com.oss.asn1.DecodeNotSupportedException;
import com.oss.asn1.OctetString;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import io.netty.handler.codec.DecoderException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayInputStream;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class TagoDecoder extends ByteToMessageDecoder {

  private final Util util;

  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
    try{
      byte[] bytes = null;
      int length = getLength(in);

      // 패킷과 Length가 맞는지 확인
      if (in.getByte(0) == (byte) 0x30) {
        if (in.readableBytes() == length) {
          log.trace("Normal Packets");

          bytes = new byte[length];
          in.readBytes(bytes);
        } else if (in.readableBytes() < length) {
          log.trace("Abnormal Packets(Split) Partial/Total : " + in.readableBytes() + "/" + length);
          // Do Nothing
          return;
        } else {
          log.trace("Abnormal Packets(Combine) Remain : " + (in.readableBytes() - length));

          bytes = new byte[length];
          in.readBytes(bytes);
          in.discardReadBytes();
        }
      } else {
        log.trace("Abnormal Packets(1st byte)");
        // Do Nothing
        return;
      }
      // out.add(bytes);
      if (length > util.getDataGramSize()) {
        log.error("DatagramSize is over : {}", length);
        return;
      }

      ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

      DatexDataPacket datexDataPacket = null;
      C2CAuthenticatedMessage c2c = null;
      try {
        datexDataPacket = util.getCoder().decode(bais, new DatexDataPacket());
        datexDataPacket.getDatex_Version_number(); // nothing
        OctetString datex_Data = datexDataPacket.getDatex_Data();

        OctetString Crc = new OctetString(util.getCrc16(datex_Data.byteArrayValue()));
        if (!Crc.equalTo(datexDataPacket.getDatex_Crc_nbr())) {
          log.warn("[CRC error] Correct = {}, Wrong = {}", Crc, datexDataPacket.getDatex_Crc_nbr().toString());
        }

        bais = new ByteArrayInputStream(datex_Data.byteArrayValue());

        c2c = util.getCoder().decode(bais, new C2CAuthenticatedMessage());

      } catch (DecodeFailedException | DecodeNotSupportedException e) {
        throw new DecoderException("ASN.1 디코딩 오류: "+e.getMessage());
      }
      log.debug(c2c.toString());
      out.add(c2c);
    } catch (DecoderException e) {
      in.clear();
      log.error(e.getMessage());
    }
  }

  // Length(T+L+V) 구하기
  int getLength(ByteBuf in) {
    int length = 0;

    if (in.getByte(0) != (byte) 0x30) {
      log.trace("Packet Length : X");
      return -1;
    }

    if (in.getByte(1) == (byte) 0x82) {
      // T:1, L:3, V:Data
      length = (in.getUnsignedByte(2) * 16 * 16) + in.getUnsignedByte(3) + 4;
    } else if (in.getByte(1) == (byte) 0x81) {
      // T:1, L:2, V:Data
      length = in.getUnsignedByte(2) + 3;
    } else {
      // T:1, L:1, V:Data
      length = in.getUnsignedByte(1) + 2;
    }

    log.trace("Packet Length : " + length);
    return length;
  }
}
