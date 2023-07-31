package com.example;

import com.example.entities.Address;
import com.example.entities.CorreoElectronico;
import com.example.entities.Person;
import com.example.entities.Profesor;
import com.example.services.AddressService;
import com.example.services.PersonService;
import com.example.services.ProfesorService;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        ProfesorService profesorService = new ProfesorService();

        Profesor profesor = new Profesor(4, "Jose", "Perez");

        // Crear correos electrónicos y establecer la relación bidireccional
        Set<CorreoElectronico> correosElectronicos = new HashSet<>();
        correosElectronicos.add(new CorreoElectronico(9, "joseperez@example.com", profesor));
        correosElectronicos.add(new CorreoElectronico(10, "jose@gmail.com", profesor));
        correosElectronicos.add(new CorreoElectronico(11, "josepreez@universidad.edu", profesor));

        profesor.setCorreosElectronicos(correosElectronicos);

        profesorService.createProfesor(profesor);

    }
}
