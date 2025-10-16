package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Person;
import com.uptc.frw.vuelos.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;
    @GetMapping
    public List<Person> getall(){
        return personService.findAllPerson();
    }
    @GetMapping("/{id}")
    public Person getPersona(@PathVariable long id){
        return personService.getPersonById(id);
    }
    @PostMapping
    public Person savePersona(@RequestBody Person person){
        return personService.savePerson(person);
    }
    @PostMapping("allcreate")
    public List<Person> savePersonaAllcreate(@RequestBody Person person){
        List<Person> personList=new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            personList.add(person);
        }
        return personService.saveManyPerson(personList);
    }
    @PostMapping("all")
    public List<Person> savePersonaAll(@RequestBody List<Person> person){
        return personService.saveManyPerson(person);
    }
    @PutMapping
    public Person updatePersona(@RequestBody Person person){
        return personService.updatePerson(person);
    }
    @DeleteMapping
    public void deletePersona(@RequestParam Long id){
        personService.deletePerson(id);
    }
}
