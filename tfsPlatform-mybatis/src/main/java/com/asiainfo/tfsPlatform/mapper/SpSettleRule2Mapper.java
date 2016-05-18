package com.asiainfo.tfsPlatform.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.SpSettleRule2;

public interface SpSettleRule2Mapper {
    int deleteByPrimaryKey(@Param("partyId") String partyId, @Param("spServiceId") Long spServiceId);

    int insert(SpSettleRule2 record);

    int insertSelective(SpSettleRule2 record);

    SpSettleRule2 selectByPrimaryKey(@Param("partyId") String partyId, @Param("spServiceId") Long spServiceId);

    int updateByPrimaryKeySelective(SpSettleRule2 record);

    int updateByPrimaryKey(SpSettleRule2 record);
}