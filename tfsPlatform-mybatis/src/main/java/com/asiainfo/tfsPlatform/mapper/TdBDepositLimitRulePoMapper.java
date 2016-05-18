package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBDepositLimitRulePo;
import org.apache.ibatis.annotations.Param;

public interface TdBDepositLimitRulePoMapper {
    int deleteByPrimaryKey(@Param("depositLimitRuleId") Integer depositLimitRuleId, @Param("depositCode") Short depositCode, @Param("itemCode") Integer itemCode);

    int insert(TdBDepositLimitRulePo record);

    int insertSelective(TdBDepositLimitRulePo record);

    TdBDepositLimitRulePo selectByPrimaryKey(@Param("depositLimitRuleId") Integer depositLimitRuleId, @Param("depositCode") Short depositCode, @Param("itemCode") Integer itemCode);

    int updateByPrimaryKeySelective(TdBDepositLimitRulePo record);

    int updateByPrimaryKey(TdBDepositLimitRulePo record);
}