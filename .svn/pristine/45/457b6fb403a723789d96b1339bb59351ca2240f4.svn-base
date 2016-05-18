package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeAccountPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeAccountPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("acctId") Long acctId);

    int insert(TfBTradeAccountPo record);

    int insertSelective(TfBTradeAccountPo record);

    TfBTradeAccountPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("acctId") Long acctId);

    int updateByPrimaryKeySelective(TfBTradeAccountPo record);

    int updateByPrimaryKey(TfBTradeAccountPo record);
}