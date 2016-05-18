package com.asiainfo.tfsPlatform.miniService.order;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeGroupDto;
import com.asiainfo.tfsPlatform.mapper.TfBTradeGroupPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeGroupPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeGroupPo;

/**
 * 功能描述：台账集团微服务
 * @author LZY
 * @date 2016年5月16日
 */
@Service("miniTradeGroupService")
public class MiniTradeGroupServiceImpl {

	@Autowired
	private TfBTradeGroupPoMapper tfBTradeGroupPoMapper;
	@Autowired
	private TfBTradeGroupPoExtMapper tfBTradeGroupPoExtMapper;
	/**
	 * 功能描述：台账集团新增微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午3:46:43
	 * @param @param dto
	 */
	public int saveTradeGroupDto(TfBTradeGroupPo po) {
		int mark=tfBTradeGroupPoMapper.insert(po);
		return mark;
	}
	/**
	 * 功能描述：台账集团修改微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return int
	 */
	public int updateTradeGroupDto(TfBTradeGroupDto dto) {
		Object object= ConversionUtil.dto2po(dto, TfBTradeGroupPo.class);
		TfBTradeGroupPo po = (TfBTradeGroupPo)object;
		return tfBTradeGroupPoMapper.updateByPrimaryKey(po);
	}

	/**
	 * 功能描述：台账集团查询微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return TfBTradeGroupPo
	 */
	public TfBTradeGroupPo selectTradeGroupDto(Long tradeId) {
		if(tradeId!=null){
			TfBTradeGroupPo	po=tfBTradeGroupPoExtMapper.selectByTradeId(tradeId);
			return  po;
		}
		return null;
	}


}
