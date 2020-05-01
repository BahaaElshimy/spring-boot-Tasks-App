import { Component, OnInit } from '@angular/core';
import {TaskService} from "src/app/service/task.service";
import {Task} from "src/app/model/task.model";

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

    tasks :Task[]=[];
  constructor(private taskService:TaskService) { }

  ngOnInit(): void {

      this.taskService.list().subscribe((tasks : Task[])=>{
       this.tasks =tasks;
      } ,(error)=>alert(error));
      this.taskService.onTaskAdded.subscribe((task)=>{
        this.tasks.push(task);
      })
  }

    taskChange(event:any, task:Task){
      task.completed = event.currentTarget.checked;
      this.taskService.saveTask(task).subscribe((data)=>{});
    }

}
