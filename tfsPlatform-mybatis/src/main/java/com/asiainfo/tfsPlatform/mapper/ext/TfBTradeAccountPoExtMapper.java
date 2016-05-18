package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.asiainfo.tfsPlatform.po.TfBTradeAccountPo;
import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;
import com.asiainfo.tfsPlatform.po.TfFAccountPo;

/**
* 类说明：账户台账扩展接口
* @author cuichao
* @date 2016年5月12日 上午11:18:52
*/
public interface TfBTradeAccountPoExtMapper {

	List<TfBTradeAccountPo> findListByParam(Map<String, Object> param);
	/**
	 * 功能描述：台账账户TradeId查询
	 * @author wangfu
	 * @date 2016年5月17日 下午2:41:11
	 * @param @param tradeId
	 * @param @return 
	 * @return TfBTradeAccountPo
	 */
	TfBTradeAccountPo selectByTradeId(@Param("tradeId") Long tradeId);
	
	 /**
	  * 功能描述： 台账账户集合查询
	  * @author wangfu
	  * @date 2016年5月17日 下午2:43:35
	  * @param @param po
	  * @param @return 
	  * @return List<TfBTradeAccountPo>
	  */
    List<TfBTradeAccountPo> selectTradeAccountList(TfBTradeAccountPo po);
}
