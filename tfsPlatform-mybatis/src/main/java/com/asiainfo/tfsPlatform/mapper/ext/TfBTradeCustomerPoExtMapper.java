package com.asiainfo.tfsPlatform.mapper.ext;

import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;
import org.apache.ibatis.annotations.Param;
/**
 * 功能描述：台账核心客户资料扩展表
 * @author wangfu
 * @date 2016年5月17日
 */
public interface TfBTradeCustomerPoExtMapper {
	/**
	 * 功能描述：台账核心客户TradeId查询
	 * @author wangfu
	 * @date 2016年5月17日 上午11:48:13
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeCustomerPo
	 */
    TfBTradeCustomerPo selectByTradeId(@Param("tradeId") Long tradeId);
}