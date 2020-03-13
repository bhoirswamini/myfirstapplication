package io.javabrains.springbootstarter.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    //    @RequestMapping("/persons")
    @GetMapping("/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    // @RequestMapping("/persons/{id}")
    @GetMapping("/persons/{id}")
    public Person getPerson(@PathVariable("id") int id) {
        return personService.getPersonById(id);
    }


    //    @RequestMapping(method = RequestMethod.DELETE, value = "/persons/{id}")
    @DeleteMapping("/persons/{id}")
    public void deletePerson(@PathVariable("id") int id) {
        personService.delete(id);
    }

    //    @RequestMapping(method = RequestMethod.POST, value = "/persons")
    @PostMapping("/persons")
    public int savePerson(@RequestBody Person person) {
        personService.saveOrUpdate(person);
        return person.getId();
    }

}