package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_embarque")
public class BoardingTicket {
    @Id
    @Column(name = "id_embarque")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    @Column(name = "id_persona",insertable = false,updatable = false)
    private long idPerson;
    @Column(name = "id_pasajero",insertable = false,updatable = false)
    private long idPassenger;
    @Column(name = "id_vuelo")
    private long idFlight;
    @Column(name = "id_asiento ")
    private long idSeat;
    @Column(name = "fecha_de_embarque")
    private String boardingDate;
    @OneToOne
    @JoinColumn(name = "id_pasajero")
    private Passenger passenger;
    @OneToOne
    @JoinColumn(name = "id_persona")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public BoardingTicket() {
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
    public long getIdPassenger() {
        return idPassenger;
    }
    public void setIdPassenger(long idPassenger) {
        this.idPassenger = idPassenger;
    }
    public long getIdFlight() {
        return idFlight;
    }
    public void setIdFlight(long idFlight) {
        this.idFlight = idFlight;
    }
    public long getIdSeat() {
        return idSeat;
    }
    public void setIdSeat(long idSeat) {
        this.idSeat = idSeat;
    }
    public String getBoardingDate() {
        return boardingDate;
    }
    public void setBoardingDate(String boardingDate) {
        this.boardingDate = boardingDate;
    }
    @Override
    public String toString() {
        return "BoardingTicket{" +
                "id=" + id +
                ", idPerson=" + idPerson +
                ", idPassenger=" + idPassenger +
                ", idFlight=" + idFlight +
                ", idSeat=" + idSeat +
                ", boardingDate='" + boardingDate + '\'' +
                '}';
    }
}
