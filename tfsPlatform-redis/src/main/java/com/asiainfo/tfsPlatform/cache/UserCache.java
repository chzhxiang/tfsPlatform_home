package com.asiainfo.tfsPlatform.cache;

import org.springframework.beans.factory.annotation.Autowired;

import com.asiainfo.tfsPlatform.dto.UserDto;
import com.asiainfo.tfsPlatform.modules.mapper.JsonMapper;
import com.asiainfo.tfsPlatform.modules.nosql.redis.JedisClusterFactory;

public class UserCache {
	private JsonMapper jsonMapper = new JsonMapper();
	private String keyPrefix = "ss.user:";

	@Autowired
	private JedisClusterFactory jedisCluster;
	
	public UserDto getUser(Long id) {
		final String key = new StringBuilder().append(keyPrefix).append(":").append(id).toString();
		String userStr;
		try {
			userStr = jedisCluster.getObject().get(key);
			// 再重新从Redis中取出并反序列化
			//String sessionBackString = jcluster.get(key);
			if(userStr!=null&&!userStr.isEmpty())
			return  jsonMapper.fromJson(userStr, UserDto.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public UserDto getUserLogName(String loginName) {
		final String keyLoginName = new StringBuilder().append(keyPrefix).append(":").append("LoginName:").append(loginName).toString();
		String userStr;
		try {
			userStr = jedisCluster.getObject().get(keyLoginName);
			// 再重新从Redis中取出并反序列化
			//String sessionBackString = jcluster.get(key);
			if(userStr!=null&&!userStr.isEmpty())
			return  jsonMapper.fromJson(userStr, UserDto.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public void save( UserDto user){
		final String keyid = new StringBuilder().append(keyPrefix).append(":").append(user.getId()).toString();
		final String keyLoginName = new StringBuilder().append(keyPrefix).append(":").append("LoginName:").append(user.getLoginName()).toString();

		try {
			jedisCluster.getObject().set(keyid, jsonMapper.toJson(user));
			jedisCluster.getObject().set(keyLoginName, jsonMapper.toJson(user));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
