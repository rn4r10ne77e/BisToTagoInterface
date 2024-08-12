package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBusLocationInfo;
import com.geon.bis.link.mapper.model.ResultBusLocationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusLocationInfo {
    String delay();
    ResultBusLocationInfo find(ParamBusLocationInfo param);
}
