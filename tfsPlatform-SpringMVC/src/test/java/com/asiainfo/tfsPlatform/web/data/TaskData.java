/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.web.data;

import com.asiainfo.tfsPlatform.dto.TaskDto;
import com.asiainfo.tfsPlatform.dto.UserDto;
import com.asiainfo.tfsPlatform.modules.test.data.RandomData;

/**
 * Task相关实体测试数据生成.
 * 
 * @author calvin
 */
public class TaskData {

	public static TaskDto randomTask() {
		TaskDto task = new TaskDto();
		task.setTitle(randomTitle());
		UserDto user = new UserDto(1L);
		task.setUserDto(user);
		return task;
	}

	public static String randomTitle() {
		return RandomData.randomName("Task");
	}
}
