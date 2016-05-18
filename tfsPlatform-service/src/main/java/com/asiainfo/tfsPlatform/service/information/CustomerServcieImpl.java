package com.asiainfo.tfsPlatform.service.information;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.dto.TfFAccountDto;
import com.asiainfo.tfsPlatform.dto.TfFCustGroupDto;
import com.asiainfo.tfsPlatform.dto.TfFCustomerDto;
import com.asiainfo.tfsPlatform.interfaces.information.CustomerService;
import com.asiainfo.tfsPlatform.miniService.information.MiniCustomerServcieImpl;


/**
 * 功能描述：
 * @author 客户实现类
 * @date 2016年5月12日
 */
@Service("customerService")
@Transactional(propagation=Propagation.REQUIRED)
public class CustomerServcieImpl implements CustomerService {
	@Autowired
	private MiniCustomerServcieImpl miniService;
	/**
	 * 功能描述：车企客户查询列表
	 * @author LZY
	 * @date 2016年5月12日 下午3:52:01
	 * @param @param dto
	 * @param @return
	 */
	@Override
	public List<TfFCustomerDto> selectCustomerList(TfFCustomerDto dto) {
		List<TfFCustomerDto> list=miniService.selectCustomerList(dto);
		return list;
	}
	/**
	 * 功能描述：车企客户集团查询列表
	 * @author wangfu
	 * @date 2016年5月13日 下午5:46:07
	 * @param @param dto
	 * @param @return
	 */
	@Override
	public List<TfFCustGroupDto> selectCustGroupList(TfFCustGroupDto dto) {
		return miniService.selectCustGroupList(dto);
	}
	/**
	 * 功能描述：车企客户账户查询列表
	 * @author wangfu
	 * @date 2016年5月13日 下午5:46:07
	 * @param @param dto
	 * @param @return
	 */
	@Override
	public List<TfFAccountDto> selectAccountList(TfFAccountDto dto) {
		return miniService.selectAccountList(dto);
	}


	





	



}
