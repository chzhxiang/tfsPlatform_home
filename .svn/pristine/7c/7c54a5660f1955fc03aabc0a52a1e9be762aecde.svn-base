package com.asiainfo.tfsPlatform.service.accountingMgmt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.AmAcountArrearsBalanceDto;
import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.BillService;
import com.asiainfo.tfsPlatform.miniService.accountingMgmt.MiniBiilServiceImpl;
import com.google.common.collect.Lists;

/**
 * 类说明：
 * 
 * @author BAOMZ
 * @date 2016年5月14日 上午9:56:18
 */
@Service("amBillService")
@Transactional(propagation = Propagation.REQUIRED)
public class BillServiceImpl implements BillService {

	@Autowired
	private MiniBiilServiceImpl miniBillService;

	/**
	 * 功能描述：
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:46:20
	 * @param @param id
	 * @param @param identify
	 * @param @return 
	 * @return List<AMAcountArrearsBalanceDto>
	 */
	@Override
	public List<AmAcountArrearsBalanceDto> getAccountArrearsList(Long id, AccessIdentify identify) {

		if (id == null)
			return null;
		switch (identify) {
		case ACCT_ID:
			List<AmAcountArrearsBalanceDto> arearsList = Lists.newArrayList();
			AmAcountArrearsBalanceDto arrears = miniBillService.getAccountArrearsByAcctId(id);
			if (arrears == null)
				return null;
			return arearsList;
		case CUST_ID:
			return miniBillService.getAccountArrearsListByCustId(id);
		default:
			break;

		}
		return null;
	}

	/**
	 * 功能描述：
	 * @author 
	 * @date 2016年5月17日 下午6:46:42
	 * @param @param id
	 * @param @param identify
	 * @param @return 
	 * @return List<AMBillDto>
	 */
	@Override
	public List<AmBillDto> getBillList(Long id, AccessIdentify identify) {

		if (id == null)
			return null;
		switch (identify) {
		case ACCT_ID:
			return miniBillService.getBillListByAcctId(id);
		case CUST_ID:
			return miniBillService.getBillListByCustId(id);
		case USER_ID:
			return miniBillService.getBillListByUserId(id);
		default:
			break;

		}
		return null;
	}

	/**
	 * 功能描述：
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:45:53
	 * @param @param miniBillService 
	 * @return void
	 */
	public void setMiniBillService(MiniBiilServiceImpl miniBillService) {
		this.miniBillService = miniBillService;
	}

}
