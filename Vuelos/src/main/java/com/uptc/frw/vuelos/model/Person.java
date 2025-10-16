package com.uptc.frw.vuelos.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "personas")
public class Person {
    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "dni")
    private String dni;
    @Column(name = "nombre")
    private String name;
    @Column(name = "direccion")
    private String address;
    @Column(name = "telefono")
    private String phone;

    @JsonIgnore
    @OneToOne(mappedBy = "person")
    private BoardingTicket boardingTicket;
    @JsonIgnore
    @OneToOne(mappedBy = "person")
    private Passenger passenger;
    @JsonIgnore
    @OneToMany(mappedBy = "person")
    private List<Reserve> reserves;
    @JsonIgnore
    @OneToMany(mappedBy = "person")
    private List<CreditCard> creditCards;

    public BoardingTicket getBoardingTicket() {
        return boardingTicket;
    }

    public void setBoardingTicket(BoardingTicket boardingTicket) {
        this.boardingTicket = boardingTicket;
    }
    public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public List<Reserve> getReserves() {
        return reserves;
    }

    public void setReserves(List<Reserve> reserves) {
        this.reserves = reserves;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
