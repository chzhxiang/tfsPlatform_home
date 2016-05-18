package com.asiainfo.tfsPlatform.service.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.ext.UserProductInfoDto;
import com.asiainfo.tfsPlatform.interfaces.information.PersonUserProductInfoService;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserDiscntServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserProductServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserServiceImpl;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserSpServiceImpl;

/**
 * 类说明：用户订购信息查询服务接口实现
 * @author zhouzy3
 * @date 2016年5月18日 上午9:41:11
 */
@Service("personUserProductInfoService")
@Transactional(propagation=Propagation.REQUIRED)
public class PersonUserProductInfoServiceImpl implements PersonUserProductInfoService{
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
	 * 功能描述：通过用户Id查询用户订购的信息
	 * @author zhouzy3
	 * @date 2016年5月18日 上午9:52:31
	 * @param @param userId
	 * @param @return
	 */
	@Override
	public UserProductInfoDto queryPersonUserProductInfo(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
