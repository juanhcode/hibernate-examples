package com.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AutorLibro> libros;


    public Autor() {
    }

    public Autor(String name) {
        this.name = name;
    }

    public void setAutorLibros(List<AutorLibro> libros) {
        this.libros = libros;
    }
}
