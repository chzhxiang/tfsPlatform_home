package com.asiainfo.tfsPlatform.miniService.information;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFCustContactDto;
import com.asiainfo.tfsPlatform.mapper.TfFCustContactPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFCustContactPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFCustContactPo;
import com.asiainfo.tfsPlatform.service.information.CustContactServiceImpl;

/**
 * 功能描述：联系人微服务实现类
 * @author zhangbt3
 * @date 2016年5月16日
 */
@Service("miniCustContactService")
public class MiniCustContactServiceImpl {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustContactServiceImpl.class);
	@Autowired
	private TfFCustContactPoMapper custContactPoMapper;
	
	@Autowired
	private TfFCustContactPoExtMapper custContactPoExtMapper;
	
	/**
	 * 功能描述：根据Id查询联系人
	 * @param contactId
	 * @return
	 */
	public TfFCustContactDto getCustContactDto(Long contactId) {
		TfFCustContactPo custContactPo = custContactPoMapper.selectByPrimaryKey(contactId);
		return (TfFCustContactDto) ConversionUtil.po2dto(custContactPo, TfFCustContactDto.class);
	}
	
	/**
	 * 功能描述：根据条件查询联系人
	 * @param custContactDto
	 * @return
	 */
	public List<TfFCustContactDto> getCustContactDtoByMultiConditions(TfFCustContactDto custContactDto) {
		TfFCustContactPo record = (TfFCustContactPo) ConversionUtil.dto2po(custContactDto, TfFCustContactPo.class);
		List<TfFCustContactPo> poList = custContactPoExtMapper.selectByMultiCondtions(record);
		return ConversionUtil.poList2dtoList(poList, TfFCustContactDto.class);
	}

	/**
	 * 功能描述：新增联系人
	 * @param custContactDto
	 */
	public void save(TfFCustContactDto custContactDto) {
		TfFCustContactPo record = (TfFCustContactPo) ConversionUtil.dto2po(custContactDto, TfFCustContactPo.class);
		try {
			//联系人邮箱作为自服务门户登录账号，需要唯一性校验
			TfFCustContactPo model = new TfFCustContactPo();
			model.setContactEmail(record.getContactEmail());
			List<TfFCustContactPo> list = custContactPoExtMapper.selectByMultiCondtions(model);
			if(list.isEmpty()||list.size() == 0){
				record.setUpdateTime(new Date());
				int result = custContactPoMapper.insert(record);
				if(result==1){
					LOGGER.debug("新增成功！CustId = {}", custContactDto.getCustId());
				}else{
					LOGGER.debug("新增失败！ ", "邮箱已存在");
				}
			}
		} catch (Exception e) {
			LOGGER.error("新增失败！ ", e);
		}
	}

	/**
	 * 功能描述：删除联系人（联系人要求不能删除）
	 * @param custContactDto
	 */
	public void updateCustContactDto(TfFCustContactDto custContactDto) {
		TfFCustContactPo record = (TfFCustContactPo) ConversionUtil.dto2po(custContactDto, TfFCustContactPo.class);
		custContactPoMapper.updateByPrimaryKeySelective(record);
	}

	/**
	 * 功能描述：
	 * @param contactId
	 */
	public void deleteCustContactDto(Integer contactId) {
		// TODO Auto-generated method stub
		
	}
}
