package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;

/**
* 类说明：
* @author Administrator
* @date 2016年5月16日 下午7:45:34
*/
public class BillOrderingByCycleId extends OrderingRule<AmBillDto> implements Comparator<AmBillDto> {

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
		
		Integer t1CycleId = t1.getCycleId();
		Integer t2CycleId = t2.getCycleId();
		
		int rs = 0;
		if(t1CycleId == null && t2CycleId == null) rs = 0;
		else if(t1CycleId == null) return -1;
		else if(t2CycleId == null) return  1;
		else rs = t1CycleId - t2CycleId;
		
		if(rs != 0) return rs;
		return nextAlgorithm(t1, t2);
	}

}
