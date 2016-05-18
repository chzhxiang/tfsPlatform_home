package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeCustomerPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("custId") Long custId);

    int insert(TfBTradeCustomerPo record);

    int insertSelective(TfBTradeCustomerPo record);

    TfBTradeCustomerPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("custId") Long custId);

    int updateByPrimaryKeySelective(TfBTradeCustomerPo record);

    int updateByPrimaryKey(TfBTradeCustomerPo record);
}