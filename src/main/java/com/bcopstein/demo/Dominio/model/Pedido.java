package com.bcopstein.demo.Dominio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long clienteId;

    private List<ItemPedido> listaProdutos;

    public Pedido(long id, long clienteId, List<ItemPedido> listaProdutos)   {
        this.id=id;
        this.clienteId=clienteId;
        this.listaProdutos=listaProdutos;
    }

    public long getId() {
        return id;
    }

    public long getClienteId() {
        return clienteId;
    }

    public List<ItemPedido> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ItemPedido> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }   

}
