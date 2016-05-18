package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.dto.AmDepositPriorRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.MergingRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;
import com.asiainfo.tfsPlatform.service.ServiceException;

/**
 * 类说明：按照账本科目规则列表进行排序的实体规则
 * 
 * @author BAOMZ
 * @date 2016年5月14日 上午10:06:05
 */
public class AccountDepositOrderingByDepositPriorRule extends OrderingRule<AmAccountDepositDto>
		implements Comparator<AmAccountDepositDto>, MergingRule<AmDepositPriorRule> {

	private Map<Integer, AmAccountDepositDto> map = null;

	public AccountDepositOrderingByDepositPriorRule(Map<Integer, AmAccountDepositDto> map,
			List<AmDepositPriorRule> list) {
		this.map = map;

		try {
			merge(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void order(List<AmAccountDepositDto> list) throws Exception {
		Collections.sort(list, this);
	}

	@Override
	public int compare(AmAccountDepositDto o1, AmAccountDepositDto o2) {
		return algorithm(o1, o2);

	}

	@Override
	public void merge(List<AmDepositPriorRule> list) throws Exception {

		if (list == null || list.size() == 0) {
			throw new ServiceException("merge list is null or empty.");
		}
		for (AmDepositPriorRule r : list) {
			Integer depositCode = r.getDepositCode();
			if (depositCode == null) {
				throw new ServiceException("depositCode is null in  ruleList.");
			}
			if (!map.containsKey(depositCode)) {
				continue;
			}
			AmAccountDepositDto dto = map.get(depositCode);
			Integer priority = r.getPriority();
			if (priority == null) {
				throw new ServiceException("priority is null in  ruleList.");
			}
			dto.setPriority(priority);
		}
	}

	@Override
	public int algorithm(AmAccountDepositDto t1, AmAccountDepositDto t2) {

		Integer o2Priority = t2.getPriority();
		Integer o1Priority = t1.getPriority();
		int rs = 0;

		if (o2Priority == null && o1Priority == null)
			rs = 0;
		else if (o1Priority == null)
			return -1;
		else if (o2Priority == null)
			return 1;
		else
			rs = o2Priority - o1Priority;

		if (rs != 0)
			return rs;

		return nextAlgorithm(t1, t2);
	}

}
