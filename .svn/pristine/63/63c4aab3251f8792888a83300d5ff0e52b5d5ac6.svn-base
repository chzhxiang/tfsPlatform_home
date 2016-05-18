package com.asiainfo.tfsPlatform.miniService.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFOrgDto;
import com.asiainfo.tfsPlatform.mapper.TfFOrgPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFOrgPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFOrgPo;

/**
 * 群组微服务
 * @author zhangbt3
 *
 */
@Service("miniOrgService")
public class MiniOrgServiceImpl {

	@Autowired
	private TfFOrgPoMapper orgMapper;
	@Autowired
	private TfFOrgPoExtMapper orgExtMapper;

	/**
	 * 功能描述：根据条件查询群组列表
	 * @param record
	 * @return
	 */
	public List<TfFOrgDto> getOrgDtoByMultiConditions(TfFOrgDto record) {
		TfFOrgPo org = (TfFOrgPo) ConversionUtil.dto2po(record, TfFOrgPo.class);
		List<TfFOrgPo> TfFOrgList = orgExtMapper.selectByMultiCondition(org);
		List<TfFOrgDto> list = ConversionUtil.poList2dtoList(TfFOrgList, TfFOrgDto.class);
		return list;
	}
	/**
	 * 功能描述：新增群组
	 * @param org
	 */
	public void save(TfFOrgDto org) {
		try {
			TfFOrgPo dto2po = (TfFOrgPo) ConversionUtil.dto2po(org,TfFOrgPo.class);
			orgMapper.insert(dto2po);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 功能描述：根据id查询群组信息
	 * @param orgId
	 * @return
	 */
	public TfFOrgDto getOrgDto(Integer orgId) {
		TfFOrgDto orgDto=(TfFOrgDto) ConversionUtil.po2dto(orgMapper.selectByPrimaryKey(orgId), TfFOrgDto.class);
		return orgDto;
	}

	/**
	 * 功能描述：修改群组
	 * @param orgDto
	 */
	public void updateOrgDto(TfFOrgDto orgDto) {
		TfFOrgPo record = (TfFOrgPo) ConversionUtil.dto2po(orgDto, TfFOrgPo.class);
		try {
			orgMapper.updateByPrimaryKeySelective(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 功能描述：删除群组
	 * @param orgId
	 */
	public void deleteOrgDto(Integer orgId) {
		try {
			orgMapper.deleteByPrimaryKey(orgId);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
