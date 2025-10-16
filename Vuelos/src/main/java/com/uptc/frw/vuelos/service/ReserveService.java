package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Flight;
import com.uptc.frw.vuelos.model.Passenger;
import com.uptc.frw.vuelos.model.Person;
import com.uptc.frw.vuelos.model.Reserve;
import com.uptc.frw.vuelos.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReserveService {
    @Autowired
    private ReserveRepository reserveRepository;

    @Autowired
    private PersonService personService;
    @Autowired
    private FlightService flightService;


    public List<Reserve> findAllRepository(){
        return reserveRepository.findAll();
    }
    public Reserve getReservesById(long id){
        Reserve reserve=reserveRepository.findById(id).orElse(null);
        return reserve;
    }
    public Reserve saveReserve(Reserve reserve){
        Person person=personService.getPersonById(reserve.getIdPerson());
        Flight flight=flightService.getFlightById(reserve.getIdFlight());
        Reserve reserveNew=reserveRepository.save(reserve);
        return reserveNew;
    }
    public Reserve updatReserve(Reserve reserve){
        Reserve reserveNew=getReservesById(reserve.getId());
        if(reserveNew != null){
            reserveNew.setIdPerson(reserve.getIdPerson());
            reserveNew.setQuantity(reserve.getQuantity());
            reserveNew.setReservesDate(reserve.getReservesDate());
            reserveNew.setIdFlight(reserve.getIdFlight());
            return reserveNew;
        }else{
            throw new RuntimeException("Registro no encontrado");
        }
    }
}
