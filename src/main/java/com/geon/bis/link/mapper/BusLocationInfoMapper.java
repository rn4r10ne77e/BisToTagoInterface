package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBusLocationInfo;
import com.geon.bis.link.mapper.model.ResultBusLocationInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusLocationInfoMapper {
    List<ResultBusLocationInfo> find(ParamBusLocationInfo param);
}
