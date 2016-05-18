/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.interfaces.accountingMgmt;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmBillDto;

/**
 * 功能描述：账单相关服务
 * @author BAOMZ
 * @date 2016年5月17日
 */
public interface  BillService {
	
	/**
	 * 功能描述：
	 * @author BAOMZ
	 * @date 2016年5月17日
	 */
	enum AccessIdentify {
		CUST_ID, USER_ID, ACCT_ID;
	}
	/**
	 * 功能描述：根据帐户标识或者客户标识，获取账户总欠费信息
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:38:14
	 * @param @param id
	 * @param @param identify
	 * @param @return 
	 * @return List<AmAcountArrearsBalanceDto>
	 */
	List<AmAcountArrearsBalanceDto> getAccountArrearsList(Long id, AccessIdentify identify);

	/**
	 * 功能描述：根据帐户标识或者客户标识，获取帐单信息
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:39:00
	 * @param @param id
	 * @param @param identify
	 * @param @return 
	 * @return List<AmBillDto>
	 */
	List<AmBillDto> getBillList(Long id, AccessIdentify identify);
}
