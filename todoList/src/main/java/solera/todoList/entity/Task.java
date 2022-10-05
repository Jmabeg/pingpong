package solera.todoList.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private LocalDate creationDate;
    private LocalDate finalizationDate;

    @ManyToOne
    private Person person;


    public Task() {
    }

    public Task(Integer id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Task(Integer id, String name, String description, LocalDate creationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Task(Integer id, String name, String description, LocalDate creationDate, LocalDate finalizationDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
    }
}
