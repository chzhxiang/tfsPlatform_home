package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TdBPayFeeModePo;

public interface TdBPayFeeModePoMapper {
    int deleteByPrimaryKey(Short payFeeModeCode);

    int insert(TdBPayFeeModePo record);

    int insertSelective(TdBPayFeeModePo record);

    TdBPayFeeModePo selectByPrimaryKey(Short payFeeModeCode);

    int updateByPrimaryKeySelective(TdBPayFeeModePo record);

    int updateByPrimaryKey(TdBPayFeeModePo record);
}