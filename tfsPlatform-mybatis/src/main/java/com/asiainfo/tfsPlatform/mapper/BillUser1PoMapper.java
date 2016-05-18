package com.asiainfo.tfsPlatform.mapper;

import com.asiainfo.tfsPlatform.dto.BillUser1Dto;
import com.asiainfo.tfsPlatform.po.BillUser1Po;
import org.apache.ibatis.annotations.Param;

public interface BillUser1PoMapper {
    int deleteByPrimaryKey(@Param("userId") Long userId, @Param("billId") Integer billId);

    int insert(BillUser1Po record);

    int insertSelective(BillUser1Po record);

    BillUser1Po selectByPrimaryKey(@Param("userId") Long userId, @Param("billId") Integer billId);

    int updateByPrimaryKeySelective(BillUser1Po record);

    int updateByPrimaryKey(BillUser1Po record);

	void insertBill1(BillUser1Po billUser1Dto);
}