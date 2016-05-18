package com.asiainfo.tfsPlatform.interfaces.information;
/**
 * 类说明：用户订购信息归档服务接口
 * @author zhouz3
 * @date 2016年5月18日 上午10:08:24
 */
public interface PersonUserProductFloorService {

	/**
	 * 功能描述：根据tradeId对用户订购信息进行归档
	 * @author zhouz3
	 * @date 2016年5月18日 上午11:51:05
	 * @param @param tradeId
	 * @param @return 
	 * @return boolean
	 */
	public boolean archivePersonUserProductFloor(Long tradeId);
}
