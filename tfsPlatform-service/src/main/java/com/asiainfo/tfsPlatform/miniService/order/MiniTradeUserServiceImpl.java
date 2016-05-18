package com.asiainfo.tfsPlatform.miniService.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeUserDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeUserPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeUserPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeUserPo;

/**
 * 类说明：用户台账微服务
 * @author zhouzy3
 * @date 2016年5月17日 下午2:15:08
 */
@Service("miniTradeUserServiceImpl")
public class MiniTradeUserServiceImpl {
	@Autowired
	private TfBTradeUserPoMapper tfBTradeUserPoMapper;

	@Autowired
	private TfBTradeUserPoExtMapper tfBTradeUserPoExtMapper;
	
	/**
	 * 功能描述：根据TradeId获取用户台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午4:03:26
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeUserDto
	 */
	public TfBTradeUserDto queryTfBTradeUserDtoByTradeId(Long tradeId){
		TfBTradeUserPo tfBTradeUserPo = tfBTradeUserPoExtMapper.queryTfBTradeUserPoByTradeId(tradeId);
		return (TfBTradeUserDto) ConversionUtil.po2dto(tfBTradeUserPo, TfBTradeUserDto.class);
	}
	
	/**
	 * 功能描述：新增用户台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:24:03
	 * @param @param tfBTradeUserDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfBTradeUserDto(TfBTradeUserDto tfBTradeUserDto){
		int num = tfBTradeUserPoMapper.insertSelective((TfBTradeUserPo)ConversionUtil.dto2po(tfBTradeUserDto, TfBTradeUserPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
