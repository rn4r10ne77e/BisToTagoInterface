package com.geon.bis.tago.bistotagointerface.mapper;

import com.geon.bis.tago.bistotagointerface.mapper.model.ParamBusLocationInfo;
import com.geon.bis.tago.bistotagointerface.mapper.model.ResultBusLocationInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusLocationInfo {
    String delay();
    ResultBusLocationInfo find(ParamBusLocationInfo param);
}
