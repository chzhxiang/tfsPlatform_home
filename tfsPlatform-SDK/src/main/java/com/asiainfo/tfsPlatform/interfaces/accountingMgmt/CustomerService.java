package com.asiainfo.tfsPlatform.interfaces.accountingMgmt;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.AmCustomerDto;
import com.asiainfo.tfsPlatform.dto.AmCustomerNamesDto;

/**
 * 功能描述：帐务管理  - 客户相关服务
 * @author BAOMZ
 * @date 2016年5月17日
 */
public interface CustomerService {
	
	/**
	 * 功能描述：根据客户名称(模糊查询)，客户类型   0:个人客户 1:集团客户, 客户状态(默认是在网) 0:在网, 1:潜在, 查询客户列表
	 * @author BAOMZ
	 * @date 2016年5月17日 下午5:18:18
	 * @param @param likeCustomerName  
	 * @param @return  客户信息列表
	 * @return List<AmCustomerNamesDto>
	 */
	List<AmCustomerNamesDto>  getCustomerNames(AmCustomerNamesDto likeCustomerName);
	
	/**
	 * 功能描述：根据客户标识查询客户信息
	 * @author BAOMZ
	 * @date 2016年5月17日 下午5:17:31
	 * @param @param custId 客户标识
	 * @param @return  客户信息
	 * @return AmCustomerNamesDto
	 */
	AmCustomerDto getCustomerById(Long custId);
	
}
