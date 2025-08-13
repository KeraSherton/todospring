package com.neueda.todoapp.controller;

import com.neueda.todoapp.model.Task;
import com.neueda.todoapp.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/todo")
public class TodoController {

@Autowired
    private TodoService todoService;

@GetMapping("/")
    public List<Task> getAllTask(){
    return todoService.getAllTasks();
}
@GetMapping
    public Task getTask(@PathVariable String id) {
    return todoService.getTask(id);
}
@PostMapping
    public Task addTask(@RequestBody Task task){
    return todoService.addTask(task);
}
@DeleteMapping("/{id}")
    public void delete(@PathVariable Task task) {
    todoService.deleteTask(task);
}
}
