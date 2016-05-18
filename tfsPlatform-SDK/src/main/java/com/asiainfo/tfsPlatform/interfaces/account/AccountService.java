/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.interfaces.account;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.UserDto;


/**
 * 用户管理类.
 * 
 * @author calvin
 */

public interface  AccountService {

	
	public List<UserDto> getAllUserDto() ;

	public UserDto getUserDto(Long id) ;

	public UserDto findUserDtoByLoginName(String loginName);

	public void registerUserDto(UserDto user) ;

	public void updateUserDto(UserDto user);

	public void deleteUserDto(Long id) ;
	
//	public void setClock(Clock clock);
}
