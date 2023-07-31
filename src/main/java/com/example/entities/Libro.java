package com.example.entities;

import jakarta.persistence.*;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;


    public Libro() {
    }

    public Libro(String titulo) {
        this.titulo = titulo;
    }
}
