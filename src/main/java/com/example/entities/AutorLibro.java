package com.example.entities;

import jakarta.persistence.*;

@Entity
public class AutorLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "libro_id")
    private Libro libro;

    public AutorLibro() {
    }

    public AutorLibro(Autor autor, Libro libro) {
        this.autor = autor;
        this.libro = libro;
    }
}
