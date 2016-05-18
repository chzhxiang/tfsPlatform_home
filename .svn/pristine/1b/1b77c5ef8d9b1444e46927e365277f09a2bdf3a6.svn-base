package com.asiainfo.tfsPlatform.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.SpSettleRule;

public interface SpSettleRuleMapper {
    int deleteByPrimaryKey(@Param("svcCode") String svcCode, @Param("userType") String userType, @Param("cdrType") String cdrType, @Param("billingType") String billingType, @Param("effdate") String effdate);

    int insert(SpSettleRule record);

    int insertSelective(SpSettleRule record);

    SpSettleRule selectByPrimaryKey(@Param("svcCode") String svcCode, @Param("userType") String userType, @Param("cdrType") String cdrType, @Param("billingType") String billingType, @Param("effdate") String effdate);

    int updateByPrimaryKeySelective(SpSettleRule record);

    int updateByPrimaryKey(SpSettleRule record);

    Map<String,Object> getDataBySvcCode(@Param("svcCode")String svcCode);
  
}