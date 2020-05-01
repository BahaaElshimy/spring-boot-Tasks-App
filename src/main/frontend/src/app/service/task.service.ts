import {EventEmitter, Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Task} from "src/app/model/task.model";

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  onTaskAdded = new EventEmitter<Task>();

  constructor(private http: HttpClient) {
  }


  list() {
    return this.http.get("/api/tasks");
  }

  saveTask(task: any) {
    return this.http.post("/api/tasks/save", task);
  }
}
