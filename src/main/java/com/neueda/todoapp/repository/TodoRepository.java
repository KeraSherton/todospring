package com.neueda.todoapp.repository;

import com.neueda.todoapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TodoRepository extends JpaRepository<Task, String> {

//    public Task findByTask(String task);
//    public List<Task> findAll();
//    public Task getById(String id);
}
