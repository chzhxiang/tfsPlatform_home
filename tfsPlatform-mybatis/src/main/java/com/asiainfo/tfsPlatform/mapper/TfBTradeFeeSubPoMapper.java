package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBTradeFeeSubPo;
import org.apache.ibatis.annotations.Param;

public interface TfBTradeFeeSubPoMapper {
    int deleteByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("feeMode") String feeMode, @Param("feeTypeCode") Integer feeTypeCode, @Param("calculateId") Long calculateId);

    int insert(TfBTradeFeeSubPo record);

    int insertSelective(TfBTradeFeeSubPo record);

    TfBTradeFeeSubPo selectByPrimaryKey(@Param("tradeId") Long tradeId, @Param("acceptMonth") Short acceptMonth, @Param("feeMode") String feeMode, @Param("feeTypeCode") Integer feeTypeCode, @Param("calculateId") Long calculateId);

    int updateByPrimaryKeySelective(TfBTradeFeeSubPo record);

    int updateByPrimaryKey(TfBTradeFeeSubPo record);
}