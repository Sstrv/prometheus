package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Passenger;
import com.uptc.frw.vuelos.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository repo;

    public List<Passenger> findAllPassengers(){
        return repo.findAll();
    }

    public Passenger getPassengerById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Passenger updatePassenger(Passenger passenger){
        Passenger newPassenger = getPassengerById(passenger.getId());
        if (newPassenger != null) {
            newPassenger.setBoardingTicket(passenger.getBoardingTicket());
            newPassenger.setReserve(passenger.getReserve());
            newPassenger.setPerson(passenger.getPerson());
            return newPassenger;
        } else {
            throw new RuntimeException("Registro Pasajero no encontrado.");
        }
    }

    public void deletePassenger(Long id){
        repo.deleteById(id);
    }
}
