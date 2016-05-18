package com.asiainfo.tfsPlatform.interfaces.order;

import com.asiainfo.tfsPlatform.dto.ext.UserProductTradeDto;

/**
 * 类说明：用户订购台帐信息服务接口
 * @author zhouzy3
 * @date 2016年5月18日 上午10:05:25
 */
public interface PersonUserProductOrderService {

	/**
	 * 功能描述：新增用户订购台帐信息
	 * @author zhouzy3
	 * @date 2016年5月18日 上午11:27:03
	 * @param @param userProductTradeDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertPersonUserProductOrder(UserProductTradeDto userProductTradeDto);
}
