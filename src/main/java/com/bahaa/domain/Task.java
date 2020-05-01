package com.bahaa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by bahaa on 01/05/20.
 */

@Entity
@Data
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dueDate;
    private Boolean completed;

    public Task(String description , LocalDate dueDate , Boolean completed){
         this.description = description;
         this.dueDate= dueDate;
         this.completed = completed;
    }
}
