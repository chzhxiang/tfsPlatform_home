package com.asiainfo.tfsPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TdBPartyService;

public interface TdBPartyServiceMapper {
    int deleteByPrimaryKey(String spServiceId);

    int insert(TdBPartyService record);

    int insertSelective(TdBPartyService record);

    TdBPartyService selectByPrimaryKey(String spServiceId);

    int updateByPrimaryKeySelective(TdBPartyService record);

    int updateByPrimaryKey(TdBPartyService record);
    
    List<TdBPartyService>getTdBServiceData(@Param("SpServiceId")String SpServiceId,@Param("SpServiceName")String SpServiceName);
}