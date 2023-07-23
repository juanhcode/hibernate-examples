package com.example;

import com.example.entities.ClienteBidireccional;
import com.example.entities.DireccionBidireccional;
import com.example.services.ClienteBidireccionalService;

public class Main {

    public static void main(String[] args) {
        ClienteBidireccionalService clienteBidireccionalService = new ClienteBidireccionalService();
        ClienteBidireccional clienteBidireccional1 = new ClienteBidireccional(1L,"Johana","Gomez",22);
        DireccionBidireccional direccion1 =new DireccionBidireccional(1, "Calle de la sarten", 23, "Manises", "Valencia");
        clienteBidireccional1.setDireccion(direccion1);
        direccion1.setClienteBidireccional(clienteBidireccional1);

        clienteBidireccionalService.createClienteBidireccional(clienteBidireccional1);


    }
}
