package com.uptc.frw.vuelos.model;

public class Flight{

//    Attributes
    private long idFlight;

    private long idAirplane;

    private long idDepartureAirport;

    private long idArrivalAirport;

    private String flightCode;

    private String departureDate;

    private String arrivalDate;

    private String departure;

    private String arrival;

//    Constructor
    public Flight() {
    }

//    Getters and Setters
    public long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(long idFlight) {
        this.idFlight = idFlight;
    }

    public long getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(long idAirplane) {
        this.idAirplane = idAirplane;
    }

    public long getIdDepartureAirport() {
        return idDepartureAirport;
    }

    public void setIdDepartureAirport(long idDepartureAirport) {
        this.idDepartureAirport = idDepartureAirport;
    }

    public long getIdArrivalAirport() {
        return idArrivalAirport;
    }

    public void setIdArrivalAirport(long idArrivalAirport) {
        this.idArrivalAirport = idArrivalAirport;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

//    ToString
    @Override
    public String toString() {
        return "Flight{" +
                "idFlight=" + idFlight +
                ", idAirplane=" + idAirplane +
                ", idDepartureAirport=" + idDepartureAirport +
                ", idArrivalAirport=" + idArrivalAirport +
                ", flightCode='" + flightCode + '\'' +
                ", departureDate='" + departureDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}