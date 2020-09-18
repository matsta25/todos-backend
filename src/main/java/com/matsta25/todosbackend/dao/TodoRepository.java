package com.matsta25.todosbackend.dao;

import com.matsta25.todosbackend.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
