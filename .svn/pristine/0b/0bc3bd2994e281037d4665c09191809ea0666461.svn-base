package com.asiainfo.tfsPlatform.miniService.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeProductDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeProductPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeProductPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeProductPo;

/**
 * 类说明：产品台帐微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:59:31
 */
@Service("miniTradeProductServiceImpl")
public class MiniTradeProductServiceImpl {
	@Autowired
	private TfBTradeProductPoMapper tfBTradeProductPoMapper;

	@Autowired
	private TfBTradeProductPoExtMapper tfBTradeProductPoExtMapper;
	
	/**
	 * 功能描述：根据TradeId获取用户产品台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午4:03:26
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeProductDto
	 */
	public TfBTradeProductDto queryTfBTradeProductDtoByTradeId(Long tradeId){
		TfBTradeProductPo tfBTradeProductPo = tfBTradeProductPoExtMapper.queryTfBTradeProductPoByTradeId(tradeId);
		return (TfBTradeProductDto) ConversionUtil.po2dto(tfBTradeProductPo, TfBTradeProductDto.class);
	}
	
	/**
	 * 功能描述：新增用户产品台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:21:16
	 * @param @param tfBTradeProductDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfBTradeProductDto(TfBTradeProductDto tfBTradeProductDto){
		int num = tfBTradeProductPoMapper.insertSelective((TfBTradeProductPo)ConversionUtil.dto2po(tfBTradeProductDto, TfBTradeProductPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
