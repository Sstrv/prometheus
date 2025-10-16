package com.uptc.frw.vuelos.service;


import com.uptc.frw.vuelos.model.Airport;
import com.uptc.frw.vuelos.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> findAllAirport (){
        return airportRepository.findAll();
    }
    public Airport getAirportById(Long id){
        return airportRepository.findById(id).orElse(null);
    }
    public Airport saveAirport(Airport airport){
        return airportRepository.save(airport);
    }
    public Airport updateAirport(Airport airport){
        Airport airportNew = getAirportById(airport.getIdAirport());
        if (airportNew!= null){
            airportNew.setAirportName(airport.getAirportName());
            airportNew.setAirportLocation(airport.getAirportLocation());
            airportNew.setAirportCountry(airport.getAirportCountry());
            saveAirport(airportNew);
            return airportNew;
        }else {
            throw new RuntimeException("Registro No encontrado");
        }
    }
    public void deleteAirplane(Long id){
        airportRepository.deleteById(id);
    }
}
