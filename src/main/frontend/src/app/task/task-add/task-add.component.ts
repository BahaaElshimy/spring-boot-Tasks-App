import {Component, EventEmitter, OnInit} from '@angular/core';
import {Task} from "../../model/task.model";
import {TaskService} from "../../service/task.service";

@Component({
  selector: 'app-task-add',
  templateUrl: './task-add.component.html',
  styleUrls: ['./task-add.component.css']
})
export class TaskAddComponent implements OnInit {

  taskDescription:string =null;
  constructor(private taskService:TaskService) { }

  ngOnInit(): void {
  }

   save(event:any){
      let task = new Task();
      task.completed  = false;
      task.description = event.target.value;
      task.dueDate = this.getDate();
      this.taskDescription = '';
      this.taskService.saveTask(task).subscribe(()=>{
        this.taskService.onTaskAdded.emit(task);
      });
   }

   getDate(){
     let current_datetime = new Date();
     let formatted_date = this.appendingLeadinZerors(current_datetime.getDate()) + "-" +  this.appendingLeadinZerors(current_datetime.getMonth() + 1) + "-" + current_datetime.getFullYear()
     return formatted_date;
   }

   appendingLeadinZerors(n){
     if(n> 9)
       return n;
     return "0" +n;
   }
}
