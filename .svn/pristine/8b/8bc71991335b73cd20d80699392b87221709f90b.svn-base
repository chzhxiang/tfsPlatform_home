package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBItemPriorRulePo;
import org.apache.ibatis.annotations.Param;

public interface TdBItemPriorRulePoMapper {
    int deleteByPrimaryKey(@Param("itemPriorRuleId") Integer itemPriorRuleId, @Param("itemCode") Integer itemCode);

    int insert(TdBItemPriorRulePo record);

    int insertSelective(TdBItemPriorRulePo record);

    TdBItemPriorRulePo selectByPrimaryKey(@Param("itemPriorRuleId") Integer itemPriorRuleId, @Param("itemCode") Integer itemCode);

    int updateByPrimaryKeySelective(TdBItemPriorRulePo record);

    int updateByPrimaryKey(TdBItemPriorRulePo record);
}