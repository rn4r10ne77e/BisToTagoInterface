package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseInfoVersionMapper {
    /** 각각의 버스기반정보 버전 조회 */
    List<ResultBaseInfoVersion> find(ParamBaseInfoVersion param);
}
