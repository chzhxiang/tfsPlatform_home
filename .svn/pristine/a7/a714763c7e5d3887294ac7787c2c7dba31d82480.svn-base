/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.service.account;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.po.User;
import com.asiainfo.tfsPlatform.service.ServiceException;
import com.asiainfo.tfsPlatform.cache.UserCache;
import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.UserDto;
import com.asiainfo.tfsPlatform.interfaces.account.AccountService;
import com.asiainfo.tfsPlatform.mapper.UserDao;
import com.asiainfo.tfsPlatform.modules.security.utils.Digests;
import com.asiainfo.tfsPlatform.utils.Clock;
import com.asiainfo.tfsPlatform.utils.Encodes;
import com.google.common.collect.Maps;

/**
 * 用户管理类.
 * 
 * @author calvin
 */
// Spring Service Bean的标识.
@Service("accountService")
@Transactional(propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;

	private static Logger logger = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserCache userCache;

	//private TaskDao taskDao;
	private Clock clock = Clock.DEFAULT;

	public List<UserDto> getAllUserDto() {
		Map<String, Object> parameter = Maps.newHashMap();
		return ConversionUtil.poList2dtoList(userDao.search(parameter), UserDto.class); 
	}

	public UserDto getUserDto(Long id) {
		UserDto userDto=userCache.getUser(id);
		if(userDto==null||userDto.getId()==null){
			userDto=(UserDto) ConversionUtil.po2dto(userDao.get(id), UserDto.class);
			userCache.save(userDto);
		}
		return userDto;
	}

	public UserDto findUserDtoByLoginName(String loginName) {
		UserDto userDto=userCache.getUserLogName(loginName);
		if(userDto==null||userDto.getId()==null){
			Map<String, Object> parameter = Maps.newHashMap();
			parameter.put("loginName", loginName);
			List<User> users=userDao.search(parameter); 
			if(users!=null&&users.size()>0)userDto= (UserDto) ConversionUtil.po2dto(users.get(0),UserDto.class);
			userCache.save(userDto);
			}
		return userDto;
	}

	public void registerUserDto(UserDto userDto) {
		entryptPassword(userDto);
		
		userDto.setRoles("user");
		userDto.setRegisterDate(clock.getCurrentDate());

		userDao.save((User)ConversionUtil.dto2po(userDto,User.class));
	}

	public void updateUserDto(UserDto userDto) {
		if (StringUtils.isNotBlank(userDto.getPlainPassword())) {
			entryptPassword(userDto);
		}
		userDao.save((User)ConversionUtil.dto2po(userDto,User.class));
	}

	public void deleteUserDto(Long id) {
		if (isSupervisor(id)) {
			//logger.warn("操作员{}尝试删除超级管理员用户", getCurrentUserName());
			throw new ServiceException("不能删除超级管理员用户");
		}
		userDao.delete(id);
		//taskDao.deleteByUserId(id);

	}

	/**
	 * 判断是否超级管理员.
	 */
	private boolean isSupervisor(Long id) {
		return id == 1;
	}

	/**
	 * 取出Shiro中的当前用户LoginName.
	 */
/*	private String getCurrentUserName() {
		ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal();
		return user.loginName;
	}*/

	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(UserDto userDto) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		userDto.setSalt(Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(userDto.getPlainPassword().getBytes(), salt, HASH_INTERATIONS);
		userDto.setPassword(Encodes.encodeHex(hashPassword));
	}

	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

/*	@Autowired
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}
*/
	public void setClock(Clock clock) {
		this.clock = clock;
	}
}
