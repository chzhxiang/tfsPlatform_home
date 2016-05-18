package com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext;

import java.util.List;

/**
* 类说明：排序规则链接口
* @author BAOMZ
* @date 2016年5月14日 上午10:12:23
*/
public interface OrderingRuleChain<T,I> {
	
	/**
	 * 功能描述：调用此方法对集合进行排序
	 * @author BAOMZ
	 * @date 2016年5月17日 上午10:50:34
	 * @param @param list 需要排序的集合
	 * @return void
	 */
	void startOrder(List<T> list, I ruleId);
}
