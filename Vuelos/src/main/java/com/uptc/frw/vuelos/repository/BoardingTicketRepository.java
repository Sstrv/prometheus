package com.uptc.frw.vuelos.repository;

import com.uptc.frw.vuelos.model.BoardingTicket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardingTicketRepository extends JpaRepository<BoardingTicket,Long> {
}
