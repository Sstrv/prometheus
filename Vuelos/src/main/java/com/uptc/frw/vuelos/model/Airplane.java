package com.uptc.frw.vuelos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "avion")
public class Airplane {
    @Id
    @Column(name = "id_avion")
    private long idAirplane;
    @Column(name = " codigo_avion")
    private String airplaneCode;
    @Column(name = "num_plazas")
    private long seatsNumber;
    @Column(name = "tipo_de_avion")
    private String airplaneType;

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
