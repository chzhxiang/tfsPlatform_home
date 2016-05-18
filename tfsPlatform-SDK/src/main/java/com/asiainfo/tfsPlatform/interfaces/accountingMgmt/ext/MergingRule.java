package com.asiainfo.tfsPlatform.interfaces.accountingMgmt.ext;

import java.util.List;

/**
* 类说明：可以合并的规则定义，通过复制该列表对象的属性到原列表中，以便进行排序，此接口被OrderingRule定义的实体规则消化。
* @author BAOMZ
* @date 2016年5月16日 上午10:30:11
*/
public interface MergingRule<M> {

	
	/**
	 * 功能描述：需要实现此方法, 将此集合中的对象合并到需要排序的集合中
	 * @author BAOMZ
	 * @date 2016年5月16日 上午11:01:01
	 * @param @param list
	 * @param @throws Exception 
	 * @return void
	 */
	 void merge(List<M> list) throws Exception;
}
