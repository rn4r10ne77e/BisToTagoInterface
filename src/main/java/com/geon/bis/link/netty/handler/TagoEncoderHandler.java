package com.geon.bis.link.netty.handler;

import com.geon.bis.link.tago.config.Util;
import com.geon.bis.link.tago.datex.iso14827_2.C2CAuthenticatedMessage;
import com.geon.bis.link.tago.datex.iso14827_2.DatexDataPacket;
import com.oss.asn1.Coder;
import com.oss.asn1.EncodeFailedException;
import com.oss.asn1.EncodeNotSupportedException;
import com.oss.asn1.OctetString;
import com.oss.coders.EncoderException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageCodec;
import io.netty.handler.codec.ByteToMessageDecoder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class TagoEncoderHandler extends ByteToMessageCodec<Object> {

    private final Util util;
    private final Coder coder;
    @Value("${server.datagram-size}")
    private int datagramSize;

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object msg, ByteBuf out) throws Exception {
        if(!(msg instanceof C2CAuthenticatedMessage)){
            log.error("C2C instance Error");
            return;
        }

        C2CAuthenticatedMessage c2c = (C2CAuthenticatedMessage)msg;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        log.debug(c2c.toString());
        try {
            baos.reset();
            coder.encode(c2c, baos);
        } catch ( EncoderException | EncodeNotSupportedException e) {
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
            coder.encode(datexDataPacket, baos);
        } catch (EncodeFailedException | EncodeNotSupportedException e) {
            log.error(e.getMessage());
            return;
        }

        if (baos.size() > datagramSize) {
            log.error("DatagramSize is over : " + baos.size());
            return;
        }

        out.writeBytes(baos.toByteArray());
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {

    }
}