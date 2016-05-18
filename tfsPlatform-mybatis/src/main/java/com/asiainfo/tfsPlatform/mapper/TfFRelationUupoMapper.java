package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.dto.TfFRelationUuDto;
import com.asiainfo.tfsPlatform.po.TfFRelationUupo;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TfFRelationUupoMapper {
    int deleteByPrimaryKey(@Param("userIdA") Long userIdA, @Param("userIdB") Long userIdB, @Param("relationTypeCode") String relationTypeCode, @Param("startDate") Date startDate);

    int insert(TfFRelationUupo record);

    int insertSelective(TfFRelationUupo record);

    TfFRelationUupo selectByPrimaryKey(@Param("userIdA") Long userIdA, @Param("userIdB") Long userIdB, @Param("relationTypeCode") String relationTypeCode, @Param("startDate") Date startDate);

    int updateByPrimaryKeySelective(TfFRelationUupo record);

    int updateByPrimaryKey(TfFRelationUupo record);

	List<TfFRelationUuDto> selectGroupUsers(@Param("user_id") Long user_id);
}