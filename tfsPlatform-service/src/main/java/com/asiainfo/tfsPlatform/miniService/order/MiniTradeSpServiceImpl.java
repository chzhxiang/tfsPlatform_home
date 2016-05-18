package com.asiainfo.tfsPlatform.miniService.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeSpDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeSpPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeSpPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeSpPo;

/**
 * 类说明：用户SP增值服务台账微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:56:00
 */
@Service("miniTradeSpServiceImpl")
public class MiniTradeSpServiceImpl {
	@Autowired
	private TfBTradeSpPoMapper tfBTradeSpPoMapper;

	@Autowired
	private TfBTradeSpPoExtMapper tfBTradeSpPoExtMapper;
	
	/**
	 * 功能描述：根据TradeId获取用户SP增值服务台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午4:03:26
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeProductDto
	 */
	public TfBTradeSpDto queryTfBTradeSpDtoByTradeId(Long tradeId){
		TfBTradeSpPo tfBTradeSpPo = tfBTradeSpPoExtMapper.queryTfBTradeSpPoByTradeId(tradeId);
		return (TfBTradeSpDto) ConversionUtil.po2dto(tfBTradeSpPo, TfBTradeSpDto.class);
	}
	
	/**
	 * 功能描述：新增用户SP增值服务台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:22:56
	 * @param @param tfBTradeSpDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfBTradeSpDto(TfBTradeSpDto tfBTradeSpDto){
		int num = tfBTradeSpPoMapper.insertSelective((TfBTradeSpPo)ConversionUtil.dto2po(tfBTradeSpDto, TfBTradeSpPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
