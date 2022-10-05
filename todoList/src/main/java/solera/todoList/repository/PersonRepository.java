package solera.todoList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solera.todoList.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
