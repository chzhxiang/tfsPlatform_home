package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBPayLogPo;
import org.apache.ibatis.annotations.Param;

public interface TfBPayLogPoMapper {
    int deleteByPrimaryKey(@Param("chargeId") Long chargeId, @Param("partitionId") Short partitionId);

    int insert(TfBPayLogPo record);

    int insertSelective(TfBPayLogPo record);

    TfBPayLogPo selectByPrimaryKey(@Param("chargeId") Long chargeId, @Param("partitionId") Short partitionId);

    int updateByPrimaryKeySelective(TfBPayLogPo record);

    int updateByPrimaryKey(TfBPayLogPo record);
}