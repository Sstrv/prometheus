package com.uptc.frw.vuelos.service;

import com.uptc.frw.vuelos.model.Airplane;
import com.uptc.frw.vuelos.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirplaneService {
    @Autowired
    private AirplaneRepository airplaneRepository;

    public List<Airplane> findAllAirplane (){
        return airplaneRepository.findAll();
    }
    public Airplane getAirplaneById(Long id){
        return airplaneRepository.findById(id).orElse(null);
    }
    public Airplane saveAirplane(Airplane airplane){
        return airplaneRepository.save(airplane);
    }
    public Airplane updateAirplane(Airplane airplane){
        Airplane airplaneNew = getAirplaneById(airplane.getIdAirplane());
        if (airplaneNew!= null){
            airplaneNew.setAirplaneCode(airplane.getAirplaneCode());
            airplaneNew.setAirplaneType(airplane.getAirplaneType());
            airplaneNew.setSeatsNumber(airplane.getSeatsNumber());
            return airplaneNew;
        }else {
            throw new RuntimeException("Registro No encontrado");
        }
    }
    public void deleteAirplane(Long id){
        airplaneRepository.deleteById(id);
    }
}
