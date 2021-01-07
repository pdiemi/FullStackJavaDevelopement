package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.web.model.Todo;
import com.springboot.web.service.TodoServiceInterface;



@Controller
@RequestMapping(value="/main")
public class TodoController1 {

	@Autowired
	TodoServiceInterface service;
	
	@GetMapping("/list")
	public ModelAndView listTodos() {
		ModelAndView mv = new ModelAndView("list-todos");
		List<Todo> todoList = service.getAllTodos();
		mv.addObject("todos", todoList);
		return mv;
	
	}
	
	@GetMapping("/add")
	public ModelAndView addTodo() {
		ModelAndView mv = new ModelAndView("list-todos");
		Todo todo = new Todo();
		mv.addObject("todo", todo);
		mv.setViewName("todo");
		return mv;
	}
	
	@PostMapping("/add")
	public ModelAndView save(@ModelAttribute("todo") Todo todo) {
		service.saveOrUpdate(todo);
		return new ModelAndView("redirect:/list-todos");
	}
	
	@DeleteMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		service.delete(id);
		return new ModelAndView("redirect:/todo/list");
		
	}
}
