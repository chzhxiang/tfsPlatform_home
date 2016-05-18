package com.asiainfo.tfsPlatform.miniService.business_settle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TdBPartyDto;
import com.asiainfo.tfsPlatform.dto.TdBPartyServiceDto;
import com.asiainfo.tfsPlatform.mapper.TdBPartyMapper;
import com.asiainfo.tfsPlatform.mapper.TdBPartyServiceMapper;

/**
* 类说明：
* @author pankx
* @date 2016年5月16日 下午4:01:43
*/
@Service
public class MinListSettleQueryServiceImpl{

	@Autowired
	private TdBPartyMapper tdBPartyMapper;
	
	@Autowired
	private TdBPartyServiceMapper tdBPartyServiceMapper;
	
	/**
	 * 功能描述合作商ID和合作商名字查询合作商信息：
	 * @author pankx
	 * @date 2016年5月16日 下午5:39:31
	 * @param @param partId
	 * @param @param partName
	 * @param @return 
	 * @return List<TdBPartyDto>
	 */
	@SuppressWarnings("unchecked")
	public List<TdBPartyDto> getPartInfo(String partyId, String partName) {
		return ConversionUtil.poList2dtoList(tdBPartyMapper.getPartInfo(partyId, partName), TdBPartyDto.class);
	}
	
	/**
	 * 功能描述：查询服务信息根据服务ID和服务名称
	 * @author pankx
	 * @date 2016年5月16日 下午5:48:48
	 * @param @param partId
	 * @param @param SpServiceName
	 * @param @return 
	 * @return List<TdBPartyService>
	 */
	@SuppressWarnings("unchecked")
	public List<TdBPartyServiceDto>getTdBServiceData(String partId,String SpServiceName){
		 return ConversionUtil.poList2dtoList(tdBPartyServiceMapper.getTdBServiceData(partId, SpServiceName), TdBPartyServiceDto.class);
		 
	 }

}
