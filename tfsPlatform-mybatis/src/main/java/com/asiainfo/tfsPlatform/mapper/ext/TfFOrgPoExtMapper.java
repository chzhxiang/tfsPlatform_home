package com.asiainfo.tfsPlatform.mapper.ext;

import java.util.List;

import com.asiainfo.tfsPlatform.mapper.TfFOrgPoMapper;
import com.asiainfo.tfsPlatform.po.TfFOrgPo;

/**
* 群组扩展类
* @author Administrator
* @date 2016年5月11日 下午8:11:14
*/
public interface TfFOrgPoExtMapper{

	/**
     * 多条件查询
     * @author Administrator
     * @date 2016年5月10日 下午8:51:33
     * @param @param org
     * @param @return 
     * @return List<TfFOrg>
     */
    List<TfFOrgPo> selectByMultiCondition(TfFOrgPo org);
}
