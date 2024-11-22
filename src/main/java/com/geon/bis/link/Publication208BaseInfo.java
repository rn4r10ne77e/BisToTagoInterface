package com.geon.bis.link;

import com.geon.bis.link.config.ChannelAttribute;
import com.geon.bis.link.config.RegionCode;
import com.geon.bis.link.mapper.BaseInfoMapper;
import com.geon.bis.link.mapper.BaseInfoVersionMapper;
import com.geon.bis.link.mapper.model.ParamBaseInfo;
import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import com.geon.bis.link.mapper.model.baseinfo.*;
import com.geon.bis.link.tago.config.Common;
import com.geon.bis.link.tago.config.Util;
import com.oss.asn1.*;
import datex.businfomation.*;
import datex.businfomation.BusBaseInformation.*;
import datex.businfomation.Company;
import datex.businfomation.Link;
import datex.businfomation.NMEACoord.Latitude;
import datex.businfomation.NMEACoord.Latitude.Compass1;
import datex.businfomation.NMEACoord.Longitude;
import datex.businfomation.NMEACoord.Longitude.Compass2;
import datex.iso14827_1.Message_MESSAGE_BODY_4;
import datex.iso14827_2.*;
import datex.iso14827_2.Publish_Format.DatexPublish_Data;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.TooLongFrameException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.geon.bis.link.config.ChannelAttribute.INFO;
/**
 * 버스기반정보에대한 퍼블리케이션 모듈 이벤트, 주기방식 구독에대한 스케쥴 실행.
 * 버스기반정보는 기반정보 버전정보를 모듈 시동시 동기화 하고, 이후 버전정보를 이벤트로 수신하며, 버전정보 변경시 해당 정보 전송하는 방식으로 진행
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class Publication208BaseInfo {

	private final Util util;
	private final BaseInfoMapper baseInfoMapper;
	private final BaseInfoVersionMapper baseInfoVersionMapper;

	@Value("${server.sender}")
	private String sender;
	@Value("${server.sendCnt}")
	private int sendCnt;
	@Value("${server.timeCnt}")
	private int timeCnt;

	public void procSinglePublication ( ChannelHandlerContext ctx, String requiredOrigin ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {

		List<Integer> requiredRegion = List.of( RegionCode.findByRegion(requiredOrigin).getCode() );
		List<ResultBaseInfoVersion> versionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
				.origin(requiredRegion)
				.build());
		pubProcess( versionList.get(0), RegionCode.findByRegion(requiredOrigin), ctx );
	}
	
	// 미래 버전 ( 적용 되지 않았지만 적용 예정인 기반 정보 ) 새로 구현해야 할 부분
	public void procEventPublication ( ChannelHandlerContext ctx, String requiredOrigin ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {
//		List<Integer> origin = List.of( RegionCode.findByRegion(requiredOrigin).getCode() );
//		List<ResultBaseInfoVersion> versionList = baseInfoVersionMapper.getVersions(ParamBaseInfoVersion.builder()
//				.origin(origin)
//				.build());
//
//		for ( RegionCode regionCode : RegionCode.values() ) {
//			Optional<ResultBaseInfoVersion> result = versionList.stream()
//					.filter(e -> e.getOrigin().equals(String.valueOf(regionCode.getCode())))
//					.findFirst();
//			if( result.isPresent() ){
//				pubProcess( result.get(), regionCode, ctx );
//			}
//		}
	}

	private void pubProcess( ResultBaseInfoVersion ver, RegionCode origin, ChannelHandlerContext ctx ) throws EncodeFailedException, EncodeNotSupportedException, InterruptedException {
		// Station 전송
		if(ver.getStationVersion() != null) {
			List<List<StationModel>> stationList = partitionList(baseInfoMapper.getStation(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getStationVersion())
					.build()), sendCnt);
			for (List<StationModel> el : stationList) {
				C2CAuthenticatedMessage  result = publication(pubStation(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// Route 전송
		if(ver.getRouteVersion() != null && !ver.getRouteVersion().isEmpty()) {
			List<List<RouteModel>> RouteList = partitionList(baseInfoMapper.getRoute(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getRouteVersion())
					.build()), sendCnt);
			for (List<RouteModel> el : RouteList) {
				C2CAuthenticatedMessage result = publication(pubRoute(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// RouteStation 전송
		if(ver.getRouteStationVersion() != null && !ver.getRouteStationVersion().isEmpty()) {
			List<List<RouteStationModel>> RoutestationList = partitionList(baseInfoMapper.getRouteStation(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getRouteStationVersion())
					.build()), sendCnt);
			for (List<RouteStationModel> el : RoutestationList) {
				C2CAuthenticatedMessage result = publication(pubRouteStation(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// vehicle 전송
		if(ver.getVehicleVersion() != null && !ver.getVehicleVersion().isEmpty()) {
			List<List<VehicleModel>> VehicleList = partitionList(baseInfoMapper.getVehicle(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getVehicleVersion())
					.build()), sendCnt);
			for (List<VehicleModel> el : VehicleList) {
				C2CAuthenticatedMessage result = publication(pubVehicle(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// Node 전송
		if(ver.getNodeVersion() != null && !ver.getNodeVersion().isEmpty()) {
			List<List<NodeModel>> NodeList = partitionList(baseInfoMapper.getNode(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getNodeVersion())
					.build()), sendCnt);
			for (List<NodeModel> el : NodeList) {
				C2CAuthenticatedMessage result = publication(pubNode(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}

		}
		// Link 전송
		if(ver.getLinkVersion() != null && !ver.getLinkVersion().isEmpty()) {
			List<List<LinkModel>> LinkList = partitionList(baseInfoMapper.getLink(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getLinkVersion())
					.build()), sendCnt);
			for (List<LinkModel> el : LinkList) {
				C2CAuthenticatedMessage result = publication(pubLink(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// LinkCoords 전송
		if(ver.getLinkCoordsVersion() != null && !ver.getLinkCoordsVersion().isEmpty()) {
			List<List<LinkCoordsModel>> LinkcoordsList = partitionList(baseInfoMapper.getLinkCoords(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getLinkCoordsVersion())
					.build()), sendCnt);
			for (List<LinkCoordsModel> el : LinkcoordsList) {
				C2CAuthenticatedMessage result = publication(pubLinkcoords(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// RoutePlan 전송
		if(ver.getRoutePlanVersion() != null && !ver.getRoutePlanVersion().isEmpty()) {
			List<List<RoutePlanModel>> RouteplanList = partitionList(baseInfoMapper.getRoutePlan(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getRoutePlanVersion())
					.build()), sendCnt);
			for (List<RoutePlanModel> el : RouteplanList) {
				C2CAuthenticatedMessage result = publication(pubRoutePlan(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// RouteLink 전송
		if(ver.getRouteLinkVersion() != null && !ver.getRouteLinkVersion().isEmpty()) {
			List<List<RouteLinkModel>> RoutelinkList = partitionList(baseInfoMapper.getRouteLink(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getRouteLinkVersion())
					.build()), sendCnt);
			for (List<RouteLinkModel> el : RoutelinkList) {
				C2CAuthenticatedMessage result = publication(pubRouteLink(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// RouteAllocate 전송
		if(ver.getRouteAllocateVersion() != null && !ver.getRouteAllocateVersion().isEmpty()) {
			List<List<RouteAllocateModel>> RouteallocateList = partitionList(baseInfoMapper.getRouteAllocate(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getRouteAllocateVersion())
					.build()), sendCnt);
			for (List<RouteAllocateModel> el : RouteallocateList) {
				C2CAuthenticatedMessage result = publication(pubRouteAllocate(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// Company 전송
		if(ver.getCompanyVersion() != null && !ver.getCompanyVersion().isEmpty()) {
			List<List<CompanyModel>> CompanyList = partitionList(baseInfoMapper.getCompany(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getCompanyVersion())
					.build()), sendCnt);
			for (List<CompanyModel> el : CompanyList) {
				C2CAuthenticatedMessage result = publication(pubCompany(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
		// Admin 전송
		if(ver.getAdminVersion() != null && !ver.getAdminVersion().isEmpty()) {
			List<List<AdminModel>> AdminList = partitionList(baseInfoMapper.getAdmin(ParamBaseInfo.builder()
					.origin(origin.getCode())
					.ver(ver.getAdminVersion())
					.build()), sendCnt);
			for (List<AdminModel> el : AdminList) {
				C2CAuthenticatedMessage result = publication(pubAdmin(el), origin.getRegion(), ctx);
				this.testEncoding(result);
				ctx.writeAndFlush(result);
			}
		}
    }

	private <T> List<List<T>> partitionList(List<T> list, int size) {
        List<List<T>> partitions = new ArrayList<>();
        for (int i = 0; i < list.size(); i += size) {
            partitions.add(new ArrayList<>(list.subList(i, Math.min(i + size, list.size()))));
        }
        return partitions;
    }
	
	/**
	 * 퍼블리케이션을 요청한다.
	 * @param EndAppMsg - event-driven일 경우 데이터가 있으며, null인 경우는 Periodic이다.
	 * @return boolean - true : 정상 수행, false : 비정상 수행
	 */
	private C2CAuthenticatedMessage publication(EndApplicationMessage EndAppMsg, String origin, ChannelHandlerContext ctx) {

		EndApplicationMessage DatexPublish_Data = EndAppMsg;

		C2CAuthenticatedMessage c2c = new C2CAuthenticatedMessage();
		
		c2c.setDatex_AuthenticationInfo_text(new OctetString());
		c2c.setDatex_DataPacket_number(util.getDataPacketNumber() + 1);
		c2c.setDatex_DataPacketPriority_number(0);

		c2c.setOptions(this.getOptions(origin, ctx));

		PublicationData publicationData = new PublicationData();
		publicationData.setDatexPublish_SubscribeSerial_nbr(util.getSubSerialNbr());
		publicationData.setDatexPublish_Serial_nbr(util.getPubSerialNbr());
		publicationData.setDatexPublish_LatePublicationFlag(false);
		publicationData.setDatexPublish_Type(
				PublicationType.createPublicationTypeWithDatexPublish_Data(DatexPublish_Data));
		
		DatexPublish_Data datexPublish_Data = new DatexPublish_Data();
		datexPublish_Data.add(publicationData);

		Publication publication = new Publication();
		publication.setDatexPublish_Guaranteed_bool(ctx.channel().attr(INFO).get().isSubGuarantee());
		publication.setDatexPublish_Format(
				Publish_Format.createPublish_FormatWithDatexPublish_Data(datexPublish_Data));

		c2c.setPdu(PDUs.createPDUsWithPublication(publication));

		return c2c;
	}
	
	/**
	 * 테스트용 퍼블리케이션을 생성한다.
	 * 
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubTestData() {
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = sdf.format(new Date());

		BusBaseInformation Baseinfo = new BusBaseInformation();
		Baseinfo.setTsmg_MessageGenerationTime(new GeneralizedTime(date));
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();
		message_MESSAGE_BODY_4.add(Baseinfo);

		try {
			DatexPublish_Data
					.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));

		return DatexPublish_Data;
	}

	/**
	 * 버스 기반정보 노드정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubNode(List<NodeModel> BaseinfoList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!BaseinfoList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoNode baseInfoNode = new Tsfc_BaseInfoNode();
			
			String version = "19000101000000"; // 버전정보
			
			for (NodeModel el : BaseinfoList) {

                if (el != null ) {
                    Node node = new Node();

                    node.setTrnt_Nodeid(new UTF8String16(el.getNodeId()));
                    node.setNode_type(new UTF8String16(el.getType()));
                    if(el.getName() != null) {
                        node.setNode_Name(new UTF8String16(el.getName()));
                    }

                    //GPS_LATI
                    String latiFrac = String.valueOf(el.getCoordinateLati()).split("\\.")[1];
                    //GPS_LONG
                    String longFrac = String.valueOf(el.getCoordinateLong()).split("\\.")[1];

                    Latitude latitude = new Latitude((int) el.getCoordinateLati(), Long.valueOf(latiFrac),
                            latiFrac.length(), Compass1.north);
                    Longitude longitude = new Longitude((int) el.getCoordinateLong(), Long.valueOf(longFrac),
                            longFrac.length(), Compass2.east);

                    NMEACoord nMEACoord = new NMEACoord(latitude, longitude);
                    node.setNode_Coordinate(nMEACoord);

                    node.setNode_Turn_P(new UTF8String16(el.getTurnLimit()));
                    node.setNode_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        node.setNode_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoNode.add(node);
                }
            }
			
		baseInfo.setTsfc_BaseInfoNode(baseInfoNode);
		baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
		message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 링크정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubLink(List<LinkModel> BaseinfoList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!BaseinfoList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoLink baseInfoLink = new Tsfc_BaseInfoLink();
			
			String version = "19000101000000"; // 버전정보
			
			for (LinkModel el : BaseinfoList) {
				if( el != null ){
					Link link = new Link();

					link.setTrnt_Linkid(new UTF8String16(el.getLinkId()));
					link.setLink_Fnode(new UTF8String16(el.getFNode()));
					link.setLink_Tnode(new UTF8String16(el.getTNode()));
					link.setLink_Lanes(el.getLanes());
					link.setLink_Roadrank(new UTF8String16(el.getRoadRank()));
					link.setLink_Roadno(new UTF8String16(el.getRoadType()));
					if(link.getLink_Roadname() != null) {
						link.setLink_Roadname(new UTF8String16(el.getRoadName()));
					}
					link.setLink_Roaduse(new UTF8String16(el.getRoadUse()));
					link.setLink_Multilink(new UTF8String16(el.getMultiLink()));
					link.setLink_Connect(new UTF8String16(el.getConnect()));
					link.setLink_MaxSpd(el.getMaxSpd());
					if(el.getRestVeh() != null) {
						link.setLink_Restveh(new UTF8String16(el.getRestVeh()));
					}
					link.setLink_Restw(el.getResTw());
					link.setLink_Resth(el.getResTh());
					link.setLink_Reg_date(new UTF8String16(el.getRegDate()));
					if(el.getRemark() != null) {
						link.setLink_Remark(new UTF8String16(el.getRemark()));
					}

					version = el.getVer();

					baseInfoLink.add(link);
				}
			}
			
		baseInfo.setTsfc_BaseInfoLink(baseInfoLink);
		baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
		message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}

	/**
	 * 버스 기반정보 링크형상정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubLinkcoords(List<LinkCoordsModel> coordsModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!coordsModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoLinkCoords baseInfoLinkCoords = new Tsfc_BaseInfoLinkCoords();
			
			String version = "19000101000000"; // 버전정보
			
			for (LinkCoordsModel el : coordsModelList) {

                if (el != null) {
                    Linkcoords linkcoords = new Linkcoords();

                    linkcoords.setTrnt_Linkid(new UTF8String16(el.getLinkId()));
                    linkcoords.setLinkcoords_Sequence(el.getSequence());
                    String latiFrac = String.valueOf(el.getCoordinateLati()).split("\\.")[1];
                    String longFrac = String.valueOf(el.getCoordinateLong()).split("\\.")[1];
                    Latitude latitude = new Latitude((int) el.getCoordinateLati(), Long.valueOf(latiFrac),
                            latiFrac.length(), Compass1.north);
                    Longitude longitude = new Longitude((int) el.getCoordinateLong(), Long.valueOf(longFrac),
                            longFrac.length(), Compass2.east);

                    NMEACoord nMEACoord = new NMEACoord(latitude, longitude);
                    linkcoords.setLinkcoords_Coordinate(nMEACoord);

                    linkcoords.setLinkcoords_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        linkcoords.setLinkcoords_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoLinkCoords.add(linkcoords);
                }
            }
			
			baseInfo.setTsfc_BaseInfoLinkCoords(baseInfoLinkCoords);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보

			message_MESSAGE_BODY_4.add(baseInfo);
		}
			
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}

	/**
	 * 버스 기반정보 정류장정보를 생성한다.
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubStation(List<StationModel> stationModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();
		
		if (!stationModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 정류장정보 생성
			Tsfc_BaseInfoStation baseInfoStation = new Tsfc_BaseInfoStation();
			
			String version = "19000101000000"; // 버전정보

			for (StationModel el : stationModelList) {
                if (el != null) {
                    Station station = new Station();

                    station.setTrnt_Station_id(new UTF8String16(el.getStationId()));
                    station.setStation_Station_knm(new UTF8String16(el.getStationKnm()));

                    switch(el.getStationTp()) {
                        case 0: station.setStation_Station_tp(Station.Station_Station_tp._public); break;
                        case 1: station.setStation_Station_tp(Station.Station_Station_tp.public_city_farmbus); break;
                        case 2: station.setStation_Station_tp(Station.Station_Station_tp.seat_city_farmbus); break;
                        case 3: station.setStation_Station_tp(Station.Station_Station_tp.express_seat_city_farmbus); break;
                        case 4: station.setStation_Station_tp(Station.Station_Station_tp.public_intercity); break;
                        case 5: station.setStation_Station_tp(Station.Station_Station_tp.seat_intercity); break;
                        case 6: station.setStation_Station_tp(Station.Station_Station_tp.express_intercity); break;
                        case 7: station.setStation_Station_tp(Station.Station_Station_tp.townbus); break;
                        default : station.setStation_Station_tp(Station.Station_Station_tp._public); break;
                    }

                    switch(el.getCenterYn()) {
                        case 0: station.setStation_Center_yn(Station.Station_Center_yn.side); break;
                        case 1: station.setStation_Center_yn(Station.Station_Center_yn.mid); break;
                        default : station.setStation_Center_yn(Station.Station_Center_yn.side); break;
                    }

                    station.setStation_Admin_id(new UTF8String16(el.getAdminId()));
                    if(el.getStationEnm() != null) {
                        station.setStation_Station_enm(new UTF8String16(el.getStationEnm()));
                    }

                    //GPS_LATI
                    String latiFrac = String.valueOf(el.getCoordinateLati()).split("\\.")[1];
                    //GPS_LONG
                    String longFrac = String.valueOf(el.getCoordinateLong()).split("\\.")[1];

                    Latitude latitude = new Latitude((int) el.getCoordinateLati(), Long.valueOf(latiFrac),
                            latiFrac.length(), Compass1.north);
                    Longitude longitude = new Longitude((int) el.getCoordinateLong(), Long.valueOf(longFrac),
                            longFrac.length(), Compass2.east);

                    NMEACoord nMEACoord = new NMEACoord(latitude, longitude);
                    station.setStation_Coordinate(nMEACoord);

                    station.setStation_Install_link_id(new UTF8String16(el.getInstallLinkId()));
                    station.setStation_Reg_date(new UTF8String16(el.getRegDate()));

                    if(el.getRemark() != null) {
                        station.setStation_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoStation.add(station);
                }
            }
			
			baseInfo.setTsfc_BaseInfoStation(baseInfoStation);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}

	/**
	 * 버스 기반정보 노선정보를 생성한다.
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubRoute(List<RouteModel> BaseinfoList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!BaseinfoList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 정류장정보 생성
			Tsfc_BaseInfoRoute baseInfoRoute = new Tsfc_BaseInfoRoute();
			
			String version = "19000101000000"; // 버전정보
			
			for (RouteModel el : BaseinfoList) {
				
				Route route = new Route();
				
				route.setTrnt_Route_id(new UTF8String16(el.getRouteId()));
				route.setRoute_Route_nm(new UTF8String16(el.getRouteNm()));
				switch(el.getRouteTy()) {
					case 10 : route.setRoute_Route_ty(Route.Route_Route_ty.wide_area_city_bus); break;
					case 11 : route.setRoute_Route_ty(Route.Route_Route_ty.express_seat_city_bus); break;
					case 12 : route.setRoute_Route_ty(Route.Route_Route_ty.seat_city_bus); break;
					case 13 : route.setRoute_Route_ty(Route.Route_Route_ty.public_city_bus); break;
					case 21 : route.setRoute_Route_ty(Route.Route_Route_ty.express_seat_farmbus); break;
					case 22 : route.setRoute_Route_ty(Route.Route_Route_ty.seat_farmbus); break;
					case 23 : route.setRoute_Route_ty(Route.Route_Route_ty.public_farmbus); break;
					case 30 : route.setRoute_Route_ty(Route.Route_Route_ty.town_bus); break;
					case 41 : route.setRoute_Route_ty(Route.Route_Route_ty.express_intercity_bus); break;
					case 42 : route.setRoute_Route_ty(Route.Route_Route_ty.seat_intercity_bus); break;
					case 43 : route.setRoute_Route_ty(Route.Route_Route_ty.public_intercity_bus); break;
					
					default : break;
				}
				
				route.setRoute_St_sta_id(new UTF8String16(el.getStStaId()));
				route.setRoute_Ed_sta_id(new UTF8String16(el.getEdStaId()));
				route.setRoute_Md_sta_id(new UTF8String16(el.getMdStaId()));
				route.setRoute_Perm_vol(el.getPermVol());
				route.setRoute_Begin_date(new UTF8String16(el.getBeginDate()));
				route.setRoute_Close_date(new UTF8String16(el.getCloseDate()));
				route.setRoute_Route_ex(new UTF8String16(el.getRouteEx()));
				route.setRoute_Company_id(new UTF8String16(el.getCompanyId()));
				route.setRoute_Admin_id(new UTF8String16(el.getAdminId()));
				route.setRoute_Distance(el.getDistance());
				route.setRoute_Req_time(el.getReqTime());
				route.setRoute_Charge(el.getCharge());
				route.setRoute_Reg_date(new UTF8String16(el.getRegDate()));
				route.setRoute_Remark(new UTF8String16(el.getRemark()));
				
				version = el.getVer();
				
				baseInfoRoute.add(route);
			}
			
			baseInfo.setTsfc_BaseInfoRoute(baseInfoRoute);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 노선운행정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubRoutePlan(List<RoutePlanModel> routePlanModelList) {
			
			Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!routePlanModelList.isEmpty()) {
			BusBaseInformation baseinfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoRouteplan baseInfoRouteplan = new Tsfc_BaseInfoRouteplan();
			
			String version = "19000101000000"; // 버전정보
			
			for (RoutePlanModel Vo : routePlanModelList) {
				 
				Routeplan routeplan = new Routeplan();
				
				routeplan.setTrnt_Route_id(new UTF8String16(Vo.getRouteId()));
				switch(Vo.getOperationWeek()) {
					case 0 : routeplan.setRouteplan_Oper_week(Routeplan.Routeplan_Oper_week.occasionality); break;
					case 1 : routeplan.setRouteplan_Oper_week(Routeplan.Routeplan_Oper_week.weekday); break;
					case 2 : routeplan.setRouteplan_Oper_week(Routeplan.Routeplan_Oper_week.saturday); break;
					case 3 : routeplan.setRouteplan_Oper_week(Routeplan.Routeplan_Oper_week.holiday); break;
					case 4 : routeplan.setRouteplan_Oper_week(Routeplan.Routeplan_Oper_week.daily); break;
					default: break;
				}
				routeplan.setRouteplan_Oper_cnt(Vo.getOperationCnt());
				routeplan.setRouteplan_St_first_tm(new UTF8String16(Vo.getStartFirstTm()));
				routeplan.setRouteplan_St_last_tm(new UTF8String16(Vo.getStartLastTm()));
				routeplan.setRouteplan_Ed_first_tm(new UTF8String16(Vo.getEndFirstTm()));
				routeplan.setRouteplan_Ed_last_tm(new UTF8String16(Vo.getEndLastTm()));
				routeplan.setRouteplan_Min_head(Vo.getMinHead());
                routeplan.setRouteplan_Max_head(Vo.getMaxHead());
                routeplan.setRouteplan_Reg_date(new UTF8String16(Vo.getRegDate()));
				if(Vo.getRemark() != null) {
					routeplan.setRouteplan_Remark(new UTF8String16(Vo.getRemark()));	
				}			
				
				version = Vo.getVer();
				
				baseInfoRouteplan.add(routeplan);
			}
			
			baseinfo.setTsfc_BaseInfoRouteplan(baseInfoRouteplan);
			baseinfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseinfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 노선부가정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubRouteStation(List<RouteStationModel> routeStationModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!routeStationModelList.isEmpty()) {
			BusBaseInformation baseinfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoRoutestation baseInfoRoutestation = new Tsfc_BaseInfoRoutestation();
			
			String version = "19000101000000"; // 버전정보
			
			for (RouteStationModel el : routeStationModelList) {
				
				Routestation routeStation = new Routestation();
				
				routeStation.setTrnt_Route_id(new UTF8String16(el.getRouteId()));
				routeStation.setRoutestation_Sequence(el.getSequence());
				routeStation.setRoutestation_Station_id(new UTF8String16(el.getStationId()));
				switch(el.getUpDown()) {
					case 0 : routeStation.setRoutestation_Up_down(Routestation.Routestation_Up_down.up); break;
					case 1 : routeStation.setRoutestation_Up_down(Routestation.Routestation_Up_down.down); break;
					case 2 : routeStation.setRoutestation_Up_down(Routestation.Routestation_Up_down.no_division); break;
					default: break;
				}
				
				routeStation.setRoutestation_Sum_dist(el.getSumDist());
				routeStation.setRoutestation_Remain_dist(el.getRemainDist());
				routeStation.setRoutestation_Stat_dist(el.getStatDist());
				routeStation.setRoutestation_Next_dist(el.getNextDist());
				switch(el.getStatTp()) {
					case 0 : routeStation.setRoutestation_Stat_tp(Routestation.Routestation_Stat_tp.common); break;
					case 1 : routeStation.setRoutestation_Stat_tp(Routestation.Routestation_Stat_tp.start); break;
					case 2 : routeStation.setRoutestation_Stat_tp(Routestation.Routestation_Stat_tp._return); break;
					case 3 : routeStation.setRoutestation_Stat_tp(Routestation.Routestation_Stat_tp.last); break;
					
					default: break;
				}
				routeStation.setRoutestation_Reg_date(new UTF8String16(el.getRegDate()));
				if(el.getRemark() != null) {
					routeStation.setRoutestation_Remark(new UTF8String16(el.getRemark()));
				}

				version = el.getVer();
				
				baseInfoRoutestation.add(routeStation);
			}
			
			baseinfo.setTsfc_BaseInfoRoutestation(baseInfoRoutestation);
			baseinfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseinfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 차량정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubVehicle(List<VehicleModel> vehicleModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!vehicleModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoVehicle baseInfoVehicle = new Tsfc_BaseInfoVehicle();
			
			String version = "19000101000000"; // 버전정보
			
			for (VehicleModel el : vehicleModelList) {

                if (el != null) {
                    Vehicle vehicle = new Vehicle();

                    vehicle.setTrnt_Veh_id(new UTF8String16(el.getVehId()));
                    vehicle.setVehicle_Plat_no(new UTF8String16(el.getPlateNo()));
                    switch(el.getVehTp()) {
                        case 0 : vehicle.setVehicle_Veh_tp(Vehicle.Vehicle_Veh_tp.compactbus); break;
                        case 1 : vehicle.setVehicle_Veh_tp(Vehicle.Vehicle_Veh_tp.smallbus); break;
                        case 2 : vehicle.setVehicle_Veh_tp(Vehicle.Vehicle_Veh_tp.middlebus); break;
                        case 3 : vehicle.setVehicle_Veh_tp(Vehicle.Vehicle_Veh_tp.bigbus); break;
                        default: break;
                    }
                    switch(el.getBusTp()) {
                        case 0 : vehicle.setVehicle_Bus_tp(Vehicle.Vehicle_Bus_tp.commonbus); break;
                        case 1 : vehicle.setVehicle_Bus_tp(Vehicle.Vehicle_Bus_tp.lowplatbus); break;
                        case 2 : vehicle.setVehicle_Bus_tp(Vehicle.Vehicle_Bus_tp.doubledecker); break;
                        case 3 : vehicle.setVehicle_Bus_tp(Vehicle.Vehicle_Bus_tp.dendybus); break;
                        default: break;
                    }
                    vehicle.setVehicle_Veh_capa(el.getVehCapa());
                    vehicle.setVehicle_Admin_id(new UTF8String16(el.getAdminId()));
                    if(el.getCompanyId() != null) {
                        vehicle.setVehicle_Company_id(new UTF8String16(el.getCompanyId()));
                    }
                    vehicle.setVehicle_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        vehicle.setVehicle_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoVehicle.add(vehicle);
                }
            }
			
			baseInfo.setTsfc_BaseInfoVehicle(baseInfoVehicle);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 노선표출정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubRouteLink(List<RouteLinkModel> routeLinkModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!routeLinkModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoRoutelink baseInfoRouteLink = new Tsfc_BaseInfoRoutelink();
			
			String version = "19000101000000"; // 버전정보
			
			for (RouteLinkModel el : routeLinkModelList) {

                if ( el != null ) {
                    Routelink routeLink = new Routelink();

                    routeLink.setTrnt_Route_id(new UTF8String16(el.getRouteId()));
                    routeLink.setRoutelink_Sequence(el.getSequence());
                    routeLink.setRoutelink_Link_id(new UTF8String16(el.getLinkId()));
                    switch(el.getStationYn()) {
                        case 0 : routeLink.setRoutelink_Station_yn(Routelink.Routelink_Station_yn.no); break;
                        case 1 : routeLink.setRoutelink_Station_yn(Routelink.Routelink_Station_yn.yes);; break;
                        default: break;
                    }
                    switch(el.getStationYn()) {
                        case 0 : routeLink.setRoutelink_Up_down(Routelink.Routelink_Up_down.up); break;
                        case 1 : routeLink.setRoutelink_Up_down(Routelink.Routelink_Up_down.down); break;
                        case 2 : routeLink.setRoutelink_Up_down(Routelink.Routelink_Up_down.no_division); break;
                        default: break;
                    }
                    routeLink.setRoutelink_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        routeLink.setRoutelink_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoRouteLink.add(routeLink);
                }
            }
			
			baseInfo.setTsfc_BaseInfoRoutelink(baseInfoRouteLink);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 노선운행예정정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubRouteAllocate(List<RouteAllocateModel> routeAllocateModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!routeAllocateModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoRouteallocate baseInfoRouteAllocate = new Tsfc_BaseInfoRouteallocate();
			
			String version = "19000101000000"; // 버전정보
			
			for (RouteAllocateModel el : routeAllocateModelList) {

                if ( el != null ) {
                    Routeallocate routeAllocate = new Routeallocate();

                    routeAllocate.setTrnt_Route_id(new UTF8String16(el.getRouteId()));
                    switch(el.getOperationWeek()) {
                        case 0 : routeAllocate.setRouteallocate_Oper_week(Routeallocate.Routeallocate_Oper_week.occasionality); break;
                        case 1 : routeAllocate.setRouteallocate_Oper_week(Routeallocate.Routeallocate_Oper_week.weekday); break;
                        case 2 : routeAllocate.setRouteallocate_Oper_week(Routeallocate.Routeallocate_Oper_week.saturday); break;
                        case 3 : routeAllocate.setRouteallocate_Oper_week(Routeallocate.Routeallocate_Oper_week.holiday); break;
                        case 4 : routeAllocate.setRouteallocate_Oper_week(Routeallocate.Routeallocate_Oper_week.daily); break;
                        default: break;
                    }
                    routeAllocate.setRouteallocate_Alloc_seq(el.getAllocSeq());
                    routeAllocate.setRouteallocate_Alloc_time(new UTF8String16(el.getAllocTime()));
                    if(el.getStartStation() != null) {
                        routeAllocate.setRouteallocate_St_station_id(new UTF8String16(el.getStartStation()));
                    }
                    if(el.getEndStation() != null) {
                        routeAllocate.setRouteallocate_Ed_station_id(new UTF8String16(el.getEndStation()));
                    }
                    routeAllocate.setRouteallocate_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        routeAllocate.setRouteallocate_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoRouteAllocate.add(routeAllocate);
                }
            }
			
			baseInfo.setTsfc_BaseInfoRouteallocate(baseInfoRouteAllocate);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 운수회사정보 생산
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubCompany(List<CompanyModel> companyModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!companyModelList.isEmpty()) {
			BusBaseInformation baseinfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoCompany baseInfoCompany = new Tsfc_BaseInfoCompany();
			
			String version = "19000101000000"; // 버전정보
			
			for (CompanyModel el : companyModelList) {

                if ( el != null ) {
                    Company company = new Company();

                    company.setTrnt_Company_id(new UTF8String16(el.getCompanyId()));
                    company.setCompany_Company_nm(new UTF8String16(el.getCompanyNm()));
                    company.setCompany_Phone_no(new UTF8String16(el.getPhoneNo()));
                    if(el.getFaxNo() != null) {
                        company.setCompany_Fax_no(new UTF8String16(el.getFaxNo()));
                    }
                    company.setCompany_Address(new UTF8String16(el.getAddress()));
                    company.setCompany_Ceo_nm(new UTF8String16(el.getCeoNm()));
                    company.setCompany_Bus_cnt(el.getBusCnt());
                    company.setCompany_Reg_cnt(el.getRegCnt());
                    company.setCompany_Spare_cnt(el.getSpareCnt());
                    company.setCompany_Admin_id(new UTF8String16(el.getAdminId()));
                    company.setCompany_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        company.setCompany_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoCompany.add(company);
                }
            }
			
			baseinfo.setTsfc_BaseInfoCompany(baseInfoCompany);
			baseinfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseinfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}
	
	/**
	 * 버스 기반정보 관할관청정보 생산
	 * @param adminModelList 관할관청 목록
	 * @return EndApplicationMessage
	 */
	private EndApplicationMessage pubAdmin(List<AdminModel> adminModelList) {
		
		Message_MESSAGE_BODY_4 message_MESSAGE_BODY_4 = new Message_MESSAGE_BODY_4();

		if (!adminModelList.isEmpty()) {
			BusBaseInformation baseInfo = new BusBaseInformation();
			
			// 노선별 정류장정보 생성
			Tsfc_BaseInfoAdmin baseInfoAdmin = new Tsfc_BaseInfoAdmin();
			
			String version = "19000101000000"; // 버전정보
			
			for (AdminModel el : adminModelList) {
                if ( el != null ) {
                    Admin admin = new Admin();

                    admin.setTrnt_Admin_id(new UTF8String16(el.getAdminId()));
                    admin.setAdmin_Moi_id(new UTF8String16(el.getMoiId()));
                    admin.setAdmin_Admin_nm1(new UTF8String16(el.getAdminNm1()));
                    admin.setAdmin_Admin_nm2(new UTF8String16(el.getAdminNm2()));
                    admin.setAdmin_Reg_date(new UTF8String16(el.getRegDate()));
                    if(el.getRemark() != null) {
                        admin.setAdmin_Remark(new UTF8String16(el.getRemark()));
                    }

                    version = el.getVer();

                    baseInfoAdmin.add(admin);
                }
            }
			
			baseInfo.setTsfc_BaseInfoAdmin(baseInfoAdmin);
			baseInfo.setTsmg_MessageGenerationTime(new GeneralizedTime(version)); //버전정보
			
			message_MESSAGE_BODY_4.add(baseInfo);
			
		}
		
		EndApplicationMessage DatexPublish_Data = new EndApplicationMessage();
		
		try {
			DatexPublish_Data.setEndApplication_Message_id(new ObjectIdentifier(Common.BASE_INFO_RESP));
		} catch (BadObjectIdentifierException e) {
			log.error(e.getMessage());
		}
		
		DatexPublish_Data.setEndApplication_Message_msg(new OpenType(message_MESSAGE_BODY_4));
		
		return DatexPublish_Data;
	}


	public HeaderOptions getOptions(String origin, ChannelHandlerContext ctx) {
		HeaderOptions options = new HeaderOptions();
		options.setDatex_Sender_text(new UTF8String16(sender));

		ChannelAttribute.ChannelInfo channelInfo = ctx.channel().attr(INFO).get();


		if (channelInfo.getDestination() != null) {
			options.setDatex_Destination_text(new UTF8String16(channelInfo.getDestination()));
		}
		if (origin != null) {
			options.setDatex_Origin_text(new UTF8String16(origin));
		}
		options.setDatex_DataPacket_time(util.getCurrentAsnTime());

		return options;
	}
	/**
	 * 스케줄러에서 ctx.writeAndFlush 이전에 인코딩을 테스트 하기 위함.
	 *
	 * @param dummy - 인코딩할 데이터
	 * @throws EncodeFailedException - 인코딩 할때 발생하는 예외를 던짐.
	 * @throws EncodeNotSupportedException - 지원하지 않는 인코딩 포맷일 경우.
	 */
	void testEncoding(C2CAuthenticatedMessage dummy) throws EncodeFailedException, EncodeNotSupportedException, TooLongFrameException {

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.reset();
		util.getCoder().encode(dummy, baos);
		byte[] encoding = baos.toByteArray();

		DatexDataPacket datexDataPacket = new DatexDataPacket();
		datexDataPacket.setDatex_Version_number(DatexDataPacket.Datex_Version_number.version1);
		datexDataPacket.setDatex_Data(new OctetString(encoding));
		datexDataPacket.setDatex_Crc_nbr(new OctetString(util.getCrc16(encoding)));

		baos.reset();
		util.getCoder().encode(datexDataPacket, baos);

		if (baos.size() > util.getDataGramSize()) {
			throw new TooLongFrameException( "The maximum size of the datagram has been exceeded. Maximum size: %d".formatted(util.getDataGramSize()) );
		}
	}

}
