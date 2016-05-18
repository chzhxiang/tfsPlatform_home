package com.asiainfo.tfsPlatform.miniService.accountingMgmt.ext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.dto.AmAccountDepositDto;
import com.asiainfo.tfsPlatform.dto.AmDepositPriorRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRule;
import com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext.OrderingRuleChain;
import com.asiainfo.tfsPlatform.modules.nosql.redis.JedisClusterFactory;
import com.asiainfo.tfsPlatform.service.ServiceException;

/**
 * 类说明：账本排序规则链的实现 ,其中账户规则列表放在REDIS 缓存中, 需要依赖REDIS
 * 
 * @author BAOMZ
 * @date 2016年5月14日 下午6:12:17
 */
@Service("accountOrderingRuleChain")
public class AccountDepositOrderingRuleChain implements OrderingRuleChain<AmAccountDepositDto, Integer> {

	@SuppressWarnings("unused")
	@Autowired
	private JedisClusterFactory jedisCluster;
	
	
	/**
	 * 功能描述：通过自己组装规则链来实现集合的排序规则顺序和数量
	 * @author BAOMZ
	 * @date 2016年5月16日 上午11:24:26
	 * @param @param list
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void startOrder(List<AmAccountDepositDto> list, Integer ruleId ) {
		
		int size = 0;
		if(list == null || (size = list.size()) == 0){
			//TODO: 错误
			return;
		}
		if(size == 1){
			return;
		}
		
		Map<Integer, AmAccountDepositDto> map = new HashMap<Integer, AmAccountDepositDto>();
		for (AmAccountDepositDto b : list) {
			Integer depositCode = b.getDepositCode();
			if(depositCode == null || depositCode == 0){
				throw new ServiceException("depositCode is null or 0");
			}
			map.put(depositCode, b);
		}

		// :TODO 服务
		// 所有的规则并组装排序规则jedisCluster.buildDepositPori(ruleId);  
		List<AmDepositPriorRule> m = null;//AccountDepositOrderingRuleChainTest.buildDepositPori();
		OrderingRule rule1 = new AccountDepositOrderingByDepositPriorRule(map, m);
		OrderingRule rule2 = new AccountDepositOrderingByEndDate();
		
		
		rule1.setOrderingRule(rule2);
		try {
			rule1.order(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setJedisCluster(JedisClusterFactory jedisCluster) {
		this.jedisCluster = jedisCluster;
	}

}
