package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.po.TfFUserDiscntPo;

/**
 * 类说明：用户优惠Mapper接口扩展
 * @author zhouzy3
 * @date 2016年5月17日 下午1:16:15
 */
public interface TfFUserDiscntPoExtMapper {
	
	/**
	 * 功能描述：根据用户优惠台对象获取用户优惠台列表信息
	 * @author zhouzy3
	 * @date 2016年5月17日 下午2:24:02
	 * @param @param tfFUserDiscntPo
	 * @param @return 
	 * @return List<TfFUserDiscntPo>
	 */
	public List<TfFUserDiscntPo> queryTfFUserDiscntPoList(TfFUserDiscntPo tfFUserDiscntPo);
}