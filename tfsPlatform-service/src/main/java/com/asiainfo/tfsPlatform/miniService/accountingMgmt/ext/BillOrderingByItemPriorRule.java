package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.dto.AmItemPriorRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.MergingRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;
import com.asiainfo.tfsPlatform.service.ServiceException;

/**
* 类说明：根据帐目规则排序实例
* @author BAOMZ
* @date 2016年5月16日 下午7:21:59
*/
public class BillOrderingByItemPriorRule extends OrderingRule<AmBillDto> implements Comparator<AmBillDto>,MergingRule<AmItemPriorRule>{

	private Map<Integer, AmBillDto> map = null;
	
	public BillOrderingByItemPriorRule(Map<Integer, AmBillDto> map, List<AmItemPriorRule> list){
		this.map = map;
		try {
			merge(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void order(List<AmBillDto> list) throws Exception {
		Collections.sort(list, this);
	}

	@Override
	public int compare(AmBillDto o1, AmBillDto o2) {
		return algorithm(o1, o2);
	}

	@Override
	public void merge(List<AmItemPriorRule> list) throws Exception {
		if (list == null || list.size() == 0) {
			throw new ServiceException("merge list is null or empty.");
		}
		for (AmItemPriorRule r : list) {
			Integer itemCode = r.getItemCode();
			if (itemCode == null) {
				throw new ServiceException("itemCode is null in  ruleList.");
			}
			if(!map.containsKey(itemCode)){
				continue;
			}
			AmBillDto dto = map.get(itemCode);
			Integer priority = r.getPriority();
			if (priority == null) {
				throw new ServiceException("priority is null in  ruleList.");
			}
			dto.setPriority(priority);
		}
	}

	@Override
	public int algorithm(AmBillDto t1, AmBillDto t2) {
		Integer t1Priority = t1.getPriority();
		Integer t2Priority = t2.getPriority();
		
		int rs = 0;
		
		if(t1Priority == null && t2Priority == null) rs = 0;
		else if(t1Priority == null) return -1;
		else if(t2Priority == null) return  1;
		else rs = t2Priority - t1Priority;
		if(rs != 0) return rs;
		return nextAlgorithm(t1, t2);
	}

}
