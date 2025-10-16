package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirplaneRepository extends JpaRepository<Airplane,Long> {
}
