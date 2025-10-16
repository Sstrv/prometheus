package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Passenger;
import com.uptc.frw.vuelos.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public List<Passenger>getAll(){
        return passengerService.findAllPassengers();
    }
    @GetMapping("/{id}")
    public Passenger getPassenger(@PathVariable long id){
        return passengerService.getPassengerById(id);
    }

    @PutMapping
    public Passenger savePassenger(@RequestBody Passenger passenger){
        return passengerService.savePassenger(passenger);
    }

    @PutMapping
    public Passenger updatePasssenger(@RequestBody Passenger passenger){
        return passengerService.updatePassenger(passenger);
    }

    @DeleteMapping
    public void deletePassenger(@RequestParam Long id){
        passengerService.deletePassenger(id);
    }
}
