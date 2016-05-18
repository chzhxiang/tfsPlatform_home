package com.asiainfo.tfsPlatform.service.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.interfaces.information.PersonUserProductFloorService;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserDiscntServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserProductServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserSpServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeDiscntServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeProductServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeSpServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeUserServiceImpl;

/**
 * 类说明：用户订购信息归档服务接口实现
 * @author zhouzy3
 * @date 2016年5月18日 上午10:08:39
 */
@Service("personUserProductFloorService")
@Transactional(propagation=Propagation.REQUIRED)
public class PersonUserProductFloorServiceImpl implements PersonUserProductFloorService {
	/**
	 * 台账主表微服务
	 */
	@Autowired
	private MiniTradeServiceImpl miniTradeServiceImpl;
	
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
	 * 用户的微服务
	 */
	@Autowired
	private MiniUserServiceImpl miniUserServiceImpl;
	
	/**
	 * 用户产品微服务
	 */
	@Autowired
	private MiniUserProductServiceImpl miniUserProductServiceImpl;
	
	/**
	 * 用户优惠微服务
	 */
	@Autowired
	private MiniUserDiscntServiceImpl miniUserDiscntServiceImpl;
	
	/**
	 * 用户SP增值服务微服务
	 */
	@Autowired
	private MiniUserSpServiceImpl miniUserSpServiceImpl;
	
	/**
	 * 功能描述：根据tradeId对用户订购信息进行归档
	 * @author zhouzy3
	 * @date 2016年5月18日 上午11:51:59
	 * @param @param tradeId
	 * @param @return
	 */
	@Override
	public boolean archivePersonUserProductFloor(Long tradeId) {
		// TODO Auto-generated method stub
		return false;
	}

}
