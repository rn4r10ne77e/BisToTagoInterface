package com.geon.bis.link;

import com.geon.bis.link.config.Account;
import com.geon.bis.link.config.AccountProperties;
import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.config.RegionCode;
import com.geon.bis.link.mapper.BusLocationInfoMapper;
import com.geon.bis.link.mapper.model.ParamBusLocationInfo;
import com.geon.bis.link.tago.config.Common;
import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import com.oss.util.ASN1ValueFormat;
import datex.iso14827_2.*;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.util.concurrent.ScheduledFuture;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.util.concurrent.TimeUnit;

import static com.geon.bis.link.config.ChannelAttribute.*;

@Slf4j
@Component
@RequiredArgsConstructor
public class TagoService {

    private final Coder coder;
    private final Util util;
    private final AccountProperties accountProperties;
    private final ChannelGroup channelGroup;
    private final Publication201BusLocationInfo pub201;
    private final Publication202BusArrvlPrdcInfo pub202;
    private final Publication207BaseInfoVersion pub207;
    private final Publication208BaseInfo pub208;
    private final ChannelAttribute channelAttribute;

    private int dataPacketNumber = 0;

    @Value("${server.sender}")
    private String sender;
    @Value("${server.server-login-pass}")
    private boolean isServerLoginPass;

    private String destination;
    private String encodingRules;

    public C2CAuthenticatedMessage decodeData(byte[] bytes, InputStream is) throws DecodeNotSupportedException, DecodeFailedException {
        C2CAuthenticatedMessage c2c = null;
        if (bytes != null) {
            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

            DatexDataPacket datexDataPacket = null;
            datexDataPacket = (DatexDataPacket) coder.decode(bais, new DatexDataPacket());
            datexDataPacket.getDatex_Version_number(); // nothing
            OctetString datex_Data = datexDataPacket.getDatex_Data();
            OctetString Crc = new OctetString(util.getCrc16(datex_Data.byteArrayValue()));

            if (!Crc.equalTo(datexDataPacket.getDatex_Crc_nbr())) {
                log.warn("[CRC error] Correct = " + Crc.toString() + ", Wrong = "
                        + datexDataPacket.getDatex_Crc_nbr().toString());
            }

            bais = new ByteArrayInputStream(datex_Data.byteArrayValue());

            c2c = (C2CAuthenticatedMessage) coder.decode(bais, new C2CAuthenticatedMessage());
        }
        if (is != null) {
            c2c = (C2CAuthenticatedMessage) coder.decode(is, new C2CAuthenticatedMessage());
        }
        return c2c;
    }

    public C2CAuthenticatedMessage processData(C2CAuthenticatedMessage c2c, ByteBuf buf, ChannelHandlerContext ctx) {

        switch (c2c.getPdu().getChosenFlag()) {
            /*
            case PDUs.datex_initiate_null_chosen:
                break;
            */
            case PDUs.login_chosen:
                log.info("[Login] received");
                log.debug(c2c.toString());
                InetSocketAddress inetSocketAddress = (InetSocketAddress) ctx.channel().remoteAddress();
                String clientIp = inetSocketAddress.getAddress().getHostAddress();
                return responseLogin(c2c, ctx );

            case PDUs.fred_chosen:
                log.info("[FrED] received");
                log.debug(c2c.toString());
                return responseFrED();
                /*
                case PDUs.terminate_chosen:
                    break;
                */
            case PDUs.logout_chosen:
                log.info("[Logout] received");
                log.debug(c2c.toString());
                return responseLogout(c2c);

            case PDUs.subscription_chosen:
                log.info("[Subscription] received");
                log.debug(c2c.toString());
                return responseSubscription(c2c, ctx);
                // requestTerminate(Terminate.serverRequested);

            case PDUs.transfer_done_chosen:
                log.info("[TransferDone] received");
                log.debug(c2c.toString());
                return responseTransferDone(c2c);

            case PDUs.accept_chosen:
            case PDUs.reject_chosen:
                log.debug(c2c.toString());
                acceptRejectPublication(c2c);
                break;
            /*
            case PDUs.publication_chosen:
                break;
            */
            default:
                log.info("[" + c2c.getPdu().getChosenFlag() + "] received");
                log.debug(c2c.toString());

                break;
        }
        return null;
    }

    private C2CAuthenticatedMessage requestInit() {
        log.info("[Initiate] request");

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        Initiate initiate = new Initiate();
        initiate.setDatex_Sender_txt(new UTF8String16(sender));
        initiate.setDatex_Destination_txt(new UTF8String16("dest"));

        c2c.setPdu(PDUs.createPDUsWithDatex_initiate_null(initiate));

        return c2c;
    }

    public C2CAuthenticatedMessage responseLogin(C2CAuthenticatedMessage c2CAuthMsg, ChannelHandlerContext ctx) {

        Login login = c2CAuthMsg.getPdu().getLogin();
        ChannelInfo channelInfo = ctx.channel().attr(INFO).get(); // 채널에 대한 설정 및 기본값 세팅

        String _sender = login.getDatex_Sender_txt().stringValue();
        String _destination = login.getDatex_Destination_txt().stringValue();
        String userName = new String(login.getDatexLogin_UserName_txt().byteArrayValue());
        String password = new String(login.getDatexLogin_Password_txt().byteArrayValue());

        channelInfo.setHeartbeatDurationMax((int) login.getDatexLogin_HeartbeatDurationMax_qty());
        channelInfo.setResponseTimeOut((int) login.getDatexLogin_ResponseTimeOut_qty());
        int datagramSize = (int) login.getDatexLogin_DatagramSize_qty();

        // matching id & password
        boolean isMatchIdAndPassword = false;

        String clientIp = ((InetSocketAddress)(ctx.channel().remoteAddress())).getAddress().getHostAddress();

        for(Account el : accountProperties.getAccount() ){
            if (el.getIps().stream().anyMatch(e -> e.equals(clientIp)) && el.getUsername().equals(userName) && el.getPassword().equals(password)) {
                log.info("인증 성공");
                isMatchIdAndPassword = true;

                channelInfo.setOrigin(
                        el.getOrigins().stream().map(e->{
                            RegionCode regionCode = RegionCode.findByRegion(e);
                            return String.valueOf(regionCode.getCode());
                        }).toList()
                );
                channelInfo.setDestination(el.getUsername());
                destination = el.getUsername();
                break;
            }
        }
        if (isMatchIdAndPassword) {
            log.debug("[Login] id & password are correct");
        } else {
            log.debug("[Login] id or password is not matched");
        }

        // process reject
        Reject reject = new Reject();
        RejectType.DatexReject_Login_cd datexReject_Login_cd = RejectType.DatexReject_Login_cd.other;

        if (!_sender.equals(destination) && !_destination.equals(sender)) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.unknownDomainName;
        } else if (!isMatchIdAndPassword) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.invalidNamePassword;
        } else if (channelInfo.getResponseTimeOut() < Common.RESPONSE_TIMEOUT_MIN) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.timeoutTooSmall;
        } else if (channelInfo.getResponseTimeOut() > Common.RESPONSE_TIMEOUT_MAX) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.timeoutTooLarge;
        } else if (channelInfo.getHeartbeatDurationMax() < Common.HEARTBEAT_DURATION_MIN && channelInfo.getHeartbeatDurationMax() != 0) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.heartbeatTooSmall;
        } else if (channelInfo.getHeartbeatDurationMax() > Common.HEARTBEAT_DURATION_MAX) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.heartbeatTooLarge;
        } else if (channelInfo.isSessionConnected()) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.sessionExists;
        } else if (channelGroup.size() > Common.MAX_SESSION_COUNT) {
            datexReject_Login_cd = RejectType.DatexReject_Login_cd.maxSessionReached;
        }

        reject.setDatexReject_Type(RejectType.createRejectTypeWithDatexReject_Login_cd(datexReject_Login_cd));

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        if ((reject.getDatexReject_Type().getDatexReject_Login_cd() == RejectType.DatexReject_Login_cd.other) || this.isServerLoginPass ) {
            c2c.setDatex_AuthenticationInfo_text(new OctetString());

            Accept accept = new Accept();
            accept.setDatexAccept_Packet_nbr(c2CAuthMsg.getDatex_DataPacket_number());
            try {
                accept.setDatexAccept_Type(Accept.DatexAccept_Type.createDatexAccept_TypeWithLogIn(new ObjectIdentifier(Common.BER_OID)));
            } catch (BadObjectIdentifierException e) {
                log.error(e.getMessage());
            }

            c2c.setPdu(PDUs.createPDUsWithAccept(accept));

            channelInfo.setSessionConnected(true);

            if (channelInfo.getHeartbeatDurationMax() != 0) {
                ctx.pipeline().addBefore("TagoEncoder", "readTimeout",
                        new ReadTimeoutHandler(channelInfo.getHeartbeatDurationMax()));
            }
        } else {
            c2c.setDatex_AuthenticationInfo_text(new OctetString());

            reject.setDatexReject_Packet_nbr(c2CAuthMsg.getDatex_DataPacket_number());

            c2c.setPdu(PDUs.createPDUsWithReject(reject));
        }

        return c2c;
    }

    /**
     * 서브스크립션에 대한 응답을 한다.
     * @param c2CAuthMsg 설명
     * @return C2CAuthenticatedMessage 설명
     */
    public C2CAuthenticatedMessage responseSubscription(C2CAuthenticatedMessage c2CAuthMsg, ChannelHandlerContext ctx) {
        log.info("[Subscription] Response");

        // responseSubscription cancel process
        if (c2CAuthMsg.getPdu().getSubscription().getDatexSubscribe_Type().hasDatexSubscribe_CancelReason_cd()) {
            return  responseSubscriptionCancel(c2CAuthMsg, ctx);
        }

        // subscription_chosen
        SubscriptionData subscriptionData = c2CAuthMsg.getPdu().getSubscription().getDatexSubscribe_Type()
                .getSubscription();


        ChannelInfo channelInfo = ctx.channel().attr(INFO).get();
        channelInfo.setSubGuarantee(subscriptionData.getDatexSubscribe_Guarantee_bool());

        String endAppMsgId = subscriptionData.getDatexSubscribe_Pdu().getEndApplication_Message_id()
                .toString(new ASN1ValueFormat().excludeValueAssignment());
        int datexSubscribeMode = subscriptionData.getDatexSubscribe_Mode().getChosenFlag();

        // process reject
        Reject reject = new Reject();
        RejectType.DatexReject_Subscription_cd datexReject_Subscription_cd = RejectType.DatexReject_Subscription_cd.other;

        // datexReject_Subscription_cd = DatexReject_Subscription_cd.unknownSubscriptionNbr;
        // datexReject_Subscription_cd = DatexReject_Subscription_cd.invalidTimes;
        // datexReject_Subscription_cd = DatexReject_Subscription_cd.frequencyTooSmall;
        // datexReject_Subscription_cd = DatexReject_Subscription_cd.frequencyTooLarge;
        if (datexSubscribeMode < SubscriptionMode.single_chosen || datexSubscribeMode > SubscriptionMode.periodic_chosen) {
            // single, event-driven, periodic
            datexReject_Subscription_cd = RejectType.DatexReject_Subscription_cd.invalid_mode;
        } else if (subscriptionData
                .getDatexSubscribe_PublishFormat_cd() != SubscriptionData.DatexSubscribe_PublishFormat_cd.dataPacket) {
            // other, ftp, tftp, dataPacket
            datexReject_Subscription_cd = RejectType.DatexReject_Subscription_cd.publishFormatNotSupported;
        } else if (!endAppMsgId.equals(Common.BUS_LOC_INFO_REQ)
                && !endAppMsgId.equals(Common.ARR_PRE_TIME_INFO_REQ)
                && !endAppMsgId.equals(Common.BASE_INFO_VERSION_REQ)
                && !endAppMsgId.equals(Common.BASE_INFO_REQ)) {
            datexReject_Subscription_cd = RejectType.DatexReject_Subscription_cd.invalidSubscriptionMsgId;
        }
        // datexReject_Subscription_cd = DatexReject_Subscription_cd.unknownSubscriptionMsgId;
        // datexReject_Subscription_cd = DatexReject_Subscription_cd.invalidSubscriptionContent;

        reject.setDatexReject_Type(
                RejectType.createRejectTypeWithDatexReject_Subscription_cd(datexReject_Subscription_cd));

        log.debug("[Subscription] reject code : {}",reject.getDatexReject_Type().getDatexReject_Subscription_cd());

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        // process accept
        if (reject.getDatexReject_Type().getDatexReject_Subscription_cd() == RejectType.DatexReject_Subscription_cd.other) {
            c2c.setDatex_AuthenticationInfo_text(new OctetString());

            Accept accept = new Accept();
            accept.setDatexAccept_Packet_nbr(c2CAuthMsg.getDatex_DataPacket_number());

            log.info("모드 : {}", subscriptionData.getDatexSubscribe_Mode());
            if (subscriptionData.getDatexSubscribe_Mode().hasSingle()) {
                log.info("[서브스크립션 모드] 싱글");
                accept.setDatexAccept_Type(
                        Accept
                                .DatexAccept_Type
                                .createDatexAccept_TypeWithSingle_subscription(new Null())
                );

            } else if (subscriptionData.getDatexSubscribe_Mode().hasPeriodic()) {
                log.info("[서브스크립션 모드] 주기방식");

                int UpdateDelay_qty = (int) subscriptionData
                        .getDatexSubscribe_Mode()
                        .getPeriodic()
                        .getContinuous()
                        .getDatexRegistered_UpdateDelay_qty();

                accept.setDatexAccept_Type(
                        Accept
                                .DatexAccept_Type
                                .createDatexAccept_TypeWithRegistered_subscription(UpdateDelay_qty)
                );
            } else if (subscriptionData.getDatexSubscribe_Mode().hasEvent_driven()) {
                log.debug("[서브스크립션 모드] 이벤트 방식");
                accept.setDatexAccept_Type(
                        Accept
                                .DatexAccept_Type
                                .createDatexAccept_TypeWithRegistered_subscription(0)
                );
            }
            c2c.setPdu(PDUs.createPDUsWithAccept(accept));
        } else {
            c2c.setDatex_AuthenticationInfo_text(new OctetString());

            reject.setDatexReject_Packet_nbr(c2CAuthMsg.getDatex_DataPacket_number());

            c2c.setPdu(PDUs.createPDUsWithReject(reject));
        }

        return c2c;
    }

    /**
     * 서브스크립션을 처리한다.
     * @param subscription 구독 모드 : SINGLE, PERIOD, EVENT
     */
    public void processSubscription(Subscription subscription, ChannelHandlerContext ctx) throws RuntimeException{

        ChannelInfo channelInfo = ctx.channel().attr(INFO).get();

        SubscriptionMode subscriptionMode = subscription
                .getDatexSubscribe_Type()
                .getSubscription()
                .getDatexSubscribe_Mode();

        String oId = subscription
                .getDatexSubscribe_Type().
                getSubscription()
                .getDatexSubscribe_Pdu()
                .getEndApplication_Message_id()
                .toString(new ASN1ValueFormat().excludeValueAssignment());

        switch (oId) {
            case Common.BUS_LOC_INFO_REQ -> {
                if( channelInfo.getPub201() != null ){
                    channelInfo.getPub201().cancel(true);
                    channelInfo.setPub201(null);
                }
                if (subscriptionMode.hasSingle()) {
                    try {
                        log.info("[버스위치정보] 싱글 구독");
                        pub201.procSinglePublication(ctx);
                    } catch (Exception e) {
                        getError(e);
                    }
                } else if (subscriptionMode.hasPeriodic()) {
                    int interval = (int)subscriptionMode.getPeriodic().getContinuous().getDatexRegistered_UpdateDelay_qty();
                    channelInfo.setPub201(ctx.executor().scheduleWithFixedDelay(() -> {
                        log.info("[버스위치정보] 주기 구독 ( 스케줄러 {}초 )", interval);
                        try {
                            pub201.procPeriodicPublication(ctx);
                        } catch (Exception e) {
                            getError(e);
                            ctx.channel().attr(INFO).get().getPub201().cancel(true);
                        }
                    }, 5, interval, TimeUnit.SECONDS));
                } else if (subscriptionMode.hasEvent_driven()) {
                    channelInfo.setPub201(ctx.executor().scheduleWithFixedDelay(()->{
                        log.info("[버스위치정보] 이벤트 구독 ( 스케줄러 5초 )");
                        try {
                            pub201.procEventPublication(ctx);
                        } catch (Exception e) {
                            getError(e);
                            ctx.channel().attr(INFO).get().getPub202().cancel(true);
                        }
                    }, 5, 5, TimeUnit.SECONDS));
                } // 버스위치정보
            }
            case Common.ARR_PRE_TIME_INFO_REQ -> {
                if( channelInfo.getPub202() != null ){
                    channelInfo.getPub202().cancel(true);
                    channelInfo.setPub202(null);
                }
                if (subscriptionMode.hasSingle()) {
                    try {
                        log.info("[버스도착예정] 싱글 구독");
                        pub202.procSinglePublication(ctx);
                    } catch (Exception e) {
                        getError(e);
                    }
                } else if (subscriptionMode.hasPeriodic()) {
                    int interval = (int)subscriptionMode.getPeriodic().getContinuous().getDatexRegistered_UpdateDelay_qty();
                    channelInfo.setPub202(ctx.executor().scheduleWithFixedDelay(() -> {
                        log.info("[버스도착예정] 주기 구독 ( 스케줄러 {}초 )", interval);
                        try {
                            pub202.procPeriodicPublication(ctx);
                        } catch (Exception e) {
                            getError(e);
                            ctx.channel().attr(INFO).get().getPub202().cancel(true);
                        }
                    }, 5, interval, TimeUnit.SECONDS));
                } else if (subscriptionMode.hasEvent_driven()) {
                    channelInfo.setPub202(ctx.executor().scheduleWithFixedDelay(()->{
                        log.info("[버스도착예정] 이벤트 구독 ( 스케줄러 5초 )");
                        try {
                            pub202.procEventPublication(ctx);
                        } catch (Exception e) {
                            getError(e);
                            ctx.channel().attr(INFO).get().getPub202().cancel(true);
                        }
                    }, 5, 5, TimeUnit.SECONDS));
                } // 버스도착예정
            }
            case Common.BASE_INFO_VERSION_REQ -> {
                if( channelInfo.getPub207() != null ){
                    channelInfo.getPub207().cancel(true);
                    channelInfo.setPub207(null);
                }
                if( subscriptionMode.hasSingle() ) {
                    try {
                        log.info("[기반정보버전] 싱글 구독");
                        pub207.procSinglePublication(ctx);
                    } catch (Exception e) {
                        getError(e);
                    }
                } else if ( subscriptionMode.hasPeriodic() ) {
                    log.info("[기반정보버전] 기간 구독 : 처리 로직 없음 확인 필요");
                } else if ( subscriptionMode.hasEvent_driven() ){
                    channelInfo.setPub207(ctx.executor().scheduleWithFixedDelay(()->{
                        log.info("[기반정보버전] 이벤트 구독 5 초");
                        try {
                            pub207.procEventPublication(ctx);
                        } catch (Exception e) {
                            getError(e);
                            ctx.channel().attr(INFO).get().getPub207().cancel(true);
                        }
                    }, 5, 5, TimeUnit.SECONDS));
                } // 버스 기반 버전 정보
            }
            case Common.BASE_INFO_REQ -> {
                if( channelInfo.getPub208() != null ){
                    channelInfo.getPub208().cancel(true);
                    channelInfo.setPub208(null);
                }
                if( subscriptionMode.hasSingle() ){
                    try {
                        log.info("[기반정보] 싱글 구독");
                        pub208.procSinglePublication(ctx);
                    } catch (Exception e) {
                        getError(e);
                    }
                }  else if ( subscriptionMode.hasPeriodic() ) {
                    log.info("[기반정보] 기간 구독 : 처리 로직 없음 확인 필요");
                } else if ( subscriptionMode.hasEvent_driven() ){
                    try {
                        channelInfo.setPub208(ctx.executor().scheduleWithFixedDelay(()->{
                            log.info("[기반정보] 이벤트 구독 ( 스케줄러 5초 )");
                            try {
                                pub208.procEventPublication(ctx);
                            } catch (Exception e) {
                                getError(e);
                                ctx.channel().attr(INFO).get().getPub208().cancel(true);
                            }
                        }, 5, 5, TimeUnit.SECONDS));
                    } catch (Exception e) {
                        getError(e);
                    }
                }
            }
            default -> log.info("[Subscription] 일치하는 oId가 없습니다. ({})", oId);
        }

    }

    private static void getError(Exception e) {
        log.error("exceptionCaught: {}",ExceptionUtils.getStackTrace(e));
    }

    /**
     * 서브스크립션 취소에 대한 처리와 응답을 한다.
     */
    private C2CAuthenticatedMessage responseSubscriptionCancel(C2CAuthenticatedMessage c2CAuthMsg, ChannelHandlerContext ctx ) {
        log.info("[Subscription] Cancel");
        // 모든 구독 프로세스 종료
        channelAttribute.release(ctx);

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        Accept accept = new Accept();
        accept.setDatexAccept_Packet_nbr(c2CAuthMsg.getDatex_DataPacket_number());
        accept.setDatexAccept_Type(Accept.DatexAccept_Type.createDatexAccept_TypeWithRegistered_subscription(5));

        c2c.setPdu(PDUs.createPDUsWithAccept(accept));

        return c2c;
    }

    /**
     * Logout에 대한 응답을 한다.
     */
    private C2CAuthenticatedMessage responseLogout(C2CAuthenticatedMessage c2CAuthMsg) {
        log.info("[Logout] response");

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        c2c.setPdu(PDUs.createPDUsWithFred(c2CAuthMsg.getDatex_DataPacket_number()));
        return c2c;
    }

    /**
     * 입력된 Terminate 타입에 따라 Terminate를 요청한다.
     */
    private C2CAuthenticatedMessage requestTerminate(Terminate terminate) {
        log.info("[Terminate] request");

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        c2c.setPdu(PDUs.createPDUsWithTerminate(terminate));

        return c2c;
    }

    /**
     * FrED에 응답을 한다.
     */
    public C2CAuthenticatedMessage responseFrED() {

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        c2c.setPdu(PDUs.createPDUsWithFred(0));

        return c2c;
    }

    /**
     * TransferDone에 대한 응답을 처리한다.
     * @param c2CAuthMsg
     * @return
     */
    public C2CAuthenticatedMessage responseTransferDone(C2CAuthenticatedMessage c2CAuthMsg) {
        log.info("[TransferDone] response");

        C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
        c2c.setDatex_AuthenticationInfo_text(new OctetString());
        c2c.setDatex_DataPacket_number(dataPacketNumber++);
        c2c.setDatex_DataPacketPriority_number(0);

        c2c.setOptions(getOptions(null));

        c2c.setPdu(PDUs.createPDUsWithFred(c2CAuthMsg.getPdu().getTransfer_done()
                .getDatexTransferDone_Publication_nbr()));

        return c2c;
    }

    /**
     * 퍼블리케이션에 대한 Accept와 Reject를 처리한다.(별도 처리없이 로그만 출력)
     * @param c2CAuthMsg
     */
    private void acceptRejectPublication(C2CAuthenticatedMessage c2CAuthMsg) {

        if (c2CAuthMsg.getPdu().hasAccept()) {
            if (c2CAuthMsg.getPdu().getAccept().getDatexAccept_Type().hasPublication()) {

                log.info("[Accept] Publication");

            }
        } else if (c2CAuthMsg.getPdu().hasReject()) {
            if (c2CAuthMsg.getPdu().getReject().getDatexReject_Type().hasDatexReject_Publication_cd()) {

                log.info("[Reject] Publication");

            }
        }
    }

    /**
     * HeaderOptions을 만든다.
     * @param origin 지역 코드
     * @return 옵션을 만들어서 반환
     */
    public HeaderOptions getOptions(String origin) {
        HeaderOptions options = new HeaderOptions();
        options.setDatex_Sender_text(new UTF8String16(sender));
        if (destination != null) {
            options.setDatex_Destination_text(new UTF8String16(destination));
        }
        if (origin != null) {
            options.setDatex_Origin_text(new UTF8String16(RegionCode.findByCode(Integer.parseInt(origin)).getRegion()));
        }
        options.setDatex_DataPacket_time(util.getCurrentAsnTime());

        return options;
    }

}
