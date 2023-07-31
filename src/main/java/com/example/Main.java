package com.example;

import com.example.entities.*;
import com.example.services.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        /*
        ProfesorService profesorService = new ProfesorService();

        Profesor profesor = new Profesor(4, "Jose", "Perez");

        // Crear correos electrónicos y establecer la relación bidireccional
        Set<CorreoElectronico> correosElectronicos = new HashSet<>();
        correosElectronicos.add(new CorreoElectronico(9, "joseperez@example.com", profesor));
        correosElectronicos.add(new CorreoElectronico(10, "jose@gmail.com", profesor));
        correosElectronicos.add(new CorreoElectronico(11, "josepreez@universidad.edu", profesor));

        profesor.setCorreosElectronicos(correosElectronicos);

        profesorService.createProfesor(profesor);
         */

        AutorService autorService = new AutorService();
        LibroService libroService = new LibroService();
        AutorLibroService autorLibroService = new AutorLibroService();
        Autor autor = new Autor("Juan");
        autorService.createAutor(autor);


        Libro libro1 = new Libro("Narnia");
        Libro libro2 = new Libro("Cien años de soledad");
        Libro libro3 = new Libro("Siuu");
        libroService.createLibro(libro1);
        libroService.createLibro(libro2);
        libroService.createLibro(libro3);



        AutorLibro autorLibro1 = new AutorLibro(autor, libro1);
        AutorLibro autorLibro2 = new AutorLibro(autor, libro2);
        AutorLibro autorLibro3 = new AutorLibro(autor, libro3);
        autorLibroService.createAutorLibro(autorLibro1);
        autorLibroService.createAutorLibro(autorLibro2);
        autorLibroService.createAutorLibro(autorLibro3);


        List<AutorLibro> autorLibros = new ArrayList<>();
        autorLibros.add(autorLibro1);
        autorLibros.add(autorLibro2);
        autorLibros.add(autorLibro3);

        autor.setAutorLibros(autorLibros);

        autorService.updateAutor(autor);



    }
}
