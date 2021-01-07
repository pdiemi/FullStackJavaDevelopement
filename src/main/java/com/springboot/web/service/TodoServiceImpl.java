package com.springboot.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.web.dao.TodoDAO;
import com.springboot.web.model.Todo;


@Service
@Transactional
public class TodoServiceImpl implements TodoServiceInterface{

	@Autowired
	TodoDAO todoDao;
	
	@Override
	public List<Todo> getAllTodos(){
		List<Todo> todoList = new ArrayList<>();
		todoDao.findAll().forEach(todos->todoList.add(todos));
		return todoList;
	}
	
	@Override
	public Todo getTodoById(int id){
		return todoDao.findOne(id);
	}
	
	@Override
	public void saveOrUpdate(Todo todo) {
		todoDao.save(todo);
	}

	@Override
	public void delete(int id) {
		todoDao.delete(id);
	}
	
	@Override
	public void update(Todo todo, int id) {
		todoDao.save(todo);
	}
}
