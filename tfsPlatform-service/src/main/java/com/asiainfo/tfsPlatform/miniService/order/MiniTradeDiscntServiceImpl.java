package com.asiainfo.tfsPlatform.miniService.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeDiscntDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeDiscntPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeDiscntPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeDiscntPo;

/**
 * 类说明：用户优惠台账微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:54:54
 */
@Service("miniTradeDiscntServiceImpl")
public class MiniTradeDiscntServiceImpl {
	@Autowired
	private TfBTradeDiscntPoMapper tfBTradeDiscntPoMapper;

	@Autowired
	private TfBTradeDiscntPoExtMapper tfBTradeDiscntPoExtMapper;
	
	/**
	 * 功能描述：根据TradeId获取用户SP增值服务台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午4:03:26
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeDiscntDto
	 */
	public TfBTradeDiscntDto queryTfBTradeDiscntDtoByTradeId(Long tradeId){
		TfBTradeDiscntPo tfBTradeDiscntPo = tfBTradeDiscntPoExtMapper.queryTfBTradeDiscntPoByTradeId(tradeId);
		return (TfBTradeDiscntDto) ConversionUtil.po2dto(tfBTradeDiscntPo, TfBTradeDiscntDto.class);
	}
	
	/**
	 * 功能描述：新增用户SP增值服务台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:16:22
	 * @param @param tfBTradeDiscntDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfBTradeDiscntDto(TfBTradeDiscntDto tfBTradeDiscntDto){
		int num = tfBTradeDiscntPoMapper.insertSelective((TfBTradeDiscntPo)ConversionUtil.dto2po(tfBTradeDiscntDto, TfBTradeDiscntPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
