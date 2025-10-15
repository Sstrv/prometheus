package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_credito")
public class creditCard {
    @Id
    @Column(name = "id_tarjeta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_persona")
    private long idPerson;
    @Column(name = "procesador_de_pago")
    private String paymentProcessor;
    @Column(name = "ultimos_dos_digitos")
    private String lastTwoDigits;
    @Column(name = "mes_vigencia")
    private int monthValidity;
    @Column(name = "anio_vigencia")
    private int yearValidity;

    public creditCard() {
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

    public String getPaymentProcessor() {
        return paymentProcessor;
    }

    public void setPaymentProcessor(String paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public String getLastTwoDigits() {
        return lastTwoDigits;
    }

    public void setLastTwoDigits(String lastTwoDigits) {
        this.lastTwoDigits = lastTwoDigits;
    }

    public int getMonthValidity() {
        return monthValidity;
    }

    public void setMonthValidity(int monthValidity) {
        this.monthValidity = monthValidity;
    }

    public int getYearValidity() {
        return yearValidity;
    }

    public void setYearValidity(int yearValidity) {
        this.yearValidity = yearValidity;
    }

    @Override
    public String toString() {
        return "creditCard{" +
                "id=" + id +
                ", idPerson=" + idPerson +
                ", paymentProcessor='" + paymentProcessor + '\'' +
                ", lastTwoDigits='" + lastTwoDigits + '\'' +
                ", monthValidity=" + monthValidity +
                ", yearValidity=" + yearValidity +
                '}';
    }
}
