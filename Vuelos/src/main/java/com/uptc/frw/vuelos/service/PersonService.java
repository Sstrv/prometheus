package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Person;
import com.uptc.frw.vuelos.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public List<Person> findAllPerson(){
            return personRepository.findAll();
        }
    public Person getPersonById(Long id){
        Person person=personRepository.findById(id).orElse(null);
        return person;
    }

}
