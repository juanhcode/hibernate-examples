package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Direccion_bidireccional")
public class DireccionBidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String calle;
    private int numero;
    private String poblacion;
    private String provincia;

    @OneToOne
    @JoinColumn(name = "clientebidireccional_id")
    private ClienteBidireccional clienteBidireccional;

    public DireccionBidireccional(){
    }

    public DireccionBidireccional(int id, String calle, int numero, String poblacion, String provincia) {
        this.id = id;
        this.calle = calle;
        this.numero = numero;
        this.poblacion = poblacion;
        this.provincia = provincia;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public ClienteBidireccional getClienteBidireccional() {
        return clienteBidireccional;
    }

    public void setClienteBidireccional(ClienteBidireccional clienteBidireccional) {
        this.clienteBidireccional = clienteBidireccional;
    }
}
