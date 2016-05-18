package com.asiainfo.tfsPlatform.mapper.ext;

import com.asiainfo.tfsPlatform.po.TfBTradePo;
import org.apache.ibatis.annotations.Param;
/**
 * 功能描述：台账主表扩展表
 * @author wangfu
 * @date 2016年5月16日
 */
public interface TfBTradePoExtMapper {
    /**
     * 功能描述： 台账主表根据Id查询
     * @author wangfu
     * @date 2016年5月16日 下午8:14:26
     * @param @param tradeId
     * @param @return 
     * @return TfBTradePo
     */
    TfBTradePo selectById(@Param("tradeId") Long tradeId); 
}