/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.interfaces.accountingMgmt;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;

/**
 * 账本相关服务
 * 
 * @author BAOMZ
 */

public interface  AccountDepositService {
	
	/**
	 * 功能描述：根据客户查询账户余额列表
	 * @author BAOMZ
	 * @date 2016年5月17日 下午4:55:04
	 * @param @param custId
	 * @param @return 
	 * @return List<AmAcountArrearsBalanceDto>
	 */
	List<AmAcountArrearsBalanceDto> getLedgerBalanceListByCustId(Long custId);
	
	/**
	 * 功能描述： 根据账户查询余额
	 * @author BAOMZ
	 * @date 2016年5月17日 下午5:55:11
	 * @param @param acctId
	 * @param @return 
	 * @return AmAcountArrearsBalanceDto
	 */
	AmAcountArrearsBalanceDto  getLedgerBalanceListByAcctId(Long acctId);
	
	/**
	 * 功能描述：根据客户标识查询账本列表
	 * @author BAOMZ
	 * @date 2016年5月18日 下午4:14:58
	 * @param @param custId
	 * @param @return 
	 * @return List<AmAccountDepositDto>
	 */
	List<AmAccountDepositDto>  getAccountDepositListByCustId(Long custId);
	
	
	
	
}
