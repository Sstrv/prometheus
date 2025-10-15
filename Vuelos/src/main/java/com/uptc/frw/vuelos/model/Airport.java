package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "aeropuerto")
public class Airport {

//    Attributes
    @Id
    @Column(name = "id_aeropuerto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAirport;

    @Column(name = "nombre")
    private String airportName;

    @Column(name = "localidad")
    private String airportLocation;

    @Column(name = "pais")
    private String airportCountry;

    @OneToMany(mappedBy = "departureAirport")
    private List<Flight> departureFlights;

    @OneToMany(mappedBy = "arrivalAirport")
    private List<Flight> arrivalFlights;

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

    public List<Flight> getDepartureFlights() {
        return departureFlights;
    }

    public void setDepartureFlights(List<Flight> departureFlights) {
        this.departureFlights = departureFlights;
    }

    public List<Flight> getArrivalFlights() {
        return arrivalFlights;
    }

    public void setArrivalFlights(List<Flight> arrivalFlights) {
        this.arrivalFlights = arrivalFlights;
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
