package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name ="pasajero")
public class Passenger {
    @Id
    @Column(name = "id_pasajero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_reserva",insertable = false,updatable = false)
    private long idReserve;
    @Column(name = "id_persona")
    private long idPerson;
    @OneToOne(mappedBy = "passenger")
    private BoardingTicket boardingTicket;
    @ManyToOne
    @JoinColumn(name = "id_reserva")
    private Reserve reserve;

    public Reserve getReserve() {
        return reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public BoardingTicket getBoardingTicket() {
        return boardingTicket;
    }

    public void setBoardingTicket(BoardingTicket boardingTicket) {
        this.boardingTicket = boardingTicket;
    }

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Person person;

    public Passenger() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getIdReserve() {
        return idReserve;
    }
    public void setIdReserve(long idReserve) {
        this.idReserve = idReserve;
    }
    public long getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", idReserve=" + idReserve +
                ", idPerson=" + idPerson +
                '}';
    }
}
