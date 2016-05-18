package com.asiainfo.tfsPlatform.miniService.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFUserProductDto;
import com.asiainfo.tfsPlatform.mapper.TfFUserProductPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFUserProductPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFUserProductPo;

/**
 * 类说明：用户产品微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午5:06:36
 */
@Service("miniUserProductServiceImpl")
public class MiniUserProductServiceImpl {

	@Autowired
	private TfFUserProductPoMapper tfFUserProductPoMapper;
	
	@Autowired
	private TfFUserProductPoExtMapper tfFUserProductPoExtMapper;
	/**
	 * 功能描述：用户产品查询微服务
	 * @author zhouzy3
	 * @date 2016年5月17日 下午1:08:14
	 * @param @param tfFUserProductDto
	 * @param @return 
	 * @return List<TfFUserProductDto>
	 */
	@SuppressWarnings("unchecked")
	public List<TfFUserProductDto> queryTfFUserProductDtoList(TfFUserProductDto tfFUserProductDto){
		List<TfFUserProductPo> tfFUserProductPoList = tfFUserProductPoExtMapper.queryTfFUserProductPoList((TfFUserProductPo) ConversionUtil.dto2po(tfFUserProductDto, TfFUserProductPo.class));
		return ConversionUtil.poList2dtoList(tfFUserProductPoList, TfFUserProductPo.class);
	}
	
	/**
	 * 功能描述：用户产品新增微服务
	 * @author zhouzy3
	 * @date 2016年5月17日 下午1:09:47
	 * @param @param tfFUserProductDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfFUserProductDto(TfFUserProductDto tfFUserProductDto){
		int num = tfFUserProductPoMapper.insertSelective((TfFUserProductPo) ConversionUtil.dto2po(tfFUserProductDto, TfFUserProductPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 功能描述：更新用户产品信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午1:09:47
	 * @param @param tfFUserProductDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean updateTfFUserProductDto(TfFUserProductDto tfFUserProductDto){
		int num = tfFUserProductPoMapper.updateByPrimaryKeySelective((TfFUserProductPo) ConversionUtil.dto2po(tfFUserProductDto, TfFUserProductPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
