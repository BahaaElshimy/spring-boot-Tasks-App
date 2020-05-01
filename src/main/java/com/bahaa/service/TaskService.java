package com.bahaa.service;

import com.bahaa.domain.Task;

import java.util.Set;

/**
 * Created by bahaa on 01/05/20.
 */
public interface TaskService {

    Iterable<Task> list();

    void save(Task task);
}
