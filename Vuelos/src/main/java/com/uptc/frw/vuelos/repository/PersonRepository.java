package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
    void deleteById(long id);
}
