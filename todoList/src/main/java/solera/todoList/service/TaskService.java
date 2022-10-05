package solera.todoList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import solera.todoList.entity.Task;
import solera.todoList.repository.TaskRepository;

import java.util.List;
import java.util.Optional;


@Service
public class TaskService {
    @Autowired
    private final TaskRepository taskRepository;

    protected TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public List<Task> getAll(){
        return taskRepository.findAll();
    }


    public Optional<Task> getById(Integer id){
        return taskRepository.findById(id);
    }


    public void delete(Integer id){
        taskRepository.deleteById(id);
    }


    public Task save(Task task){
        return taskRepository.save(task);
    }
}
