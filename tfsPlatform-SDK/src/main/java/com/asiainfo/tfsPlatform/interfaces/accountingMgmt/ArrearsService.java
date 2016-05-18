package com.asiainfo.tfsPlatform.interfaces.accountingMgmt;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmBillDto;

/**
 * 欠费相关服务
 * 
 * @author BAOMZ
 *
 */
public interface ArrearsService {
	
	
	/**
	 * 功能描述：根据客户标识查询账户欠费和余额
	 * @author BAOMZ
	 * @date 2016年5月16日 下午12:50:36
	 * @param @param custId
	 * @param @return 
	 * @return List<AmAcountArrearsBalanceDto>
	 */
	List<AmAcountArrearsBalanceDto> getAccountArrearsAndLedgerBalanceListByCustId(Long custId) throws Exception;
	
	/**
	 * 功能描述：根据账户标识查询账单列表
	 * @author BAOMZ
	 * @date 2016年5月16日 下午5:16:34
	 * @param @param acctId
	 * @param @return
	 * @param @throws Exception 
	 * @return List<AmBillDto>
	 */
	List<AmBillDto>  getBillListByAcctId(Long acctId) throws Exception;
}
