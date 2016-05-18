package com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext;

import java.util.List;

/**
 * 类说明：排序规则接口，排序规则都有实现此接口,最终以规则链的方式提供服务
 * 
 * @author BAOMZ
 * @date 2016年5月14日 上午10:11:31
 */
public abstract class OrderingRule<T> {

	protected OrderingRule<T> orderingRule;

	/**
	 * 功能描述：获取下一个规则
	 * 
	 * @author BAOMZ
	 * @date 2016年5月17日 上午9:39:02
	 * @param @return
	 * @return OrderingRule<T>
	 */
	public OrderingRule<T> getOrderingRule() {
		return orderingRule;
	}

	/**
	 * 功能描述：设置排序规则
	 * 
	 * @author BAOMZ
	 * @date 2016年5月17日 上午9:39:31
	 * @param @param
	 *            orderingRule
	 * @return void
	 */
	public void setOrderingRule(OrderingRule<T> orderingRule) {
		this.orderingRule = orderingRule;
	}

	/**
	 * 功能描述：对集合进行排序
	 * 
	 * @author BAOMZ
	 * @date 2016年5月16日 下午7:52:07
	 * @param @param
	 *            list
	 * @param @throws
	 *            Exception
	 * @return void
	 */
	public abstract void order(List<T> list) throws Exception;

	/**
	 * 功能描述：需要实现的排序规则算法
	 * 
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:05:23
	 * @param @param
	 *            t1
	 * @param @param
	 *            t2
	 * @param @return
	 * @return int
	 */
	public abstract int algorithm(T t1, T t2);

	/**
	 * 功能描述：执行规则链中的算法
	 * 
	 * @author BAOMZ
	 * @date 2016年5月17日 下午6:06:11
	 * @param @param
	 *            t1
	 * @param @param
	 *            t2
	 * @param @return
	 * @return int
	 */
	public int nextAlgorithm(T t1, T t2) {

		OrderingRule<T> orderingRule = this.getOrderingRule();
		if (orderingRule != null) {
			return orderingRule.algorithm(t1, t2);
		}
		return 0;
	}

}
