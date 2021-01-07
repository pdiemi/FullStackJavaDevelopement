package com.springboot.web.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.model.Todo;


@Repository
public interface TodoDAO extends CrudRepository<Todo, Integer>{

}
