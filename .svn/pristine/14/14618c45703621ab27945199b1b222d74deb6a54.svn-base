package com.asiainfo.tfsPlatform.cache;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import static org.assertj.core.api.Assertions.*;

import com.asiainfo.tfsPlatform.dto.UserDto;
import com.asiainfo.tfsPlatform.modules.test.spring.SpringContextTestCase;
import com.asiainfo.tfsPlatform.modules.test.spring.SpringTransactionalTestCase;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-redis.xml" })
public class UserCacheTest extends SpringContextTestCase {
	@Autowired
	private UserCache userCache;
	@Test
	public void save( ) {
		UserDto user=new UserDto(1L);
		user.setLoginName("test");
		user.setName("test");
		user.setPassword("test");
		try {
			userCache.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getUser(){
		UserDto user;
		try {
			user = userCache.getUser(1L);
			assertThat(user.getName()).isEqualTo("test");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println( jsonMapper.toJson(user));
		
		//assertThat
	}


	
}
