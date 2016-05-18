package com.asiainfo.tfsPlatform.interfaces.business_settle;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.ext.SpOtherResultCoditionDto;
import com.asiainfo.tfsPlatform.dto.ext.SpReultPartServiceDto;

/**
* 类说明：合作商
* @author pankx
* @date 2016年5月16日 下午4:06:09
*/
public interface DetailedSettleTdPartService {
	
	/**
	 * 功能描述：清单查询服务
	 * @author pankx
	 * @date 2016年5月16日 下午5:00:14
	 * @param @param spOtherResultCoditionDto
	 * @param @return 
	 * @return List<SpReultPartServiceDto>
	 */
	public List<SpReultPartServiceDto> queryListSettle(SpOtherResultCoditionDto spOtherResultCoditionDto);
}
