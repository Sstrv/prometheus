package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.CreditCard;
import com.uptc.frw.vuelos.model.Person;
import com.uptc.frw.vuelos.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    private CreditCardRepository creditCardRepository;
    @Autowired
    private PersonService personService;

    public List<CreditCard> findAllCreditCard(){
        return creditCardRepository.findAll();
    }
    public CreditCard getCreditCardById(Long id){
        return creditCardRepository.findById(id).orElse(null);
    }
    public CreditCard saveCreditCard(CreditCard creditCard){
        Person person=personService.getPersonById(creditCard.getIdPerson());
        creditCard.setPerson(person);
        return creditCardRepository.save(creditCard);
    }
    public  CreditCard updateCreditCard(CreditCard creditCard){
        CreditCard creditCardNew=getCreditCardById(creditCard.getId());
        if(creditCardNew != null){
            creditCardNew.setId(creditCard.getId());
            creditCardNew.setIdPerson(creditCard.getIdPerson());
            creditCardNew.setPaymentProcessor(creditCard.getPaymentProcessor());
            creditCardNew.setLastTwoDigits(creditCardNew.getLastTwoDigits());
            creditCardNew.setMonthValidity(creditCard.getMonthValidity());
            creditCardNew.setYearValidity(creditCard.getYearValidity());
            saveCreditCard(creditCardNew);
            return creditCardNew;
        }else{
            throw new RuntimeException("Registro no encontrado");
        }
    }
    public void deleteCreditCard(Long id){
        creditCardRepository.deleteById(id);
    }
}
