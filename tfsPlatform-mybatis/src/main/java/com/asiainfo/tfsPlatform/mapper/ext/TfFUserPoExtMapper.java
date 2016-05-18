package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.po.TfFUserPo;

/**
 * 类说明：用户Mapper接口扩展
 * @author zhouzy3
 * @date 2016年5月17日 下午1:16:15
 */
public interface TfFUserPoExtMapper {
	
	/**
	 * 功能描述：根据用户对象获取用户列表信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午2:24:02
	 * @param @param tfFUserPo
	 * @param @return 
	 * @return List<TfFUserPo>
	 */
	public List<TfFUserPo> queryTfFUserPoList(TfFUserPo tfFUserPo);
}