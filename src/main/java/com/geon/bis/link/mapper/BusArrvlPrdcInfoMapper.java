package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamArrivalPredictionTimeInfo;
import com.geon.bis.link.mapper.model.ResultArrivalPredictionTimeInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusArrvlPrdcInfoMapper {
    List<ResultArrivalPredictionTimeInfo> getBusArr(ParamArrivalPredictionTimeInfo param);
}
