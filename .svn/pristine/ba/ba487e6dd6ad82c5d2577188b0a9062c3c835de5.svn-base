package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeUserPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeUserPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("userId") Long userId);

    int insert(TfBTradeUserPo record);

    int insertSelective(TfBTradeUserPo record);

    TfBTradeUserPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("userId") Long userId);

    int updateByPrimaryKeySelective(TfBTradeUserPo record);

    int updateByPrimaryKey(TfBTradeUserPo record);
}