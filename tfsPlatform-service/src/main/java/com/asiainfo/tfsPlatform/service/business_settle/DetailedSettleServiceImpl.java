package com.asiainfo.tfsPlatform.service.business_settle;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.interfaces.business_settle.DetailedSettleService;
import com.asiainfo.tfsPlatform.miniService.business_settle.MinRuleAdaptationServiceImpl;
import com.asiainfo.tfsPlatform.miniService.business_settle.MinSpStatSumServiceImpl;

/**
 * 功能描述：结算汇总
 * @author pankx
 * @date 2016年5月17日
 */
@Service("detailedSettleService")
public class DetailedSettleServiceImpl implements DetailedSettleService {
	
	private Logger logger = Logger.getLogger(DetailedSettleServiceImpl.class);
	
	 @Autowired
	 MinRuleAdaptationServiceImpl ruleAdaptationService;
	 @Autowired
	 MinSpStatSumServiceImpl spStatSumService;
	

	
	@Override
	@Transactional
	public void listSettle(String month, String SVC_CODE) {

		if(StringUtils.isBlank(SVC_CODE)){
			SVC_CODE=MinSpStatSumServiceImpl.SVC_CODE;
		}
		
		try{
			//清单汇总
			spStatSumService.sumDataToSpstatother(month);
			//规则适配
			ruleAdaptationService.insertSpStatOtherResult(SVC_CODE);
			logger.info("[清单结算]成功");
		}catch(Exception e){
			e.printStackTrace();
			logger.info("[清单结算] 失败");
		}
		
	}

	
	
}
