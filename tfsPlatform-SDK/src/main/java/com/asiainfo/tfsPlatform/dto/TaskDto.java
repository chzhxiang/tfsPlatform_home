/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.dto;



import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class TaskDto implements Serializable {
	private Long id;
	private String title;
	private String description;
	private UserDto userDto;
	private static final long serialVersionUID = 1L;
	public TaskDto(){
		
	}
	public TaskDto(Long id){
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public UserDto getUserDto() {
		return userDto;
	}
	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
