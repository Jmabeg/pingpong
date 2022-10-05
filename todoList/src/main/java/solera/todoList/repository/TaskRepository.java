package solera.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solera.todoList.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
