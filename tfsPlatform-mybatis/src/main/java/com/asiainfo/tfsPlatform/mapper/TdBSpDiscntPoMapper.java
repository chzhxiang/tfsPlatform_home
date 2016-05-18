package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBSpDiscntPo;

public interface TdBSpDiscntPoMapper {
    int deleteByPrimaryKey(String spProductId);

    int insert(TdBSpDiscntPo record);

    int insertSelective(TdBSpDiscntPo record);

    TdBSpDiscntPo selectByPrimaryKey(String spProductId);

    int updateByPrimaryKeySelective(TdBSpDiscntPo record);

    int updateByPrimaryKey(TdBSpDiscntPo record);
    
    TdBSpDiscntPo selectBillingModeById(int id);
}