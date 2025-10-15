package com.uptc.frw.vuelos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aeropuerto")
public class Airport {

//    Attributes
    @Id
    @Column(name = "id_aeropuerto")
    private long idAirport;

    @Column(name = "nombre")
    private String airportName;

    @Column(name = "localidad")
    private String airportLocation;

    @Column(name = "pais")
    private String airportCountry;

//    Constructor
    public Airport() {
    }

//    Getters and Setters
    public long getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(long idAirport) {
        this.idAirport = idAirport;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportLocation() {
        return airportLocation;
    }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry;
    }

//    toString()
    @Override
    public String toString() {
        return "Airport{" +
                "idAirport=" + idAirport +
                ", airportName='" + airportName + '\'' +
                ", airportLocation='" + airportLocation + '\'' +
                ", airportCountry='" + airportCountry + '\'' +
                '}';
    }
}
