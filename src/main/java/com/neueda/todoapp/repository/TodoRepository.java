package com.neueda.todoapp.repository;

import com.neueda.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Task, Long> {

//    public Task findByTask(String task);
//    public List<Task> findAll();
//    public Task getById(String id);
}
