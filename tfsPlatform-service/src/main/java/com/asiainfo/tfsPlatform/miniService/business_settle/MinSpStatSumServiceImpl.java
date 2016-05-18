package com.asiainfo.tfsPlatform.miniService.business_settle;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.mapper.SpStatOtherMapper;
import com.asiainfo.tfsPlatform.mapper.SpStatOtherResultMapper;
import com.asiainfo.tfsPlatform.po.SpStatOther;

/**
* 类说明：清单汇总实现类
* @author pankx
* @date 2016年5月16日 上午11:53:08
*/
@Service
public class MinSpStatSumServiceImpl {
	
	Logger logger =Logger.getLogger(MinSpStatSumServiceImpl.class);
	public static final String SVC_CODE="01";//业务代码默认写死

	@Autowired
	private SpStatOtherMapper  spStatOtherMapper;
	
	@Autowired
	private SpStatOtherResultMapper spStatOtherResultMapper;
	
	/**
	 * 功能描述：查询SP详单表中的数据根据月份（记录数）
	 * @author pankx
	 * @date 2016年5月16日 下午1:13:41
	 * @param @param month
	 * @param @return 
	 * @return List<Map<String,Object>>
	 */
	public List<Map<String,Object>>countRecordByMonth(String month){
		return spStatOtherMapper.countRecordByMonth(month);
	}

	
	/**
	 * 功能描述：汇总清单表数据到sp_stat_other表中
	 * @author pankx
	 * @date 2016年5月13日 上午10:48:42
	 * @param  
	 * @return void
	 */
	@Transactional
	public void sumDataToSpstatother(String month) {
		//获取清单表汇总数据
		List<Map<String,Object>> spdata = null;
		try{
			 spdata =countRecordByMonth(month);
			 SpStatOther spStatOther = new SpStatOther();
				if(spdata!=null && spdata.size()>0){
					for(Map<String,Object> data:spdata){
						spStatOther.setMonth(month);
						spStatOther.setPartyId(data.get("PARTY_ID").toString());
						spStatOther.setSvcCode(SVC_CODE);
						spStatOther.setSpServiceId(Long.valueOf(data.get("SP_SERVICE_ID").toString()));
						spStatOther.setCallNum(Long.valueOf(data.get("CALL_NUM").toString()));
						spStatOther.setDealDate(new Date());
						spStatOtherMapper.insertSelective(spStatOther);
					}
				}
			 logger.info("[汇总] 数据汇总成功");
		}catch(Exception e){
			e.printStackTrace();
			logger.info("[汇总] 数据汇总失败" );
		}
	}

	
	/**
	 * 功能描述：根据条件查询业务统计结果表中的信息
	 * @author pankx
	 * @date 2016年5月16日 下午5:55:39
	 * @param @param partId
	 * @param @param spServiceId
	 * @param @param startDate
	 * @param @param endDate
	 * @param @return 
	 * @return List<Map<String,Object>>
	 */
	public List<Map<String, Object>> queryListSettleInfo(String partyId, String spServiceId, String startDate,
			String endDate) {
		return spStatOtherResultMapper.queryListSettleInfo(partyId, spServiceId, startDate, endDate);
	}

}
