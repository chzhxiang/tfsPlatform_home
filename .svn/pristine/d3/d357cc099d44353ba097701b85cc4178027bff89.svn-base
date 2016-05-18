package com.asiainfo.tfsPlatform.miniService.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFUserSpDto;
import com.asiainfo.tfsPlatform.mapper.TfFUserSpPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFUserSpPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFUserSpPo;

/**
 * 类说明：用户SP增值服务微服务
 * @author zhouzy3
 * @date 2016年5月16日 下午7:51:43
 */
@Service("miniUserSpServiceImpl")
public class MiniUserSpServiceImpl {
	@Autowired
	private TfFUserSpPoMapper tfFUserSpPoMapper;
	
	@Autowired
	private TfFUserSpPoExtMapper tfFUserSpPoExtMapper;
	
	/**
	 * 功能描述：根据用户SP增值服务对象获取用户SP增值服务列表信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午3:09:26
	 * @param @param tfFUserSpDto
	 * @param @return 
	 * @return List<TfFUserSpDto>
	 */
	@SuppressWarnings("unchecked")
	public List<TfFUserSpDto> queryTfFUserSpDtoList(TfFUserSpDto tfFUserSpDto){
		List<TfFUserSpPo> tfFUserSpPoList = tfFUserSpPoExtMapper.queryTfFUserSpPoList((TfFUserSpPo) ConversionUtil.dto2po(tfFUserSpDto, TfFUserSpPo.class));
		return ConversionUtil.poList2dtoList(tfFUserSpPoList, TfFUserSpDto.class);
	}
	
	/**
	 * 功能描述：新增用户SP增值服务信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:07:19
	 * @param @param tfFUserSpDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfFUserSpDto(TfFUserSpDto tfFUserSpDto){
		int num = tfFUserSpPoMapper.insertSelective((TfFUserSpPo) ConversionUtil.dto2po(tfFUserSpDto, TfFUserSpPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 功能描述：更新用户SP增值服务信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午7:07:19
	 * @param @param tfFUserSpDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean updateTfFUserSpDto(TfFUserSpDto tfFUserSpDto){
		int num = tfFUserSpPoMapper.updateByPrimaryKeySelective((TfFUserSpPo) ConversionUtil.dto2po(tfFUserSpDto, TfFUserSpPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
}
