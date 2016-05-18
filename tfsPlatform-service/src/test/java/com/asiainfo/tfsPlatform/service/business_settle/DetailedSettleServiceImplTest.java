package com.asiainfo.tfsPlatform.service.business_settle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.tfsPlatform.interfaces.business_settle.DetailedSettleService;

/**
* 类说明：
* @author pankx
* @date 2016年5月17日 下午1:33:43
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:*spring/spring-config.xml,"
		+ "classpath*:*META-INF/spring/*.xml,D:/pkx/project/tfsPlatform-mybatis/src/main/resource/META-INF/spring"})
public class DetailedSettleServiceImplTest {
	
	public static final String MONTH="01";
	public static final String SVC_CODE="01";
	
	 @Autowired
	 DetailedSettleService detailedSettleService;
	

	/**
	 * 功能描述：测试清单汇总
	 * @author pankx
	 * @date 2016年5月17日 下午1:36:52
	 * @param  
	 * @return void
	 */
	@Test
	public void testListSettle(){
		//ClassPathXmlApplicationContext bean = new ClassPathXmlApplicationContext("classpath*:*/dubbo-demo-customer.xml");
		//DetailedSettleService detailedSettleService =(DetailedSettleService)bean.getBean("detailedSettleService");
		detailedSettleService.listSettle(MONTH,SVC_CODE);
	} 
}
