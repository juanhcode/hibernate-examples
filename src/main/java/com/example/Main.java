package com.example;

import com.example.entities.Address;
import com.example.entities.Person;
import com.example.services.AddressService;
import com.example.services.PersonService;

public class Main {

    public static void main(String[] args) {
        AddressService  addressService= new AddressService();
        PersonService  personService = new PersonService();
        Person person = new Person(1L,"Juan Sebastian",23);
        personService.createPerson(person);

        Address address = new Address(1L,"Carrera 33","Tulua");

        address.setPerson(person);
        person.setAddress(address);

        addressService.createAddress(address);

    }
}
