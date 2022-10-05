package solera.todoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import solera.todoList.entity.Task;
import solera.todoList.service.TaskService;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/tasks")
    public List<Task> getAll(){
        return taskService.getAll();
    }

    @GetMapping("tasks/{id}")
    public Optional<Task> getById(@PathVariable("id") Integer id){
        return taskService.getById(id);
    }

    @DeleteMapping("tasks/{id}/deleteById")
    public void delete(@PathVariable("id") Integer id){
        taskService.delete(id);
    }

    @PostMapping(path = {"/tasks/{id}/edit", "tasks/create"})
    public Task save(Task task){
        return taskService.save(task);
    }
}
