package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Airplane;
import com.uptc.frw.vuelos.model.Seat;
import com.uptc.frw.vuelos.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private AirplaneService airplaneService;

    public List<Seat> findAllSeats(){
        return seatRepository.findAll();
    }

    public Seat getSeatById(Long id){
        return seatRepository.findById(id).orElse(null);
    }

    public Seat saveSeat(Seat seat){
        Airplane airplane = airplaneService.getAirplaneById(seat.getIdAirplane());
        return seatRepository.save(seat);
    }

    public Seat updateSeat(Seat seat){
        Seat newSeat = getSeatById(seat.getIdSeat());
        if (newSeat != null){
            newSeat.setRow(seat.getRow());
            newSeat.setColumn(seat.getColumn());
            newSeat.setDeck(seat.getDeck());
            newSeat.setAirplane(seat.getAirplane());
            return newSeat;
        } else {
            throw new RuntimeException("Registro Asiento no encontrado.");
        }
    }

    public void deleteSeat(Long id){
        seatRepository.deleteById(id);
    }
}
