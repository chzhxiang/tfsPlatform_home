
package com.asiainfo.tfsPlatform.miniService.accountingMgmt;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.AmCustomerDto;
import com.asiainfo.tfsPlatform.dto.AmCustomerNamesDto;
import com.asiainfo.tfsPlatform.mapper.TfFCustomerPoMapper;
import com.asiainfo.tfsPlatform.po.TfFCustomerPo;
import com.google.common.collect.Lists;

/**
 * 功能描述： 客户相关服务
 * @author BAOMZ
 * @date 2016年5月17日
 */
@Service("AMMiniAMCustomerService")
public class MiniCustomerServiceImpl {

	@Autowired
	private TfFCustomerPoMapper customerPoMapper;

	/**
	 * 功能描述：根据客户名称,客户类型，客户状态，客户标识  查询客户列表
	 * @author BAOMZ
	 * @date 2016年5月17日 下午2:56:04
	 * @param @param likeCustomerName
	 * @param @return 
	 * @return List<AmCustomerDto>
	 */
	public List<AmCustomerNamesDto> getCustomerNames(AmCustomerNamesDto likeCustomerName) {
		
		if(likeCustomerName == null) return null;
		
		TfFCustomerPo po = (TfFCustomerPo) ConversionUtil.dto2po(likeCustomerName, TfFCustomerPo.class);
		
		List<Map<String, String>> names = customerPoMapper.selectCustomerLikeNames(po);

		if (names == null || names.size() == 0) {
			return null;
		}
		List<AmCustomerNamesDto> rs = Lists.newArrayList();
		for (int i = 0, size = names.size(); i < size; i++) {
			rs.add((AmCustomerNamesDto) ConversionUtil.po2dto(names.get(i), AmCustomerNamesDto.class));
		}
		return rs;
	}

	/**
	 * 功能描述：根据客户标识查询客户信息
	 * @author BAOMZ
	 * @date 2016年5月17日 下午2:57:22
	 * @param @param custId
	 * @param @return 
	 * @return AmCustomerDto
	 */
	public AmCustomerDto getCustomerInfo(Long custId) {
		
		if (custId == null) return null;
		TfFCustomerPo po = customerPoMapper.selectByPrimaryKey(custId);
		if(po == null) return null;
		return (AmCustomerDto) ConversionUtil.po2dto(po, AmCustomerDto.class);
	}

}
