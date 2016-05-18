package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBPaymentDepositPo;
import org.apache.ibatis.annotations.Param;

public interface TdBPaymentDepositPoMapper {
    int deleteByPrimaryKey(@Param("paymentId") Integer paymentId, @Param("payFeeModeCode") Short payFeeModeCode, @Param("ruleId") Integer ruleId);

    int insert(TdBPaymentDepositPo record);

    int insertSelective(TdBPaymentDepositPo record);

    TdBPaymentDepositPo selectByPrimaryKey(@Param("paymentId") Integer paymentId, @Param("payFeeModeCode") Short payFeeModeCode, @Param("ruleId") Integer ruleId);

    int updateByPrimaryKeySelective(TdBPaymentDepositPo record);

    int updateByPrimaryKey(TdBPaymentDepositPo record);
}