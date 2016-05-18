package com.asiainfo.tfsPlatform.miniService.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeCustomerDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeAccountPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradeCustomerPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradeGroupPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradePoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeCustomerPoExtMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeGroupPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;

/**
 * 功能描述：车企台账客户核心表微服务
 * @author LZY
 * @date 2016年5月16日
 */
@Service("miniTradeCustomerService")
public class MiniTradeCustomerServiceImpl {
	@Autowired
	private TfBTradeCustomerPoMapper tfBTradeCustomerPoMapper;
	@Autowired
	private TfBTradeCustomerPoExtMapper tfBTradeCustomerPoExtMapper;
	/**
	 * 功能描述：台账核心客户新增微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午3:46:43
	 * @param @param dto
	 * @return int
	 */
	public int saveTradeCustomerDto(TfBTradeCustomerPo po) {
	//	Object object= ConversionUtil.dto2po(dto, TfBTradeCustomerPo.class);
	//	TfBTradeCustomerPo po = (TfBTradeCustomerPo)object;
		int mark=tfBTradeCustomerPoMapper.insert(po);
		return mark;
	}
	/**
	 * 功能描述：台账核心客户修改微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return int
	 */
	public int updateTradeCustomerDto(TfBTradeCustomerDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfBTradeCustomerPo.class);
		TfBTradeCustomerPo po = (TfBTradeCustomerPo)object;
		return tfBTradeCustomerPoMapper.updateByPrimaryKey(po);
	}
	/**
	 * 功能描述：台账核心客户查询微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return TfBTradeCustomerPo
	 */
	public TfBTradeCustomerPo selectTradeGroupDto(Long tradeId) {
		if(tradeId!=null){
			TfBTradeCustomerPo	po=tfBTradeCustomerPoExtMapper.selectByTradeId(tradeId);
			return  po;
		}
		return null;
	}	



}
