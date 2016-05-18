package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.po.TfFCustomerPo;

public interface TfFCustomerPoExtMapper {

	//查询车企客户核心主表列表
    List<TfFCustomerPo> selectCustomerList(TfFCustomerPo po);
}