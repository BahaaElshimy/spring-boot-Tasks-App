package com.bahaa.controller;

import com.bahaa.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bahaa.domain.Task;
/**
 * Created by bahaa on 01/05/20.
 */
@RestController
@RequestMapping("api/tasks")
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping(value = {"","/"})
    public Iterable<Task> list(){
         return taskService.list();
    }


    @PostMapping(value = "/save")
    public void save(Task task){
        this.taskService.save(task);
    }
}
