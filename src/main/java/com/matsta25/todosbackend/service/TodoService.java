package com.matsta25.todosbackend.service;

import com.matsta25.todosbackend.entity.Todo;

import java.util.List;

public interface TodoService {

    public List<Todo> findAll();

    public Todo findById(int theId);

    public void save(Todo theTodo);

    public void deleteById(int theId);
}
