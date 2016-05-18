/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.interfaces.information;

import java.util.List;
import java.util.Map;

import com.asiainfo.tfsPlatform.dto.TfFAccountDto;
import com.asiainfo.tfsPlatform.dto.TfFCustGroupDto;
import com.asiainfo.tfsPlatform.dto.TfFCustomerDto;



public interface  CustomerService {
	/**
	 * 功能描述：查询车企核心客户资料列表
	 * @author wangfu
	 * @date 2016年5月11日 下午4:09:33
	 * @param @param dto
	 * @param @return 
	 * @return 
	 */
	public List<TfFCustomerDto> selectCustomerList(TfFCustomerDto dto);
	/**
	 * 功能描述： 查询车企集团客户资料列表
	 * @author wangfu
	 * @date 2016年5月16日 下午2:21:52
	 * @param @param dto
	 * @param @return 
	 * @return List<TfFCustGroupDto>
	 */
	public List<TfFCustGroupDto> selectCustGroupList(TfFCustGroupDto dto);
	/**
	 * 功能描述：查询账户信息列表
	 * @author wangfu
	 * @date 2016年5月16日 下午2:22:33
	 * @param @param dto
	 * @param @return 
	 * @return List<TfFAccountDto>
	 */
	public List<TfFAccountDto> selectAccountList(TfFAccountDto dto);
}
