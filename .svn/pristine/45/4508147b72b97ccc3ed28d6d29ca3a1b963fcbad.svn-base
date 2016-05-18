package com.asiainfo.tfsPlatform.service.business_settle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.dto.TdBPartyDto;
import com.asiainfo.tfsPlatform.dto.TdBPartyServiceDto;
import com.asiainfo.tfsPlatform.dto.ext.SpOtherResultCoditionDto;
import com.asiainfo.tfsPlatform.dto.ext.SpReultPartServiceDto;
import com.asiainfo.tfsPlatform.interfaces.business_settle.DetailedSettleTdPartService;
import com.asiainfo.tfsPlatform.miniService.business_settle.MinListSettleQueryServiceImpl;
import com.asiainfo.tfsPlatform.miniService.business_settle.MinSpStatSumServiceImpl;

/**
* 类说明：清单结算查询
* @author pankx
* @date 2016年5月16日 下午5:01:26
*/
@Service("detailedSettleTdPartService")
public class DetailedSettleTdPartServiceImpl 
 implements DetailedSettleTdPartService {
	
	private Logger logger = Logger.getLogger(DetailedSettleServiceImpl.class);
	
	@Autowired
	MinListSettleQueryServiceImpl minListSettleQueryService;
	@Autowired
    MinSpStatSumServiceImpl spStatSumService;
	
	@Override
	public List<SpReultPartServiceDto> queryListSettle(SpOtherResultCoditionDto spOtherResultCoditionDto) {
		
		List<SpReultPartServiceDto> data = new ArrayList<SpReultPartServiceDto>();
		//查询业务统计结果表中的信息
		List<Map<String,Object>> list = spStatSumService.queryListSettleInfo(spOtherResultCoditionDto.getPartyId(), 
				spOtherResultCoditionDto.getSpServiceId(), spOtherResultCoditionDto.getStartDate(), spOtherResultCoditionDto.getEndDate());
		if(list==null ||list.size()<=0){
			return null;
		}
	    
		List<TdBPartyDto> partInfo = minListSettleQueryService.getPartInfo(spOtherResultCoditionDto.getPartyId(),spOtherResultCoditionDto.getPartyName());
	    List<TdBPartyServiceDto> tdBServiceData = minListSettleQueryService.getTdBServiceData(spOtherResultCoditionDto.getSpServiceId(), spOtherResultCoditionDto.getSpServiceName());
	    SpReultPartServiceDto spReultPartServiceDto = null;
	    
	    for(Map<String,Object> map:list){
		   for(TdBPartyDto tdp:partInfo){
			  for(TdBPartyServiceDto tdps:tdBServiceData){
				  
				  logger.debug("[PARTY_ID01::]"+map.get("PARTY_ID").toString());
				  logger.debug("[PARTY_ID02::]"+tdp.getPartyId());
				  logger.debug("[PARTY_ID03::]"+tdps.getPartyId());
				  logger.debug("[SP_SERVICE_ID01::]"+ map.get("SP_SERVICE_ID").toString());
				  logger.debug("[SP_SERVICE_ID02::]"+ tdps.getSpServiceId());
				  logger.debug("[flag01]"+(map.get("PARTY_ID").toString().equals(tdp.getPartyId()) && map.get("PARTY_ID").toString().equals(tdps.getPartyId())));
				  logger.debug("[flag02::]"+map.get("SP_SERVICE_ID").toString().equals(tdps.getSpServiceId()));
				  
				  if(map.get("PARTY_ID").toString().equals(tdp.getPartyId()) 
						  && map.get("PARTY_ID").toString().equals(tdps.getPartyId())
						  && map.get("SP_SERVICE_ID").toString().equals(tdps.getSpServiceId())){
					  spReultPartServiceDto = new SpReultPartServiceDto();
					  spReultPartServiceDto.setPartId(tdp.getPartyId());
					  spReultPartServiceDto.setMonth(map.get("MONTH").toString());
					  spReultPartServiceDto.setPartyName(tdp.getPartyName());
					  spReultPartServiceDto.setSpServiceId(tdps.getSpServiceId());
					  spReultPartServiceDto.setSpServiceName(tdps.getSpName());
					  spReultPartServiceDto.setFee(map.get("FEE").toString());
					  spReultPartServiceDto.setCallNum(map.get("CALL_NUM").toString());
					  data.add(spReultPartServiceDto);
				  }
				  }
			  }
		   }
	    logger.info("[success] return data are "+data.toString());
	    return data;
	}
}

