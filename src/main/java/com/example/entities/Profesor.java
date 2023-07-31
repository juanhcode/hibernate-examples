package com.example.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "profesor")
public class Profesor {

    //Uno a muchos (desordenada) Bidireccional

    @Id
    private Integer id;
    private String name;
    private String apellido;

    @OneToMany(mappedBy = "profesor",cascade = CascadeType.ALL)
    private Set<CorreoElectronico> correosElectronicos;

    public Profesor(){

    }

    public Profesor(int id, String name, String apellido) {
        this.id = id;
        this.name = name;
        this.apellido = apellido;
    }

    public Set<CorreoElectronico> getCorreosElectronicos() {
        return correosElectronicos;
    }

    public void setCorreosElectronicos(Set<CorreoElectronico> correosElectronicos) {
        this.correosElectronicos = correosElectronicos;
    }
}
