package com.example;

import com.example.entities.Cliente;
import com.example.entities.Direccion;
import com.example.services.ClienteService;

public class Main {

    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();
        Direccion direccion = new Direccion(2,"Carrera",33,"Valle del cauca","Tulua");
        Cliente cliente = new Cliente(4L,"Pedro","Lopez",25);
        cliente.setDireccion(direccion);

        clienteService.createCliente(cliente);
    }
}
