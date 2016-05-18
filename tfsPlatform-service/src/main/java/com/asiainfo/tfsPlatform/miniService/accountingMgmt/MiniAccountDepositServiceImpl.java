/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.miniService.accountingMgmt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmPaymentDepositDto;
import com.asiainfo.tfsPlatform.mapper.TfFAccountDepositPoMapper;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext.AccountDepositOrderingRuleChain;
import com.asiainfo.tfsPlatform.po.TfFAccountDepositPo;
import com.google.common.collect.Lists;

/**
 * 账本相关服务.
 * 
 * @author BAOMZ
 */
// Spring Service Bean的标识.
@Service("AMMiniAccountDepositService")
public class MiniAccountDepositServiceImpl {

	@Autowired
	private TfFAccountDepositPoMapper accountDepositPoMapper;
	
	@Autowired
	private AccountDepositOrderingRuleChain accountOrderingRuleChain;


	/**
	 * 功能描述：根据客户标识查询余额
	 * 通过客户标识关联账户表, 再通过账户标识做驱动表查询账本表
	 * 
	 * @author BAOMZ
	 * @date 2016年5月16日 下午3:59:35
	 * @param @param
	 *            custId 客户表示
	 * @param @return
	 * @return List<AMAcountArrearsBalanceDto>
	 */
	public List<AmAcountArrearsBalanceDto> getLedgerBalanceListByCustId(Long custId) {

		List<Map<String, String>> list = accountDepositPoMapper.selectLedgerBalanceListByCustId(custId);
		if (list == null || list.size() == 0) {
			return null;
		}

		List<AmAcountArrearsBalanceDto> rs = Lists.newArrayList();

		for (Map<String, String> map : list) {
			rs.add((AmAcountArrearsBalanceDto) ConversionUtil.map2dto(map, AmAcountArrearsBalanceDto.class));
		}

		return rs;
	}
	
	/**
	 * 功能描述：根据客户标识 查询账本列表
	 * @author BAOMZ
	 * @date 2016年5月18日 下午5:13:56
	 * @param @param custId
	 * @param @return 
	 * @return List<AmAccountDepositDto>
	 */
	public List<AmAccountDepositDto> getAccountDepositListByCustId(Long custId){
		
		List<Map<String, String>> list = accountDepositPoMapper.selectAccountDepositListByCustId(custId);
		if (list == null || list.size() == 0) {
			return null;
		}
		
		List<AmAccountDepositDto> rs = Lists.newArrayList();
		
		for(Map<String, String> map: list){
			AmAccountDepositDto dto = (AmAccountDepositDto) ConversionUtil.map2dto(map, AmAccountDepositDto.class);
			if(dto == null){
				return null;
			}
			rs.add(dto);
		}
		return rs;

	}
	
	/**
	 * 功能描述：
	 * @author BAOMZ
	 * @date 2016年5月17日 下午4:12:13
	 * @param @param paymentDeposit
	 * @param @return 
	 * @return AMAccountDepositDto
	 */
	public AmAccountDepositDto getVirtualAccountDeposit(AmPaymentDepositDto paymentDeposit){
		return null;
	}
	
	/**
	 * 功能描述：根据账户标识查询余额
	 * @author BAOMZ
	 * @date 2016年5月17日 下午2:43:45
	 * @param @param acctId
	 * @param @return 
	 * @return AMAcountArrearsBalanceDto
	 */
	public AmAcountArrearsBalanceDto  getLedgerBalanceListByAcctId(Long acctId){
		
		Map<String, String>  map = accountDepositPoMapper.selectLedgerBalanceByAcctId(acctId);
		if (map == null) {
			return null;
		}

		return (AmAcountArrearsBalanceDto) ConversionUtil.map2dto(map, AmAcountArrearsBalanceDto.class);
	}
	
	/**
	 * 功能描述：根据账户标识查询账本信息
	 * @author BAOMZ
	 * @date 2016年5月16日 下午6:30:59
	 * @param @param acctId
	 * @param @return 
	 * @return List<AMAccountDepositDto>
	 */
	public List<AmAccountDepositDto> getAccountDepositByAcctId(Long acctId){
		
		List<TfFAccountDepositPo> list = accountDepositPoMapper.selectAccountDepositByAcctId(acctId);
		if (list == null || list.size() == 0) {
			return null;
		}
		
		List<AmAccountDepositDto> rs = Lists.newArrayList();
		for(TfFAccountDepositPo po: list){
			rs.add((AmAccountDepositDto) ConversionUtil.po2dto(po, AmAccountDepositDto.class));
		}
		accountOrderingRuleChain.startOrder(rs, 4001);
		
		return rs;
	}


	/**
	 * 功能描述：用于spring 注入 账本排序规则链
	 * @author BAOMZ
	 * @date 2016年5月17日 下午1:27:04
	 * @param @param accountOrderingRuleChain 
	 * @return void
	 */
	public void setAccountOrderingRuleChain(AccountDepositOrderingRuleChain accountOrderingRuleChain) {
		this.accountOrderingRuleChain = accountOrderingRuleChain;
	}
	
	/**
	 * 功能描述：用于spring 注入 账本映射接口
	 * @author BAOMZ
	 * @date 2016年5月17日 下午1:29:03
	 * @param @param accountDepositPoMapper 
	 * @return void
	 */
	public void setAccountDepositDao(TfFAccountDepositPoMapper accountDepositDao) {
		this.accountDepositPoMapper = accountDepositDao;
	}


}
