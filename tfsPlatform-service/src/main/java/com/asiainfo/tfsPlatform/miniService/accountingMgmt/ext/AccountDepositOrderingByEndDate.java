package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;

/**
* 类说明：
* @author BAOMZ
* @date 2016年5月14日 下午5:45:54
*/
public class AccountDepositOrderingByEndDate extends OrderingRule<AmAccountDepositDto> implements Comparator<AmAccountDepositDto> {

	@Override
	public void order(List<AmAccountDepositDto> list) throws Exception {
		Collections.sort(list, this);	
	}

	@Override
	public int compare(AmAccountDepositDto o1, AmAccountDepositDto o2) {
		return algorithm(o1, o2);
	}

	@Override
	public int algorithm(AmAccountDepositDto t1, AmAccountDepositDto t2) {
		
		Date o1Date = t1.getEndDate();
		Date o2Date = t2.getEndDate();
		
		int rs = 0;
		if(o1Date == null && o2Date == null) rs = 0;
		else if(o1Date == null) return   1;
		else if(o2Date == null) return  -1;
		else rs = (int) (o1Date.getTime() - o2Date.getTime());
		
		if(rs != 0) return rs;
		
		return nextAlgorithm(t1, t2);
	}

}
