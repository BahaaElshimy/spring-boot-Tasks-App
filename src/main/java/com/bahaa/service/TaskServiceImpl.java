package com.bahaa.service;

import com.bahaa.domain.Task;
import com.bahaa.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by bahaa on 01/05/20.
 */
@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
      return   taskRepository.findAll();
    }

    @Override
    public void save(Task task) {
       taskRepository.save(task);
    }
}
