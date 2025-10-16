package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Passenger;
import com.uptc.frw.vuelos.model.Person;
import com.uptc.frw.vuelos.model.Reserve;
import com.uptc.frw.vuelos.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {

    @Autowired
    private PassengerRepository repo;
    @Autowired
    private ReserveService reserveService;
    @Autowired
    private PersonService personService;

    public List<Passenger> findAllPassengers(){
        return repo.findAll();
    }

    public Passenger getPassengerById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Passenger savePassenger(Passenger passenger){
        Reserve reserve = reserveService.getReservesById(passenger.getIdReserve());
        Person person = personService.getPersonById(passenger.getIdPerson());
        return repo.save(passenger);
    }

    public Passenger updatePassenger(Passenger passenger){
        Passenger newPassenger = getPassengerById(passenger.getId());
        if (newPassenger != null) {
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
