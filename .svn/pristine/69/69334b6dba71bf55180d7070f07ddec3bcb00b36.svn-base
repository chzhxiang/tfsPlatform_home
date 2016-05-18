package com.asiainfo.tfsPlatform.miniService.information;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TfFUserDto;
import com.asiainfo.tfsPlatform.mapper.TfFUserPoMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TfFUserPoExtMapper;
import com.asiainfo.tfsPlatform.po.TfFUserPo;

/**
 * 类说明：用户的微服务
 * @author zhouzy3
 * @date 2016年5月16日 上午11:58:36
 */
@Service("miniUserServiceImpl")
public class MiniUserServiceImpl {
	
	@Autowired
	private TfFUserPoMapper tfFUserPoMapper;
	
	@Autowired
	private TfFUserPoExtMapper tfFUserPoExtMapper;

	/**
	 * 功能描述：新增用户信息
	 * @author zhouzy3
	 * @date 2016年5月16日 下午6:30:00
	 * @param @param tfFUserDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean insertTfFUserDto(TfFUserDto tfFUserDto) {
		int num = tfFUserPoMapper.insert((TfFUserPo) ConversionUtil.dto2po(tfFUserDto, TfFUserPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * 功能描述：根据用户Id获取用户信息
	 * @author zhouzy3
	 * @date 2016年5月16日 上午11:58:59
	 * @param @param tfFUserDto
	 * @param @return
	 */
	public TfFUserDto queryTfFUserDto(TfFUserDto tfFUserDto) {
		TfFUserPo tfFUserPo = tfFUserPoMapper.selectByPrimaryKey(tfFUserDto.getUserId());
		return (TfFUserDto) ConversionUtil.po2dto(tfFUserPo, TfFUserDto.class);
	}

	/**
	 * 功能描述：根据用户对象获取用户列表信息
	 * @author zhouzy3
	 * @date 2016年5月16日 上午11:59:16
	 * @param @param tfFUserDto
	 * @param @return
	 */
	@SuppressWarnings("unchecked")
	public List<TfFUserDto> queryTfFUserDtoList(TfFUserDto tfFUserDto) {
		List<TfFUserPo> tfFUserPoList = tfFUserPoExtMapper.queryTfFUserPoList((TfFUserPo) ConversionUtil.dto2po(tfFUserDto, TfFUserPo.class));
		return ConversionUtil.poList2dtoList(tfFUserPoList, TfFUserDto.class);
	}
	
	/**
	 * 功能描述：更新用户信息
	 * @author zhouzy3
	 * @date 2016年5月16日 下午6:30:00
	 * @param @param tfFUserDto
	 * @param @return 
	 * @return boolean
	 */
	public boolean updateTfFUserDto(TfFUserDto tfFUserDto) {
		int num = tfFUserPoMapper.updateByPrimaryKeySelective((TfFUserPo) ConversionUtil.dto2po(tfFUserDto, TfFUserPo.class));
		if(num > 0){
			return true;
		}else{
			return false;
		}
	}

}
