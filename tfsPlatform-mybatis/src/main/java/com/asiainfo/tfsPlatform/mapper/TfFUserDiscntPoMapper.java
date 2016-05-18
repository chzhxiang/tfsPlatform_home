package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfFUserDiscntPo;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface TfFUserDiscntPoMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("userIdA") Long userIdA, @Param("discntCode") Integer discntCode, @Param("startDate") Date startDate);

    int insert(TfFUserDiscntPo record);

    int insertSelective(TfFUserDiscntPo record);

    TfFUserDiscntPo selectByPrimaryKey(@Param("userId") Long userId, @Param("userIdA") Long userIdA, @Param("discntCode") Integer discntCode, @Param("startDate") Date startDate);

    int updateByPrimaryKeySelective(TfFUserDiscntPo record);

    int updateByPrimaryKey(TfFUserDiscntPo record);
}