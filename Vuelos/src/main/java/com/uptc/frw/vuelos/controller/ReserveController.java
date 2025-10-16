package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.Reserve;
import com.uptc.frw.vuelos.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserve")
public class ReserveController {
    @Autowired
    private ReserveService reserveService;
    @GetMapping
    public List<Reserve> getAll(){
        return reserveService.findAllRepository();
    }
    @GetMapping("/{id}")
    public Reserve getReserve(@PathVariable long id){
        return reserveService.getReservesById(id);
    }
    @PostMapping
    private Reserve saveReserve(@RequestBody Reserve reserve){
        return reserveService.saveReserve(reserve);
    }
    @PutMapping
    public Reserve updateReserve(@RequestBody Reserve reserve){
        return reserveService.updatReserve(reserve);
    }
    @DeleteMapping
    public void deleteReserve(@RequestBody Long id){
        reserveService.deleteReserve(id);
    }
}
