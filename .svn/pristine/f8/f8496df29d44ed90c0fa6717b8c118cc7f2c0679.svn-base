package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfFUserProductPo;
import java.util.Date;
import org.apache.ibatis.annotations.Param;

public interface TfFUserProductPoMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("productId") Integer productId, @Param("startDate") Date startDate, @Param("userIdA") Long userIdA);

    int insert(TfFUserProductPo record);

    int insertSelective(TfFUserProductPo record);

    TfFUserProductPo selectByPrimaryKey(@Param("userId") Long userId, @Param("productId") Integer productId, @Param("startDate") Date startDate, @Param("userIdA") Long userIdA);

    int updateByPrimaryKeySelective(TfFUserProductPo record);

    int updateByPrimaryKey(TfFUserProductPo record);
}