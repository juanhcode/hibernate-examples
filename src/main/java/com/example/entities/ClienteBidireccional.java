package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente_bidireccional")
public class ClienteBidireccional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private int edad;


    //Uno a uno (bidireccional)

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientebidireccional_id")
    private DireccionBidireccional direccion;


    public ClienteBidireccional() {

    }

    public ClienteBidireccional(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public ClienteBidireccional(Long id,String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DireccionBidireccional getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionBidireccional direccion) {
        this.direccion = direccion;
    }
}
