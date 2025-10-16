package com.uptc.frw.vuelos.controller;

import com.uptc.frw.vuelos.model.CreditCard;
import com.uptc.frw.vuelos.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("creditcard")
public class CreditCardController {
    @Autowired
    private CreditCardService creditCardService;

    public List<CreditCard> getall(){
        return creditCardService.findAllCreditCard();
    }
    @GetMapping("/{id}")
    public CreditCard getCreditCard(@PathVariable long id){
        return creditCardService.getCreditCardById(id);
    }
    @PostMapping
    public CreditCard SaveCreditCard(@RequestBody CreditCard creditCard){
        return creditCardService.saveCreditCard(creditCard);
    }
    @PutMapping
    public CreditCard updateCreditCard(@RequestBody CreditCard creditCard){
        return creditCardService.updateCreditCard(creditCard);
    }
    @DeleteMapping
    public void deleteCreditCard(@RequestBody Long id){
        creditCardService.deleteCreditCard(id);
    }
}
