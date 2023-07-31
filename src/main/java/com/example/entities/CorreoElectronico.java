package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "email")
public class CorreoElectronico {
    @Id
    private int idCorreo;
    private String direccionCorreo;
    @ManyToOne
    @JoinColumn(name="IdProfesor")
    private Profesor profesor;

    public CorreoElectronico() {

    }

    public CorreoElectronico(int idCorreo,String direccionCorreo,Profesor profesor) {
        this.idCorreo=idCorreo;
        this.direccionCorreo=direccionCorreo;
        this.profesor=profesor;
    }
}
