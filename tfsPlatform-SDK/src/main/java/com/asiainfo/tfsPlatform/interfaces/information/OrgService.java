package com.asiainfo.tfsPlatform.interfaces.information;

import java.util.List;
import java.util.Map;

import com.asiainfo.tfsPlatform.dto.TfFOrgDto;

/**
* 类说明：群组管理类
* @author zhangbt3
* @date 2016年5月9日 下午8:27:03
*/
public interface OrgService {

	/**
	 * 功能描述：条件查询群组
	 * @author zhangbt3
	 * @date 2016年5月16日 上午11:55:55
	 * @param @param org
	 * @param @return 
	 * @return List<TfFOrgDto>
	 */
	public List<TfFOrgDto> getOrgDtoByMultiConditions(TfFOrgDto org);
	
	/**
	 * 功能描述：新增群组
	 * @author zhangbt3
	 * @date 2016年5月16日 上午11:55:52
	 * @param @param org 
	 * @return void
	 */
	public void save(TfFOrgDto org);

	/**
	 * 功能描述：根据id查询群组
	 * @author zhangbt3
	 * @date 2016年5月10日 下午3:56:02
	 * @param @param orgId
	 * @param @return 
	 * @return Object
	 */
	public TfFOrgDto getOrgDto(Integer orgId);

	/**
	 * 功能描述：修改群组
	 * @author zhangbt3
	 * @date 2016年5月16日 上午11:55:43
	 * @param @param orgDto 
	 * @return void
	 */
	public void updateOrgDto(TfFOrgDto orgDto);
	
	/**
	 * 功能描述：删除群组
	 * @author zhangbt3
	 * @date 2016年5月16日 上午11:55:46
	 * @param @param orgId 
	 * @return void
	 */
	public void deleteOrgDto(Integer orgId);

}
