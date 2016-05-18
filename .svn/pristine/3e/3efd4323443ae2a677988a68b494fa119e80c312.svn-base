package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBAccessLogPo;
import org.apache.ibatis.annotations.Param;

public interface TfBAccessLogPoMapper {
    int deleteByPrimaryKey(@Param("accessId") Long accessId, @Param("partitionId") Short partitionId);

    int insert(TfBAccessLogPo record);

    int insertSelective(TfBAccessLogPo record);

    TfBAccessLogPo selectByPrimaryKey(@Param("accessId") Long accessId, @Param("partitionId") Short partitionId);

    int updateByPrimaryKeySelective(TfBAccessLogPo record);

    int updateByPrimaryKey(TfBAccessLogPo record);
}