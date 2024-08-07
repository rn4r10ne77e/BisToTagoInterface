package com.geon.bis.tago.bistotagointerface.mapper;


import com.geon.bis.tago.bistotagointerface.mapper.model.BusComp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusCompMapper {
    BusComp find();
}
