package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
