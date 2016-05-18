package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.dto.AmBillDto;
import com.asiainfo.tfsPlatform.dto.AmItemPriorRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRuleChain;
import com.asiainfo.tfsPlatform.modules.nosql.redis.JedisClusterFactory;
import com.asiainfo.tfsPlatform.service.ServiceException;
import com.google.common.collect.Maps;

/**
* 类说明： 账单排序实例规则
* @author BAOMZ
* @date 2016年5月16日 下午7:09:52
*/
@Service("billOrderingRuleChain")
public class BillOrderingRuleChain implements OrderingRuleChain<AmBillDto,Integer>{

	@Autowired
	private JedisClusterFactory jedisCluster;
	
	@Override
	public void startOrder(List<AmBillDto> list, Integer ruleId) {
		int size = 0;
		if(list == null || (size = list.size()) == 0){
			//TODO: 错误
			return;
		}
		if(size == 1){
			return;
		}
		
		Map<Integer, AmBillDto> map = Maps.newHashMap();
		
		for(AmBillDto m: list){
			Integer  itemCode = m.getIntegrateItemCode();
			if(itemCode == null || itemCode == 0){
				throw new ServiceException("itemCode is null or 0");
			}
			map.put(itemCode, m);
		}
		//TODO: 所有的规则并组装排序规则jedisCluster.buildDepositPori(ruleId);  
		List<AmItemPriorRule> priorList = null;//BillOrderingRuleChainTest.buildItemPori();
		BillOrderingByCycleId rule1 = new BillOrderingByCycleId();
		BillOrderingByItemPriorRule rule2 = new BillOrderingByItemPriorRule(map, priorList);
		BillOrderingByBillId rule3 = new BillOrderingByBillId();
		rule2.setOrderingRule(rule3);
		rule1.setOrderingRule(rule2);
		try {
			rule1.order(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public JedisClusterFactory getJedisCluster() {
		return jedisCluster;
	}

	public void setJedisCluster(JedisClusterFactory jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

}
