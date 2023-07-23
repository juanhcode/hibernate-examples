package com.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int edad;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Person(Long id, String name, int edad) {
        this.id = id;
        this.name = name;
        this.edad = edad;
    }

    public Person() {

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
