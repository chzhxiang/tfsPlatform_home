/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.interfaces.task;

import java.util.List;

import com.asiainfo.tfsPlatform.dto.TaskDto;



public interface  TaskService {

	public TaskDto getTaskDto(Long id) ;

	public void saveTaskDto(TaskDto entity);

	public void deleteTaskDto(Long id) ;

	public List<TaskDto> getAllTaskDto() ;

/*	public Page<Task> getUserTask(Long userId, Map<String, Object> searchParams, int pageNumber, int pageSize,
			String sortType);
*/
	
}
