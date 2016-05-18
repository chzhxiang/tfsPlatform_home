package com.asiainfo.tfsPlatform.mapper.ext;

import com.asiainfo.tfsPlatform.po.TfBTradeUserPo;

/**
 * 类说明：用户台账Mapper接口扩展
 * @author zhouzy3
 * @date 2016年5月17日 下午1:16:15
 */
public interface TfBTradeUserPoExtMapper {
	
	/**
	 * 功能描述：根据TradeId获取用户台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午3:37:37
	 * @param @return 
	 * @return TfBTradeUserPo
	 */
	public TfBTradeUserPo queryTfBTradeUserPoByTradeId(Long tradeId);
}