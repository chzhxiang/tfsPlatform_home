package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.po.TJUserImportPo;

public interface TJUserImportPoMapper {
    int insert(TJUserImportPo record);

    int insertSelective(TJUserImportPo record);
}