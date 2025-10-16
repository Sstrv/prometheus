package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.BoardingTicket;
import com.uptc.frw.vuelos.service.BoardingTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boardingTicket")
public class BoardingTicketController {
    @Autowired
    private BoardingTicketService boardingTicketService;
    @GetMapping
    public List<BoardingTicket> getAll(){
        return boardingTicketService.findAllBoardingTickets();
    }
    @GetMapping("/{id}")
    public BoardingTicket getBoardingTicket(@PathVariable long id){
        return boardingTicketService.getBoardingTicketById(id);
    }

    @PostMapping
    public BoardingTicket saveBoardingTicket(@RequestBody BoardingTicket boardingTicket){
        return boardingTicketService.saveBoardingTicket(boardingTicket);
    }

    @PutMapping
    public BoardingTicket updateBoardingTicket(@RequestBody BoardingTicket boardingTicket){
        return boardingTicketService.updateBoardingTicket(boardingTicket);
    }
    @DeleteMapping
    public void deleteBoardingTicket(@RequestParam long id){
        boardingTicketService.deleteBoardingTicket(id);
    }

}
