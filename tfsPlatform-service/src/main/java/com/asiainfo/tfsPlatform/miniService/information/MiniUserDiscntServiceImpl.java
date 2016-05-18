package com.asiainfo.tfsPlatform.miniService.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFUserDiscntDto;
import com.asiainfo.tfsPlatform.mapper.TfFUserDiscntPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFUserDiscntPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFUserDiscntPo;

/**
 * 类说明：用户优惠微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:49:55
 */
@Service("miniUserDiscntServiceImpl")
public class MiniUserDiscntServiceImpl {

	@Autowired
	private TfFUserDiscntPoMapper tfFUserDiscntPoMapper;
	
	@Autowired
	private TfFUserDiscntPoExtMapper tfFUserDiscntPoExtMapper;
	
	/**
	 * 功能描述：根据用户优惠对象获取用户优惠列表信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午3:09:26
	 * @param @param tfFUserDiscntDto
	 * @param @return 
	 * @return List<TfFUserDiscntDto>
	 */
	@SuppressWarnings("unchecked")
	public List<TfFUserDiscntDto> queryTfFUserDiscntDtoList(TfFUserDiscntDto tfFUserDiscntDto){
		List<TfFUserDiscntPo> tfFUserDiscntPoList = tfFUserDiscntPoExtMapper.queryTfFUserDiscntPoList((TfFUserDiscntPo)ConversionUtil.dto2po(tfFUserDiscntDto, TfFUserDiscntPo.class));
		return ConversionUtil.poList2dtoList(tfFUserDiscntPoList, TfFUserDiscntDto.class);
	}
	
	/**
	 * 功能描述：新增用户优惠信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:03:34
	 * @param @param tfFUserDiscntDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfFUserDiscntDto(TfFUserDiscntDto tfFUserDiscntDto){
		int num = tfFUserDiscntPoMapper.insertSelective((TfFUserDiscntPo)ConversionUtil.dto2po(tfFUserDiscntDto, TfFUserDiscntPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 功能描述：更新用户优惠信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:10:21
	 * @param @param tfFUserDiscntDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean updateTfFUserDiscntDto(TfFUserDiscntDto tfFUserDiscntDto){
		int num = tfFUserDiscntPoMapper.updateByPrimaryKeySelective((TfFUserDiscntPo)ConversionUtil.dto2po(tfFUserDiscntDto, TfFUserDiscntPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
