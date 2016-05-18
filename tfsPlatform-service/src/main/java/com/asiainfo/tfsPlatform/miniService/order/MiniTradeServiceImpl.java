package com.asiainfo.tfsPlatform.miniService.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradePoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradePoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradePo;

/**
 * 功能描述：台账主表微服务
 * @author wangfu
 * @date 2016年5月16日
 */
@Service("miniTradeService")
public class MiniTradeServiceImpl {

	@Autowired
	private TfBTradePoMapper tfBTradePoMapper;
	@Autowired
	private TfBTradePoExtMapper tfBTradePoExtMapper;
	/**
	 * 功能描述： 台账主表新增微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:13:35
	 * @param @param dto 
	 * @return void
	 */
	public int saveTradeDto(TfBTradePo po) {
		int make=tfBTradePoMapper.insert(po);
		return make;
	}
	/**
	 * 功能描述： 台账主表修改微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:13:35
	 * @param @param dto 
	 * @return void
	 */
	public int updateTradeDto(TfBTradeDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfBTradePo.class);
		TfBTradePo po = (TfBTradePo)object;
		int make=tfBTradePoMapper.updateByPrimaryKey(po);
		return make;
	}
	
	
	/**
	 * 功能描述： 台账主表查询微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:13:35
	 * @param @param dto 
	 * @return TfBTradePo
	 */
	public TfBTradePo selectTradeDto(Long TradeId) {
		if(TradeId!=null){
			TfBTradePo	po=tfBTradePoExtMapper.selectById(TradeId);
			return  po;
		}
		return null;
	}

}
