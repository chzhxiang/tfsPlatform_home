package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeGroupPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeGroupPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("custId") Long custId);

    int insert(TfBTradeGroupPo record);

    int insertSelective(TfBTradeGroupPo record);

    TfBTradeGroupPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("custId") Long custId);

    int updateByPrimaryKeySelective(TfBTradeGroupPo record);

    int updateByPrimaryKey(TfBTradeGroupPo record);
}