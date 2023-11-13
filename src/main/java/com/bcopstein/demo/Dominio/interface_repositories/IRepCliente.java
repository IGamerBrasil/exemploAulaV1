package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.Cliente;

public interface IRepCliente {

    Cliente findByName(String name);
    List<Cliente> allClientes();

    void attValorMedio(Cliente cliente, double valorNovo);
    void attComprasSeisMeses(Cliente cliente, int countMeses);

}