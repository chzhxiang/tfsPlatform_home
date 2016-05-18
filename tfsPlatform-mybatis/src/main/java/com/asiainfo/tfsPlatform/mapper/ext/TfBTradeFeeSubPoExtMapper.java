package com.asiainfo.tfsPlatform.mapper.ext;

import com.asiainfo.tfsPlatform.po.TfBTradeFeeSubPo;

/**
 * 类说明：费用台账Mapper接口扩展
 * @author zhouzy3
 * @date 2016年5月17日 下午1:16:15
 */
public interface TfBTradeFeeSubPoExtMapper {
	
	/**
	 * 功能描述：根据TradeId获取费用台账信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午3:37:37
	 * @param @return 
	 * @return TfBTradeFeeSubPo
	 */
	public TfBTradeFeeSubPo queryTfBTradeFeeSubPoByTradeId(Long tradeId);
}