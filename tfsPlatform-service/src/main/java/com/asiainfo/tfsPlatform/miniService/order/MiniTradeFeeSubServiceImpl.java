package com.asiainfo.tfsPlatform.miniService.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeFeeSubDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeFeeSubPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeFeeSubPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeFeeSubPo;

/**
 * 类说明：费用台账微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:57:04
 */
@Service("miniTradeFeeSubServiceImpl")
public class MiniTradeFeeSubServiceImpl {
	@Autowired
	private TfBTradeFeeSubPoMapper tfBTradeFeeSubPoMapper;

	@Autowired
	private TfBTradeFeeSubPoExtMapper tfBTradeFeeSubPoExtMapper;
	
	/**
	 * 功能描述：根据TradeId获取费用台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午4:03:26
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeFeeSubDto
	 */
	public TfBTradeFeeSubDto queryTfBTradeFeeSubDtoByTradeId(Long tradeId){
		TfBTradeFeeSubPo tfBTradeFeeSubPo = tfBTradeFeeSubPoExtMapper.queryTfBTradeFeeSubPoByTradeId(tradeId);
		return (TfBTradeFeeSubDto) ConversionUtil.po2dto(tfBTradeFeeSubPo, TfBTradeFeeSubDto.class);
	}
	
	/**
	 * 功能描述：新增费用台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:19:25
	 * @param @param tfBTradeFeeSubDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfBTradeFeeSubDto(TfBTradeFeeSubDto tfBTradeFeeSubDto){
		int num = tfBTradeFeeSubPoMapper.insertSelective((TfBTradeFeeSubPo)ConversionUtil.dto2po(tfBTradeFeeSubDto, TfBTradeFeeSubPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
