package com.asiainfo.tfsPlatform.modules.nosql.redis;

import java.security.SecureRandom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.asiainfo.tfsPlatform.modules.mapper.JsonMapper;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext-redis.xml" })
public class JedisClusterFactoryTest extends AbstractJUnit4SpringContextTests{
	@Autowired
	private JedisClusterFactory jedisCluster;

	@Test
	public void testJedisCluster() throws Exception {
		JsonMapper jsonMapper = new JsonMapper();
		SecureRandom random = new SecureRandom();
		int randomIndex = random.nextInt( 10000);

		final String key = new StringBuilder().append("jclustertext").append(":")
				.append(randomIndex).toString();

		Session session = new Session(key);
		session.setAttrbute("name", key);
		session.setAttrbute("seq", randomIndex);
		session.setAttrbute("address", "address:" + randomIndex);
		session.setAttrbute("tel", "tel:" + randomIndex);

	
		jedisCluster.getObject().set(session.getId(), jsonMapper.toJson(session));

		String sessionBackString = jedisCluster.getObject().get(session.getId());
		System.out.println(sessionBackString);
		
	}
}
