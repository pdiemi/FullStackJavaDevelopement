package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.dao.TodoDAO;
import com.springboot.web.model.Todo;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    private static int todoCount = 3;
    
    @Autowired
    private TodoDAO todoDao;

    static {
        todos.add(new Todo(1, "Asreet", "Learn Spring MVC", new Date(),
                false));
        todos.add(new Todo(2, "Asreet", "Learn Struts", new Date(), false));
        todos.add(new Todo(3, "Asreet", "Learn Hibernate", new Date(),
                false));
    }

    public List<Todo> retrieveTodos(String user) {
    	todos = (List<Todo>) todoDao.findAll();
    	List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equalsIgnoreCase(user)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
    
    public Todo retrieveTodo(int id) {
        /*
    	for (Todo todo : todos) {
            if (todo.getId()==id) {
                return todo;
            }
        }
        return null;
        */
    	return todoDao.findOne(id);
    }

    public void updateTodo(Todo todo){
    	/*	
    	todos.remove(todo);
    	todos.add(todo);
    	*/
    	todoDao.delete(todo);
    	todoDao.save(todo);
    }

    public void addTodo(String name, String desc, Date targetDate,
            boolean isDone) {
        //todos.add(new Todo(++todoCount, name, desc, targetDate, isDone));
        todoDao.save(new Todo(++todoCount, name, desc, targetDate, isDone));
    }

    public void deleteTodo(int id) {
		/*
		 * Iterator<Todo> iterator = todos.iterator(); while (iterator.hasNext()) { Todo
		 * todo = iterator.next(); if (todo.getId() == id) { iterator.remove(); } }
		 */
    	todoDao.delete(id);
    }

	public TodoDAO getTodoDao() {
		return todoDao;
	}

	public void setTodoDao(TodoDAO todoDao) {
		this.todoDao = todoDao;
	}
}