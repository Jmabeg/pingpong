package solera.todoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import solera.todoList.entity.Person;
import solera.todoList.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/people")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping("people/{id}")
    public Optional<Person> getById(@PathVariable("id") Integer id){
        return personService.getById(id);
    }

    @DeleteMapping("people/{id}/deleteById")
    public void delete(@PathVariable("id") Integer id){
        personService.delete(id);
    }

    @PostMapping(path = {"/people/{id}/edit", "persons/create"})
    public Person save(Person person){
        return personService.save(person);
    }
}
