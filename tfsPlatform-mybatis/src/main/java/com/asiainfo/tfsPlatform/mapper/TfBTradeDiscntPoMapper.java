package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeDiscntPo;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeDiscntPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("userId") Long userId, @Param("discntCode") Integer discntCode, @Param("startDate") Date startDate);

    int insert(TfBTradeDiscntPo record);

    int insertSelective(TfBTradeDiscntPo record);

    TfBTradeDiscntPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("userId") Long userId, @Param("discntCode") Integer discntCode, @Param("startDate") Date startDate);

    int updateByPrimaryKeySelective(TfBTradeDiscntPo record);

    int updateByPrimaryKey(TfBTradeDiscntPo record);
}