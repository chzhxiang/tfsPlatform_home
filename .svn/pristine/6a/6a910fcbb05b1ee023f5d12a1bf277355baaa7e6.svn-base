package com.asiainfo.tfsPlatform.service.information;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFOrgDto;
import com.asiainfo.tfsPlatform.interfaces.information.OrgService;
import com.asiainfo.tfsPlatform.mapper.TfFOrgPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFOrgPoExtMapper;
import com.asiainfo.tfsPlatform.miniService.information.MiniOrgServiceImpl;
import com.asiainfo.tfsPlatform.po.TfFOrgPo;

/**
* 类说明：群组管理实现类
* @author zhangbt3
* @date 2016年5月9日 下午8:34:37
*/
@Service("orgService")
@Transactional(propagation=Propagation.REQUIRED)
public class OrgServcieImpl implements OrgService {

	@Autowired
	private MiniOrgServiceImpl orgService;
	/**
	 * 功能描述：根据条件查询群组列表
	 * @param record
	 * @return
	 */
	@Override
	public List<TfFOrgDto> getOrgDtoByMultiConditions(TfFOrgDto org) {
		return orgService.getOrgDtoByMultiConditions(org);
	}

	/**
	 * 功能描述：新增群组
	 * @param org
	 */
	public void save(TfFOrgDto org) {
		orgService.save(org);
	}
	
	/**
	 * 功能描述：根据id查询群组信息
	 * @param orgId
	 * @return
	 */
	public TfFOrgDto getOrgDto(Integer orgId) {
		return orgService.getOrgDto(orgId);
	}

	/**
	 * 功能描述：修改群组
	 * @param orgDto
	 */
	public void updateOrgDto(TfFOrgDto orgDto) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 功能描述：删除群组
	 * @param orgId
	 */
	public void deleteOrgDto(Integer orgId) {
		orgService.deleteOrgDto(orgId);
	}


}
