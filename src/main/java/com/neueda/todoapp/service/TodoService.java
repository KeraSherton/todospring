package com.neueda.todoapp.service;

import com.neueda.todoapp.model.Task;
import com.neueda.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Task> getAllTasks() {
        return todoRepository.findAll();
    }

    public Task getTask(String id) {
        return todoRepository.getById(id);
    }

    public Task addTask(Task task) {
        return todoRepository.save(task);
    }

    public void deleteTask(Task task) {
        todoRepository.delete(task);
    }
}
