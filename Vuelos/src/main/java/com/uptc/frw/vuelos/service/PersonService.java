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
        return personRepository.findById(id).orElse(null);
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    public Person updatePerson(Person person){
        Person personNew=getPersonById(person.getId());
        if (personNew != null){
            personNew.setId(person.getId());
            personNew.setDni(person.getDni());
            personNew.setName(person.getName());
            personNew.setAddress(person.getAddress());
            personNew.setPhone(person.getAddress());
            savePerson(personNew);
            return personNew;
        }else{
            throw new RuntimeException("Registro no encontrado");
        }
    }
    public void deletePerson(Long id){
        personRepository.deleteById(id);
    }
}
