package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Airplane;
import com.uptc.frw.vuelos.service.AirplaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airplane")
public class AirplaneController {
    @Autowired
    private AirplaneService airplaneService;

    @GetMapping
    public List<Airplane> getall() {
        return airplaneService.findAllAirplane();
    }

    @GetMapping("/{id}")
    public Airplane getAirplane(@PathVariable long id) {
        return airplaneService.getAirplaneById(id);
    }

    @PostMapping
    public Airplane saveAirplane(@RequestBody Airplane airplane) {
        return airplaneService.saveAirplane(airplane);
    }

    @PutMapping
    public Airplane updateAiplane(@RequestBody Airplane airplane) {
        return airplaneService.updateAirplane(airplane);
    }

    @DeleteMapping
    public void deleteAirplane(@RequestParam Long id) {
        airplaneService.deleteAirplane(id);
    }

}

