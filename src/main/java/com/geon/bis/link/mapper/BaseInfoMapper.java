package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBaseInfo;
import com.geon.bis.link.mapper.model.ResultBaseInfo;
import com.geon.bis.link.mapper.model.baseinfo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseInfoMapper {
    ResultBaseInfo find(ParamBaseInfo paramBaseInfo);
    List<StationModel> getStation(ParamBaseInfo paramBaseInfo);
    List<RouteModel> getRoute(ParamBaseInfo paramBaseInfo);
    List<RouteStationModel> getRouteStation(ParamBaseInfo paramBaseInfo);
    List<VehicleModel> getVehicle(ParamBaseInfo paramBaseInfo);
    List<NodeModel> getNode(ParamBaseInfo paramBaseInfo);
    List<LinkModel> getLink(ParamBaseInfo paramBaseInfo);
    List<LinkCoordsModel> getLinkCoords(ParamBaseInfo paramBaseInfo);
    List<RoutePlanModel> getRoutePlan(ParamBaseInfo paramBaseInfo);
    List<RouteLinkModel> getRouteLink(ParamBaseInfo paramBaseInfo);
    List<RouteAllocateModel> getRouteAllocate(ParamBaseInfo paramBaseInfo);
    List<CompanyModel> getCompany(ParamBaseInfo paramBaseInfo);
    List<AdminModel> getAdmin(ParamBaseInfo paramBaseInfo);

}
