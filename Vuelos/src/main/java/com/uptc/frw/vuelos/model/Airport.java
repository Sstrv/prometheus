package com.uptc.frw.vuelos.model;

public class Airport {

//    Attributes
    private long idAirport;

    private String airportName;

    private String airportLocation;

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
