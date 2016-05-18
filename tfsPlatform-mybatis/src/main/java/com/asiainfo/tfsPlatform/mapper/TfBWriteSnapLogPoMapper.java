package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBWriteSnapLogPo;
import org.apache.ibatis.annotations.Param;

public interface TfBWriteSnapLogPoMapper {
    int deleteByPrimaryKey(@Param("chargeId") Long chargeId, @Param("partitionId") Short partitionId);

    int insert(TfBWriteSnapLogPo record);

    int insertSelective(TfBWriteSnapLogPo record);

    TfBWriteSnapLogPo selectByPrimaryKey(@Param("chargeId") Long chargeId, @Param("partitionId") Short partitionId);

    int updateByPrimaryKeySelective(TfBWriteSnapLogPo record);

    int updateByPrimaryKey(TfBWriteSnapLogPo record);
}