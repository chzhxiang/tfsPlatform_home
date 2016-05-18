package com.asiainfo.tfsPlatform.service.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.ext.UserProductInfoDto;
import com.asiainfo.tfsPlatform.dto.ext.UserProductTradeDto;
import com.asiainfo.tfsPlatform.interfaces.order.PersonUserProductOrderService;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeDiscntServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeProductServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeSpServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeUserServiceImpl;

/**
 * 类说明：用户订购台帐信息服务接口实现
 * @author zhouzy3
 * @date 2016年5月18日 上午10:05:46
 */
@Service("personUserProductOrderService")
@Transactional(propagation=Propagation.REQUIRED)
public class PersonUserProductOrderServiceImpl implements PersonUserProductOrderService {
	/**
	 * 用户台账微服务
	 */
	@Autowired
	private MiniTradeUserServiceImpl miniTradeUserServiceImpl;
	
	/**
	 * 产品台帐微服务
	 */
	@Autowired
	private MiniTradeProductServiceImpl miniTradeProductServiceImpl;
	
	/**
	 * 用户优惠台账微服务
	 */
	@Autowired
	private MiniTradeDiscntServiceImpl miniTradeDiscntServiceImpl;
	
	/**
	 * 用户SP增值服务台账微服务
	 */
	@Autowired
	private MiniTradeSpServiceImpl miniTradeSpServiceImpl;

	/**
	 * 功能描述：新增用户订购台帐信息
	 * @author zhouzy3
	 * @date 2016年5月18日 上午11:27:37
	 * @param @param userProductTradeDto
	 * @param @return
	 */
	@Override
	public boolean insertPersonUserProductOrder(UserProductTradeDto userProductTradeDto) {
		// TODO Auto-generated method stub
		return false;
	}
}
