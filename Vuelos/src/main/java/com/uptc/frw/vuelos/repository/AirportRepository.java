package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport,Long> {
}
