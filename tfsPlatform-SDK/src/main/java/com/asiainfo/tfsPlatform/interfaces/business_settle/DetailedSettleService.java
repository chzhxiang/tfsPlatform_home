package com.asiainfo.tfsPlatform.interfaces.business_settle;

/**
* 类说明：清单结算
* @author pankx
* @date 2016年5月13日 上午10:41:42
*/
public interface DetailedSettleService {
	
	/**
	 * 功能描述：清单结算服务
	 * @author pankx
	 * @date 2016年5月16日 下午1:20:27
	 * @param @param month
	 * @param @param CVS_CODE 
	 * @return void
	 */
	public void listSettle(String month,String CVS_CODE);
}
