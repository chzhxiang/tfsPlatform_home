package com.asiainfo.tfsPlatform.miniService.business_settle;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.mapper.SpSettleRuleMapper;
import com.asiainfo.tfsPlatform.mapper.SpStatOtherMapper;
import com.asiainfo.tfsPlatform.mapper.SpStatOtherResultMapper;
import com.asiainfo.tfsPlatform.po.SpStatOtherResult;

/**
* 类说明：
* @author pankx
* @date 2016年5月16日 下午12:00:30
*/
@Service
public class MinRuleAdaptationServiceImpl {

	Logger logger = Logger.getLogger(MinRuleAdaptationServiceImpl.class);
	
	@Autowired
	private SpSettleRuleMapper spSettleRuleMapper;
	@Autowired
	private SpStatOtherResultMapper spStatOtherResultMapper;
	@Autowired
	private SpStatOtherMapper  spStatOtherMapper;
	
	/**
	 * 功能描述：根据业务统计中间表和特殊结算规则表汇总数据到业务统计表中
	 * @author pankx
	 * @date 2016年5月16日 下午12:00:40
	 * @param  
	 * @return void
	 */
	@Transactional
	public void insertSpStatOtherResult(String SVC_CODE) {
		if(StringUtils.isBlank(SVC_CODE)){
			SVC_CODE=MinSpStatSumServiceImpl.SVC_CODE;
		}
		
		List<Map<String,Object>> middleData = null;
		try{
			
			SpStatOtherResult spStatOtherResult = null;
			middleData = spStatOtherMapper.getMiddleData(SVC_CODE);
			if(middleData == null || middleData.size()<=0)
			{
				logger.info("[汇总结果]数据为空，不能汇总");
				return;
			}
			
			for(Map<String,Object> data :middleData){
				//规则数据
				Map<String,Object> svcData =spSettleRuleMapper.getDataBySvcCode(data.get("SVC_CODE").toString());
				
				//根据规则将数据保存
				
				spStatOtherResult  = new SpStatOtherResult();
				String cal_num = data.get("CALL_NUM").toString();
				spStatOtherResult.setSvcCode(data.get("SVC_CODE").toString());
				spStatOtherResult.setMonth(data.get("MONTH").toString());
				spStatOtherResult.setPartyId(data.get("PARTY_ID").toString());
				spStatOtherResult.setSpServiceId(Long.valueOf(data.get("SP_SERVICE_ID").toString()));
				spStatOtherResult.setCallNum(Long.parseLong(cal_num));
				spStatOtherResult.setDealDate(new Date());
				if(data.get("RATE_OTHER")==null || 
				    StringUtils.isBlank(data.get("RATE_OTHER").toString())){
					spStatOtherResult.setCountSettle(new BigDecimal(Long.parseLong(cal_num)).multiply(new BigDecimal(svcData.get("RATE_OTHER").toString())));
				}else{
					spStatOtherResult.setCountSettle(new BigDecimal(Long.parseLong(cal_num)).multiply(new BigDecimal(data.get("RATE_OTHER").toString())));
				}
				spStatOtherResultMapper.insertSelective(spStatOtherResult);
			}
			 logger.info("[汇总结果] 数据汇总成功");
		}catch(Exception e){
			e.printStackTrace();
			 logger.info("[汇总结果] 数据汇总失败");
		}
		
	}

}
