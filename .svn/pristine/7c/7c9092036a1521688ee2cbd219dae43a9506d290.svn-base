package com.asiainfo.tfsPlatform.miniService.order;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.mapper.TfBTradeAccountPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradeCustomerPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradeGroupPoMapper;
import com.asiainfo.tfsPlatform.mapper.TfBTradePoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfBTradeAccountPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfBTradeAccountPo;
import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;

/**
 * 功能描述：台账账户微服务
 * @author LZY
 * @date 2016年5月16日
 */
@Service("miniTradeAccountService")
public class MiniTradeAccountServiceImpl {
	@Autowired
	private TfBTradeAccountPoMapper tfBTradeAcctPoMapper;
	@Autowired
	private TfBTradeAccountPoExtMapper tfBTradeAccountPoExtMapper;
	/**
	 * 功能描述：台账账户新增微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午3:46:43
	 * @param @param dto
	 * @return int
	 */
	public int saveTradeAccountDto(TfBTradeAccountPo po) {
	//	Object object= ConversionUtil.dto2po(dto, TfBTradeAccountPo.class);
	//	TfBTradeAccountPo po = (TfBTradeAccountPo)object;
		int mark=tfBTradeAcctPoMapper.insert(po);
		return mark;
	}
	/**
	 * 功能描述：台账账户修改微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return int
	 */
	public int updateTradeAccountDto(TfBTradeAccountPo dto) {
		Object object= ConversionUtil.dto2po(dto, TfBTradeAccountPo.class);
		TfBTradeAccountPo po = (TfBTradeAccountPo)object;
		return tfBTradeAcctPoMapper.updateByPrimaryKey(po);
	}
	/**
	 * 功能描述：台账账户查询微服务
	 * @author wangfu
	 * @date 2016年5月16日 下午7:15:08
	 * @param @param dto 
	 * @return TfBTradeCustomerPo
	 */
	public TfBTradeAccountPo selectTradeAccountDto(Long tradeId) {
		if(tradeId!=null){
			TfBTradeAccountPo	po=tfBTradeAccountPoExtMapper.selectByTradeId(tradeId);
			return  po;
		}
		return null;
	}	
		/**
		 * 功能描述：台账账户集合查询微服务
		 * @author LZY
		 * @date 2016年5月17日 下午3:11:44
		 * @param @param dto
		 * @param @return 
		 * @return List<TfBTradeAccountPo>
		 */
	public List<TfBTradeAccountPo> selectTradeAccountList(TfBTradeAccountPo dto) {
		if(dto!=null){
			List<TfBTradeAccountPo> list=	tfBTradeAccountPoExtMapper.selectTradeAccountList(dto);	
			return list;
		}
		return null;
	}

}
