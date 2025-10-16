package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository   extends JpaRepository<Seat,Long> {
}
