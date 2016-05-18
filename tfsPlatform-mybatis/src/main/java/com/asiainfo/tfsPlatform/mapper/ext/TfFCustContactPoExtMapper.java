package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.po.TfFCustContactPo;

/**
* 联系人扩展
* @author zhangbt3
* @date 2016年5月13日 上午11:30:35
*/
public interface TfFCustContactPoExtMapper {

	/**
	 * 条件查询
	 * @author zhangbt3
	 * @date 2016年5月13日 下午1:10:32
	 * @param @param record
	 * @param @return 
	 * @return List<TfFCustContactPo>
	 */
	List<TfFCustContactPo> selectByMultiCondtions(TfFCustContactPo record);
}
