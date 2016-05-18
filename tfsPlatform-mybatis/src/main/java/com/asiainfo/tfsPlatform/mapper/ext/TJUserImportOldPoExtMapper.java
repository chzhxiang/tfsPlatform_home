package com.asiainfo.tfsPlatform.mapper.ext;
/**
* 类说明：jasper导入用户资料接口
* @author cuichao
* @date 2016年5月17日 下午6:27:01
*/
public interface TJUserImportOldPoExtMapper {

	/**
	 * 功能描述：删除所有数据
	 * @author cuichao
	 * @date 2016年5月17日 下午7:22:22
	 * @param  
	 * @return void
	 */
	void deleteAll();
	/**
	 * 功能描述：拷贝新表数据到旧表
	 * @author cuichao
	 * @date 2016年5月17日 下午7:23:01
	 * @param  
	 * @return void
	 */
	void copyNewToOld();
}
