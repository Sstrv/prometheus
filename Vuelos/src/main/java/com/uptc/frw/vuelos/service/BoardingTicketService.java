package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.BoardingTicket;
import com.uptc.frw.vuelos.model.Flight;
import com.uptc.frw.vuelos.model.Seat;
import com.uptc.frw.vuelos.repository.BoardingTicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardingTicketService {

    @Autowired
    private BoardingTicketRepository repo;
    @Autowired
    private FlightService flightService;
    @Autowired
    private SeatService seatService;

    public List<BoardingTicket> findAllBoardingTickets(){
        return repo.findAll();
    }

    public BoardingTicket getBoardingTicketById(Long id){
        return repo.findById(id).orElse(null);
    }

    public BoardingTicket saveBoardingTicket(BoardingTicket bt){
        Flight flight = flightService.getFlightById(bt.getIdFlight());
        Seat seat = seatService.getSeatById(bt.getIdSeat());
        return repo.save(bt);
    }

    public BoardingTicket updateBoardingTicket(BoardingTicket bt){
        BoardingTicket newBt = getBoardingTicketById(bt.getId());
        if (newBt != null) {
            newBt.setPerson(bt.getPerson());
            newBt.setPassenger(bt.getPassenger());
            newBt.setBoardingDate(bt.getBoardingDate());
            newBt.setFlight(bt.getFlight());
            newBt.setSeat(bt.getSeat());
            return newBt;
        } else {
            throw new RuntimeException("Registro Tarjeta de Embarque no encontrado.");
        }
    }

    public void deleteBoardingTicket(Long id){
        repo.deleteById(id);
    }
}
