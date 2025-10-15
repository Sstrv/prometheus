package com.uptc.frw.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarjeta_credito")
public class CreditCard {
    @Id
    @Column(name = "id_tarjeta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "id_persona",insertable = false,updatable = false)
    private long idPerson;
    @Column(name = "procesador_de_pago")
    private String paymentProcessor;
    @Column(name = "ultimos_dos_digitos")
    private String lastTwoDigits;
    @Column(name = "mes_vigencia")
    private int monthValidity;
    @Column(name = "anio_vigencia")
    private int yearValidity;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Person person;


    public CreditCard() {
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
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
