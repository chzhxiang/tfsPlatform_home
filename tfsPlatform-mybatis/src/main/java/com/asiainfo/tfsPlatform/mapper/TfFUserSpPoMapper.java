package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfFUserSpPo;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TfFUserSpPoMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("spId") String spId, @Param("spProductId") String spProductId, @Param("startDate") Date startDate);

    int insert(TfFUserSpPo record);

    int insertSelective(TfFUserSpPo record);

    TfFUserSpPo selectByPrimaryKey(@Param("userId") Long userId, @Param("spId") String spId, @Param("spProductId") String spProductId, @Param("startDate") Date startDate);

    int updateByPrimaryKeySelective(TfFUserSpPo record);

    int updateByPrimaryKey(TfFUserSpPo record);
    
    List<TfFUserSpPo> selectAllUser();
}