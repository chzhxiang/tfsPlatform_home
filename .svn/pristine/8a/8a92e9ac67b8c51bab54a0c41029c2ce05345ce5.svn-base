package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;

/**
* 类说明： 根据账单标识排序实例
* @author BAOMZ
* @date 2016年5月16日 下午7:48:58
*/
public class BillOrderingByBillId extends OrderingRule<AmBillDto> implements Comparator<AmBillDto> {

	/**
	 * 功能描述：账单标识从小到大排序
	 * @author BAOMZ
	 * @date 2016年5月16日 下午7:51:20
	 * @param @param o1
	 * @param @param o2
	 * @param @return
	 */
	@Override
	public int compare(AmBillDto o1, AmBillDto o2) {
		return algorithm(o1, o2);
	}

	@Override
	public void order(List<AmBillDto> list) throws Exception {
		Collections.sort(list, this);
	}

	@Override
	public int algorithm(AmBillDto t1, AmBillDto t2) {

		Long t1BillId = t1.getBillId();
		Long t2BillId = t2.getBillId();
		
		int rs = 0;
		
		if(t1BillId == null && t2BillId == null) rs = 0;
		else if(t1BillId == null) return -1;
		else if(t2BillId == null) return  1;
		else rs = (int) (t1BillId - t2BillId);
		
		if(rs != 0) return rs;
		
		return nextAlgorithm(t1, t2);
	}
}
