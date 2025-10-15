package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReserveRepository extends JpaRepository<Reserve,Long> {
}
