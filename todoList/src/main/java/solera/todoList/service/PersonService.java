package solera.todoList.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import solera.todoList.entity.Person;
import solera.todoList.repository.PersonRepository;

import java.util.List;
import java.util.Optional;


@Service
public class PersonService {
    @Autowired
    private final PersonRepository personRepository;
    protected PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getAll(){
        return personRepository.findAll();
    }


    public Optional<Person> getById(Integer id){
        return personRepository.findById(id);
    }


    public void delete(Integer id){
        personRepository.deleteById(id);
    }


    public Person save(Person person){
        return personRepository.save(person);
    }
}
