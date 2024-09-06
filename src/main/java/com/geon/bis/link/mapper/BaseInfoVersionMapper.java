package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseInfoVersionMapper {
    List<ResultBaseInfoVersion> find(ParamBaseInfoVersion param);
}
