package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "reserva")
public class Reserve {

    @Id
    @Column(name = "id_reserva")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;

    @Column(name = "id_persona",insertable = false,updatable = false)
    private long idPerson;
    @Column(name = "id_vuelo",insertable = false,updatable = false)
    private long idFlight;
    @Column(name = "cantidad")
    private int quantity;
    @Column(name = "fecha_reserva")
    private String reservesDate;

    @OneToMany(mappedBy = "reserve")
    private List<Passenger> passengerList;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Person person;
    @ManyToOne
    @JoinColumn(name = "id_vuelo")
    private Flight flight;


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

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Reserve{" +
                "id=" + id +
                ", idPerson=" + idPerson +
                ", quantity=" + quantity +
                ", reservesDate='" + reservesDate + '\'' +
                ", idFlight=" + idFlight +
                '}';
    }
}
