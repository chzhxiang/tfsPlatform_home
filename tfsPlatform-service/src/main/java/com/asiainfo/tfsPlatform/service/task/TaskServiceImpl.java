/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.asiainfo.tfsPlatform.service.task;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.asiainfo.tfsPlatform.common.util.ConversionUtil;
import com.asiainfo.tfsPlatform.dto.TaskDto;
import com.asiainfo.tfsPlatform.interfaces.task.TaskService;
import com.asiainfo.tfsPlatform.mapper.TaskDao;
import com.asiainfo.tfsPlatform.po.Task;
import com.google.common.collect.Maps;

// Spring Bean的标识.
@Service("taskService")
// 类中所有public函数都纳入事务管理的标识.
@Transactional(propagation=Propagation.REQUIRED)
public class TaskServiceImpl  implements TaskService{

	@Autowired
	private TaskDao taskDao;

	public TaskDto getTaskDto(Long id) {
		return (TaskDto) ConversionUtil.po2dto(taskDao.get(id), TaskDto.class);
	}

	public void saveTaskDto(TaskDto taskDto) {
		taskDao.save((Task)ConversionUtil.dto2po(taskDto, Task.class));
	}

	public void deleteTaskDto(Long id) {
		taskDao.delete(id);
	}

	public List<TaskDto> getAllTaskDto() {
		Map<String, Object> parameter = Maps.newHashMap();
		return ConversionUtil.poList2dtoList(taskDao.search(parameter), TaskDto.class); 
		//return (List<Task>) taskDao.findAll();
	}

	/*public Page<Task> getUserTask(Long userId, Map<String, Object> searchParams, int pageNumber, int pageSize,
			String sortType) {
		PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);
		Specification<Task> spec = buildSpecification(userId, searchParams);
		Map<String, Object> parameter = Maps.newHashMap();
		//return taskDao.search(parameter); 
		//return taskDao.findAll(spec, pageRequest);
		return null ;
	}

	*//**
	 * 创建分页请求.
	 *//*
	private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
		Sort sort = null;
		if ("auto".equals(sortType)) {
			sort = new Sort(Direction.DESC, "id");
		} else if ("title".equals(sortType)) {
			sort = new Sort(Direction.ASC, "title");
		}

		return new PageRequest(pageNumber - 1, pagzSize, sort);
	}

	*//**
	 * 创建动态查询条件组合.
	 *//*
	private Specification<Task> buildSpecification(Long userId, Map<String, Object> searchParams) {
		Map<String, SearchFilter> filters = SearchFilter.parse(searchParams);
		filters.put("user.id", new SearchFilter("user.id", Operator.EQ, userId));
		Specification<Task> spec = DynamicSpecifications.bySearchFilter(filters.values(), Task.class);
		return spec;
	}*/

	@Autowired
	public void setTaskDao(TaskDao taskDao) {
		this.taskDao = taskDao;
	}
}
