package com.uptc.frw.vuelos.model;

public class BoardingTicket {
    private long id ;
    private long idPerson;
    private long idPassenger;
    private long idFlight;
    private long idSeat;
    private String boardingDate;

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
