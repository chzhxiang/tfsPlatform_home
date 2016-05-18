package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeSpPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeSpPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("productId") Integer productId, @Param("packageId") Integer packageId, @Param("modifyTag") String modifyTag, @Param("spServiceId") Integer spServiceId);

    int insert(TfBTradeSpPo record);

    int insertSelective(TfBTradeSpPo record);

    TfBTradeSpPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("productId") Integer productId, @Param("packageId") Integer packageId, @Param("modifyTag") String modifyTag, @Param("spServiceId") Integer spServiceId);

    int updateByPrimaryKeySelective(TfBTradeSpPo record);

    int updateByPrimaryKey(TfBTradeSpPo record);
}