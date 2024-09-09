package com.geon.bis.link.mapper;

import com.geon.bis.link.mapper.model.ParamBaseInfoVersion;
import com.geon.bis.link.mapper.model.ResultBaseInfoVersion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BaseInfoVersionMapper {
    /** 각각의 버스기반정보의 최신(현재)버전을반환 */
    List<ResultBaseInfoVersion> findAllRecent(ParamBaseInfoVersion param);
    /** 각의 버스기반정보의 변경된 버전만 반환 */
    List<ResultBaseInfoVersion> findChanged(ParamBaseInfoVersion param);
}
