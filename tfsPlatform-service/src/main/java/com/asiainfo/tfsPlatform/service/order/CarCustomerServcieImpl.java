package com.asiainfo.tfsPlatform.service.order;


import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfBTradeDto;
import com.asiainfo.tfsPlatform.dto.ext.TfBTradeCustAcctDto;
import com.asiainfo.tfsPlatform.interfaces.information.CarCustomerService;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeAccountServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeCustomerServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeGroupServiceImpl;
import com.asiainfo.tfsPlatform.miniService.order.MiniTradeServiceImpl;
import com.asiainfo.tfsPlatform.po.TfBTradeAccountPo;
import com.asiainfo.tfsPlatform.po.TfBTradeCustomerPo;
import com.asiainfo.tfsPlatform.po.TfBTradeGroupPo;
import com.asiainfo.tfsPlatform.po.TfBTradePo;
import com.asiainfo.tfsPlatform.utils.Identities;


/**
 * 功能描述：车企客户台账实现类
 * @author wangfu
 * @date 2016年5月16日
 */
@Service("carCustomerService")
@Transactional(propagation=Propagation.REQUIRED)
public class CarCustomerServcieImpl implements CarCustomerService {

	@Autowired
	private MiniTradeCustomerServiceImpl miniTradeCustomerServiceImpl;
	@Autowired
	private MiniTradeAccountServiceImpl miniTradeAccountServiceImpl;
	@Autowired
	private MiniTradeGroupServiceImpl miniTradeGroupServiceImpl;
	@Autowired
	private MiniTradeServiceImpl miniTradeServiceImpl;
	/**
	 * 功能描述：
	 * @author 车企客户新增（进入台账表）
	 * @date 2016年5月16日 下午3:46:43
	 * @param @param dto
	 */
	public boolean savetfBTradeCustAcctDto(TfBTradeCustAcctDto dto) {
		//流水号生成
		Long tradeId=Identities.randomLong2();
		//订单号随机生成
		Long SubscribeId=Identities.randomLong2();
		//客户ID
		Long custId=Identities.randomLong2();
		//账户ID
		Long acctId=Identities.randomLong2();
		
		//台账主表Dto
		Date date=new Date();
		TfBTradeDto  tradeDto=new TfBTradeDto();
		tradeDto.setTradeId(tradeId);
		tradeDto.setSubscribeId(SubscribeId);
		tradeDto.setAcctId(acctId);
		tradeDto.setCustId(custId);
		tradeDto.setTradeTypeCode((short) 50);
		tradeDto.setSubscribeState("1");
		tradeDto.setNextDealTag("0");
		tradeDto.setAcceptDate(date);
		Calendar cal = Calendar.getInstance();     
		int month = cal.get(Calendar.MONTH) + 1; 
		tradeDto.setAcceptMonth((short) month);
	//	tradeDto.setTradeStaffId("1001");
		 //台账主表po
		Object object = ConversionUtil.dto2po(tradeDto, TfBTradePo.class);
		TfBTradePo tradePo = (TfBTradePo)object;
		int markTrade=miniTradeServiceImpl.saveTradeDto(tradePo);
	    
		dto.setTradeId(tradeId);
		dto.setRemoveTag("0");
		//台账客户po
		object = ConversionUtil.dto2po(dto, TfBTradeCustomerPo.class);
		TfBTradeCustomerPo custPo = (TfBTradeCustomerPo)object;
		custPo.setAcceptMonth((short) month);
		custPo.setCustId(custId);
		custPo.setCustType("1");
		custPo.setCustState("0");
		custPo.setInDate(date);
		int markTradeCustomer=miniTradeCustomerServiceImpl.saveTradeCustomerDto(custPo);
		 //台账账户po
	    object = ConversionUtil.dto2po(dto, TfBTradeAccountPo.class);
	    TfBTradeAccountPo acctPo = (TfBTradeAccountPo)object;
	    acctPo.setAcctId(acctId);
	    acctPo.setAcceptMonth((short) month);
	    acctPo.setCustId(custId);
	    acctPo.setOpenDate(date);
	    int markTradeAccount=miniTradeAccountServiceImpl.saveTradeAccountDto(acctPo);
		//台账集团po
	   // dto.setBusiLicenceValidDate(date); //页面问题时间无法传 手动模拟添加 后期改掉
	    object = ConversionUtil.dto2po(dto, TfBTradeGroupPo.class);
	    TfBTradeGroupPo groupPo=(TfBTradeGroupPo)object;
	    groupPo.setAcceptMonth((short) month);
	    groupPo.setCustId(custId);
	    groupPo.setGroupId(custId+"");
	    int markTradeGroup=miniTradeGroupServiceImpl.saveTradeGroupDto(groupPo);
	    if(markTrade>=1&&markTradeCustomer>=1&&markTradeAccount>=1&&markTradeGroup>=1){
	    	//插入序列 进行台账表入资料表
	    	
	    	return true;
	    }
	   return false;
	}
	


}
