package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Flight;
import com.uptc.frw.vuelos.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository repo;

    public List<Flight> findAllFlights(){
        return repo.findAll();
    }

    public Flight getFlightById(Long id){
        return repo.findById(id).orElse(null);
    }

    public Flight saveFlight(Flight flight){
        return repo.save(flight);
    }

    public Flight updateFlight(Flight flight){
        Flight newFlight = getFlightById(flight.getIdFlight());
        if (newFlight != null) {
            newFlight.setAirplane(flight.getAirplane());
            newFlight.setDepartureAirport(flight.getDepartureAirport());
            newFlight.setArrivalAirport(flight.getArrivalAirport());
            newFlight.setFlightCode(flight.getFlightCode());
            newFlight.setDepartureDate(flight.getDepartureDate());
            newFlight.setArrivalDate(flight.getArrivalDate());
            newFlight.setDeparture(flight.getDeparture());
            newFlight.setArrival(flight.getArrival());
            return newFlight;
        } else {
            throw new RuntimeException("Registro Vuelo no encontrado.");
        }
    }

    public void deleteFlight(Long id){
        repo.deleteById(id);
    }
}
