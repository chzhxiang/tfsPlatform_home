package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBDepositPriorRulePo;
import org.apache.ibatis.annotations.Param;

public interface TdBDepositPriorRulePoMapper {
    int deleteByPrimaryKey(@Param("depositPriorRuleId") Integer depositPriorRuleId, @Param("depositCode") Short depositCode);

    int insert(TdBDepositPriorRulePo record);

    int insertSelective(TdBDepositPriorRulePo record);

    TdBDepositPriorRulePo selectByPrimaryKey(@Param("depositPriorRuleId") Integer depositPriorRuleId, @Param("depositCode") Short depositCode);

    int updateByPrimaryKeySelective(TdBDepositPriorRulePo record);

    int updateByPrimaryKey(TdBDepositPriorRulePo record);
}