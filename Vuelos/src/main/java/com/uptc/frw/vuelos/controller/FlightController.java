package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Flight;
import com.uptc.frw.vuelos.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAll(){
        return flightService.findAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable long id){
        return flightService.getFlightById(id);
    }

    @PostMapping
    private Flight saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    @PutMapping
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @DeleteMapping
    public void deleteFlight(@RequestBody Long id){
        flightService.deleteFlight(id);
    }
}
