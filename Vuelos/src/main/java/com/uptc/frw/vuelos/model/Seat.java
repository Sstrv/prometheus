package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "asientos")
public class Seat {
    @Id
    @Column(name = "id_asiento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSeat;
    @Column(name = "fila")
    private long row;
    @Column(name = "columna")
    private String column;
    @Column(name = "planta")
    private long deck;
    @Column(name = "id_avion")
    private long idAirplane;

    public Seat() {
    }

    public long getIdSeat() {
        return idSeat;
    }

    public void setIdSeat(long idSeat) {
        this.idSeat = idSeat;
    }

    public long getRow() {
        return row;
    }

    public void setRow(long row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public long getDeck() {
        return deck;
    }

    public void setDeck(long deck) {
        this.deck = deck;
    }

    public long getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(long idAirplane) {
        this.idAirplane = idAirplane;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "idSeat=" + idSeat +
                ", row=" + row +
                ", column='" + column + '\'' +
                ", deck=" + deck +
                ", idAirplane=" + idAirplane +
                '}';
    }
}
