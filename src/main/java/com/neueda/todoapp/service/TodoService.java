package com.neueda.todoapp.service;

import com.neueda.todoapp.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

    private final List<Task> taskList = new ArrayList<>();

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList);
    }

    public Task getTask(String id) {
        for (Task task : taskList) {
            if (task.getId().equals(id)) {
                return task;
            }
//            return null;
        }
    }

    public Task addTask(String id, String task) {
        Task addedTask = new Task(id, task);
        taskList.add(addedTask);
        return addedTask;
    }

    public Task deleteTask(String id) {

    }
}
