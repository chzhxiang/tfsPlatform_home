package com.asiainfo.tfsPlatform.service.accountingMgmt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ArrearsService;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.MiniAccountDepositServiceImpl;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.MiniBiilServiceImpl;
import com.asiainfo.tfsPlatform.service.ServiceException;
import com.google.common.collect.Maps;

/**
 * 类说明：
 * 
 * @author BAOMZ
 * @date 2016年5月11日 下午3:15:10
 */
@Service("amArrearsService")
@Transactional(propagation = Propagation.REQUIRED)
public class ArrearsServiceImpl implements ArrearsService {

	@Autowired
	private MiniBiilServiceImpl miniBillService;

	@Autowired
	private MiniAccountDepositServiceImpl miniAccountDepositService;

	@Override
	public List<AmBillDto> getBillListByAcctId(Long acctId) {
		if (acctId == null) {
			throw new ServiceException("acctId is not null.");
		}
		return miniBillService.getBillListByAcctId(acctId);
	}

	@Override
	public List<AmAcountArrearsBalanceDto> getAccountArrearsAndLedgerBalanceListByCustId(Long custId) {

		if (custId == null) {
			throw new ServiceException("custId is not null.");
		}

		List<AmAcountArrearsBalanceDto> arrearsList = miniBillService.getAccountArrearsListByCustId(custId);
		List<AmAcountArrearsBalanceDto> balanceList = miniAccountDepositService.getLedgerBalanceListByCustId(custId);
		if (arrearsList == null || balanceList == null) {
			new ServiceException("没有查到相关账户信息");
		}

		if (arrearsList.size() != balanceList.size()) {
			new ServiceException("账户变动请重新查询");
		}

		Map<Long, AmAcountArrearsBalanceDto> arrearsMap = Maps.newHashMap();

		for (AmAcountArrearsBalanceDto arrears : arrearsList) {

			Long acctId = arrears.getAcctId();

			if (acctId == null) {
				throw new ServiceException("acctId is not null in arrearsList.");
			}

			arrearsMap.put(acctId, arrears);
		}

		for (AmAcountArrearsBalanceDto balance : balanceList) {
			Long acctId = balance.getAcctId();

			if (acctId == null) {
				throw new ServiceException("acctId is not null in balanceList.");
			}

			AmAcountArrearsBalanceDto arrears = arrearsMap.get(acctId);

			if (arrears == null) {
				throw new ServiceException("can not find accId = " + acctId + " in arrearsList.");
			}

			String b = balance.getBalance();
			if (b == null) {
				throw new ServiceException("balance is null from balanceList  acctId = " + acctId);
			}

			arrears.setBalance(b);
		}

		return arrearsList;
	}


	public void setMiniAccountDepositService(MiniAccountDepositServiceImpl miniAccountDepositService) {
		this.miniAccountDepositService = miniAccountDepositService;
	}

}
