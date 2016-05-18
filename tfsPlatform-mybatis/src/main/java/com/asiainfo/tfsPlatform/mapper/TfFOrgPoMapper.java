package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TfFOrgPo;

public interface TfFOrgPoMapper {

    int deleteByPrimaryKey(Integer orgId);

    int insert(TfFOrgPo record);

    int insertSelective(TfFOrgPo record);

    TfFOrgPo selectByPrimaryKey(Integer orgId);

    int updateByPrimaryKeySelective(TfFOrgPo record);

    int updateByPrimaryKey(TfFOrgPo record);
    
}