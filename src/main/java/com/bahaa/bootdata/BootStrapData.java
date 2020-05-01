package com.bahaa.bootdata;

import com.bahaa.domain.Task;
import com.bahaa.service.TaskService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by bahaa on 01/05/20.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private TaskService taskService;

    public BootStrapData(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void run(String... strings) throws Exception {
        taskService.save(new Task("help your wife" , LocalDate.now()));
        taskService.save(new Task("pray Asr" , LocalDate.now().plusDays(2)));
        taskService.save(new Task("do Iftar" , LocalDate.now().plusMonths(5)));
        taskService.save(new Task("Pray Maghrib" , LocalDate.now().plusDays(1)));
        taskService.save(new Task("study for mor 2 hours" , LocalDate.now().plusDays(3)));
        taskService.save(new Task("pray ishaa and trawih" , LocalDate.now()));
    }
}
