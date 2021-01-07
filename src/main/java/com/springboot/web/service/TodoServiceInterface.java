package com.springboot.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.model.Todo;

@Service
public interface TodoServiceInterface {

	public List<Todo> getAllTodos();
	public Todo getTodoById(int id);
	public void saveOrUpdate(Todo todo);
	public void delete(int id);
	public void update(Todo todo, int i);
	
}
