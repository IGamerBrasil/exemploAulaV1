package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.Pedido;
import com.bcopstein.demo.Dominio.model.ItemPedido;

public interface IRepPedido {

    List<Pedido> all();
    List<Pedido> pedidosPorCliente(long clienteID);

    void adicionarProd(long idPedido, ItemPedido novoItem);   
    void retirarProd(long idPedido, ItemPedido itemRetirado);   

}