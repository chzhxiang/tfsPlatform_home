package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeProductPo;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeProductPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("productId") Integer productId, @Param("startDate") Date startDate, @Param("userIdA") Long userIdA);

    int insert(TfBTradeProductPo record);

    int insertSelective(TfBTradeProductPo record);

    TfBTradeProductPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("productId") Integer productId, @Param("startDate") Date startDate, @Param("userIdA") Long userIdA);

    int updateByPrimaryKeySelective(TfBTradeProductPo record);

    int updateByPrimaryKey(TfBTradeProductPo record);
}