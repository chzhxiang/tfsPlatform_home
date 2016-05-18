package com.asiainfo.tfsPlatform.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.asiainfo.tfsPlatform.dto.TfFUserDto;
import com.asiainfo.tfsPlatform.miniService.information.MiniUserServiceImpl;

/**
 * 类说明：
 * @author zhouzy3
 * @date 2016年5月16日 下午5:35:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/spring-config.xml"}) 
public class MiniUserServiceImplTest {
	@Autowired
	private MiniUserServiceImpl miniUserServiceImpl ;

	@Test
	public void testMoveNewToOld(){
		TfFUserDto tfFUserDto = new TfFUserDto();
		tfFUserDto.setUserId(1000L);
		miniUserServiceImpl.insertTfFUserDto(tfFUserDto);
	}
}
