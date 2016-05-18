package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradePo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradePoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth);

    int insert(TfBTradePo record);

    int insertSelective(TfBTradePo record);

    TfBTradePo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth);

    int updateByPrimaryKeySelective(TfBTradePo record);

    int updateByPrimaryKey(TfBTradePo record);
}