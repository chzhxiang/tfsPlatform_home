package com.asiainfo.tfsPlatform.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TdBParty;

public interface TdBPartyMapper {
    int deleteByPrimaryKey(String partyId);

    int insert(TdBParty record);

    int insertSelective(TdBParty record);

    TdBParty selectByPrimaryKey(String partyId);

    int updateByPrimaryKeySelective(TdBParty record);

    int updateByPrimaryKey(TdBParty record);
    
    List<TdBParty>getPartInfo(@Param("partyId")String partyId,@Param("partName")String partName);
}