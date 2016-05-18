package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfBWriteOffLogPo;
import org.apache.ibatis.annotations.Param;

public interface TfBWriteOffLogPoMapper {
    int deleteByPrimaryKey(@Param("writeoffId") Long writeoffId, @Param("partitionId") Short partitionId);

    int insert(TfBWriteOffLogPo record);

    int insertSelective(TfBWriteOffLogPo record);

    TfBWriteOffLogPo selectByPrimaryKey(@Param("writeoffId") Long writeoffId, @Param("partitionId") Short partitionId);

    int updateByPrimaryKeySelective(TfBWriteOffLogPo record);

    int updateByPrimaryKey(TfBWriteOffLogPo record);
}