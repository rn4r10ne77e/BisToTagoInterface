package com.geon.bis.link.mapper;


import com.geon.bis.link.mapper.model.BusComp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusCompMapper {
    BusComp find();
}
