package com.neueda.todoapp.repository;

import com.neueda.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Task, Long> {

    public Task findByTask(String task);
    public List<Task> findAll();
    public Task getById(Long id);
}
