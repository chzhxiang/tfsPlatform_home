package com.asiainfo.tfsPlatform.miniService.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.tfsPlatform.mapper.ext.TJUserImportNewPoExtMapper;
import com.asiainfo.tfsPlatform.mapper.ext.TJUserImportOldPoExtMapper;

/**
* 类说明：用户资料old中间表的微服务
* @author cuichao
* @date 2016年5月16日 下午1:10:24
*/
@Service("miniUserOldService")
public class MiniUserOldServiceImpl {
	
	@Autowired
	private TJUserImportOldPoExtMapper oldExtMapper;
	@Autowired
	private TJUserImportNewPoExtMapper newExtMapper;
	/**
	 * 功能描述：删除old表中的所有数据，将new表中的数据添加到old表
	 * @author cuichao
	 * @date 2016年5月16日 下午3:47:10
	 * @param  
	 * @return void
	 */
	public void moveNewToOld(){
		oldExtMapper.deleteAll();
		oldExtMapper.copyNewToOld();
		newExtMapper.deleteAll();
	}
}
