package com.bahaa.repository;

import com.bahaa.domain.Task;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by bahaa on 01/05/20.
 */
public interface TaskRepository extends CrudRepository<Task, Long> {
}
