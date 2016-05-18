/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.service.accountingMgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.AccountDepositService;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.MiniAccountDepositServiceImpl;

/**
 * 账户余额管理类.
 * 
 * @author BAOMZ
 */
// Spring Service Bean的标识.
@Service("amAccountDepositService")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountDepositServiceImpl implements AccountDepositService {

	@Autowired
	private MiniAccountDepositServiceImpl miniAccountDepositService;

	@Override
	public List<AmAcountArrearsBalanceDto> getLedgerBalanceListByCustId(Long custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AmAcountArrearsBalanceDto getLedgerBalanceListByAcctId(Long acctId) {
		
		if(acctId == null) return null;		
		return miniAccountDepositService.getLedgerBalanceListByAcctId(acctId);
	}

	@Override
	public List<AmAccountDepositDto> getAccountDepositListByCustId(Long custId) {
		
		if(custId ==  null) return null;
		return miniAccountDepositService.getAccountDepositListByCustId(custId);
	}
	

	
}
