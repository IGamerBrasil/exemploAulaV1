package com.bcopstein.demo.Persistencias.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bcopstein.demo.Dominio.interface_repositories.IRepPedido;
import com.bcopstein.demo.Dominio.model.ItemPedido;
import com.bcopstein.demo.Dominio.model.Pedido;

@Repository
public class RepPedidosMem implements IRepPedido{

    @Override
    public List<Pedido> all() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'all'");
    }

    @Override
    public List<Pedido> pedidosPorCliente(long clienteID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pedidosPorCliente'");
    }

    @Override
    public void adicionarProd(long idPedido, ItemPedido novoItem) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarProd'");
    }

    @Override
    public void retirarProd(long idPedido, ItemPedido itemRetirado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'retirarProd'");
    }
    
}
