package com.asiainfo.tfsPlatform.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TdASpTariffpo;

public interface TdASpTariffpoMapper {
    int deleteByPrimaryKey(@Param("dataTypeCode") String dataTypeCode, @Param("spCode") String spCode, @Param("spBizCode") String spBizCode, @Param("recvObjectType") String recvObjectType, @Param("startDate") Date startDate);

    int insert(TdASpTariffpo record);

    int insertSelective(TdASpTariffpo record);

    TdASpTariffpo selectByPrimaryKey(@Param("dataTypeCode") String dataTypeCode, @Param("spCode") String spCode, @Param("spBizCode") String spBizCode, @Param("recvObjectType") String recvObjectType, @Param("startDate") Date startDate);

    int updateByPrimaryKeySelective(TdASpTariffpo record);

    int updateByPrimaryKey(TdASpTariffpo record);

	TdASpTariffpo selectPriceByProductId(@Param("SP_CODE") String sp_code);
	
	
}