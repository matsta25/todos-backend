package com.matsta25.todosbackend.service;

import com.matsta25.todosbackend.dao.TodoRepository;
import com.matsta25.todosbackend.entity.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return this.todoRepository.findAll();
    }

    @Override
    public Todo findById(int theId) {
        Optional<Todo> result = todoRepository.findById(theId);

        Todo theTodo = null;

        if (result.isPresent()) {
            theTodo = result.get();
        } else {
            throw new RuntimeException("Did not find todo with id - " + theId);
        }

        return theTodo;
    }

    @Override
    public void save(Todo theTodo) {
        this.todoRepository.save(theTodo);
    }

    @Override
    public void deleteById(int theId) {
        todoRepository.deleteById(theId);
    }
}
