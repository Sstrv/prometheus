package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {
}
