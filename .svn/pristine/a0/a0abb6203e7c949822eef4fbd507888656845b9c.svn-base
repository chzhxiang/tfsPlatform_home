package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.dto.BillUser0Dto;
import com.asiainfo.tfsPlatform.po.BillUser0Po;
import org.apache.ibatis.annotations.Param;

public interface BillUser0PoMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("billId") Integer billId);

    int insert(BillUser0Po record);

    int insertSelective(BillUser0Po record);

    BillUser0Po selectByPrimaryKey(@Param("userId") Long userId, @Param("billId") Integer billId);

    int updateByPrimaryKeySelective(BillUser0Po record);

    int updateByPrimaryKey(BillUser0Po record);

	void insertBill0(BillUser0Dto billUser0Dto);
}