package com.asiainfo.tfsPlatform.mapper;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TfFUserPo;

public interface TfFUserPoMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(TfFUserPo record);

    int insertSelective(TfFUserPo record);

    TfFUserPo selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(TfFUserPo record);

    int updateByPrimaryKey(TfFUserPo record);
    
    TfFUserPo getUserInfo(TfFUserPo TfFUserPo);

    TfFUserPo selectAllUserType(@Param("user_id") Long user_id);

}