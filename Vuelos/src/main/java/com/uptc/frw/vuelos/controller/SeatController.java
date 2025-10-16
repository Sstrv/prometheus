package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Seat;
import com.uptc.frw.vuelos.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping
    public List<Seat> getAll(){
        return seatService.findAllSeats();
    }

    @GetMapping("/{id}")
    public Seat getSeat(@PathVariable long id){
        return seatService.getSeatById(id);
    }

    @PostMapping
    private Seat saveSeat(@RequestBody Seat seat){
        return seatService.saveSeat(seat);
    }

    @PutMapping
    public Seat updateSeat(@RequestBody Seat seat){
        return seatService.updateSeat(seat);
    }

    @DeleteMapping
    public void deleteSeat(@RequestBody Long id){
        seatService.deleteSeat(id);
    }
}
