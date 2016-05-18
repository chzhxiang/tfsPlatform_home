package com.asiainfo.tfsPlatform.mapper.ext;

import com.asiainfo.tfsPlatform.po.TfBTradeGroupPo;
import com.asiainfo.tfsPlatform.po.TfBTradePo;

import org.apache.ibatis.annotations.Param;
/**
 * 功能描述：台账集团扩展表
 * @author wangfu
 * @date 2016年5月17日
 */
public interface TfBTradeGroupPoExtMapper {
	/**
	 * 功能描述：集团台账根据tradeId查询
	 * @author wangfu
	 * @date 2016年5月17日 上午11:26:12
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeGroupPo
	 */
	TfBTradeGroupPo selectByTradeId(@Param("tradeId") Long tradeId); 
}