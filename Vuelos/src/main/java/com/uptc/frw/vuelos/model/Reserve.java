package com.uptc.frw.vuelos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserve {
    @Id
    @Column(name = "id_reserva")
    private long id ;
    @Column(name = "id_persona")
    private long idPerson;
    @Column(name = "cantidad")
    private int quantity;
    @Column(name = "fecha_reserva")
    private String reservesDate;
    @Column(name = "id_vuelo")
    private long idFlight;

    public Reserve() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getReservesDate() {
        return reservesDate;
    }
    public void setReservesDate(String reservesDate) {
        this.reservesDate = reservesDate;
    }
    public long getIdFlight() {
        return idFlight;
    }
    public void setIdFlight(long idFlight) {
        this.idFlight = idFlight;
    }
    @Override
    public String toString() {
        return "Reserves{" +
                "id=" + id +
                ", idPerson=" + idPerson +
                ", quantity=" + quantity +
                ", reservesDate='" + reservesDate + '\'' +
                ", idFlight=" + idFlight +
                '}';
    }
}
