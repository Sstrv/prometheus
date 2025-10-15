package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "avion")
public class Airplane {
    @Id
    @Column(name = "id_avion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAirplane;
    @Column(name = " codigo_avion")
    private String airplaneCode;
    @Column(name = "num_plazas")
    private long seatsNumber;
    @Column(name = "tipo_de_avion")
    private String airplaneType;
    @OneToMany(mappedBy = "departureAirport")
    private List<Flight> departureFlights;
    @OneToMany(mappedBy = "airplane")
    private List<Seat> seat;

    public List<Flight> getDepartureFlights() {
        return departureFlights;
    }

    public void setDepartureFlights(List<Flight> departureFlights) {
        this.departureFlights = departureFlights;
    }

    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }

    public Airplane() {
    }

    public long getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(long idAirplane) {
        this.idAirplane = idAirplane;
    }

    public String getAirplaneCode() {
        return airplaneCode;
    }

    public void setAirplaneCode(String airplaneCode) {
        this.airplaneCode = airplaneCode;
    }

    public long getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(long seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "idAirplane=" + idAirplane +
                ", airplaneCode='" + airplaneCode + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", airplaneType='" + airplaneType + '\'' +
                '}';
    }
}
