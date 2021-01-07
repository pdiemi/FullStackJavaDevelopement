package com.springboot.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Todo;

@Repository // this is not needed
public interface TodoDAO extends JpaRepository<Todo, Integer>{
/*
 * first argument represents the type of POJO
 * second argument represents the type of ID of POJO
 * */
}
