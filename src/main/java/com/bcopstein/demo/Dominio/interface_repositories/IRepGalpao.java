package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.ItemEstoque;
public interface IRepGalpao {

    List<ItemEstoque> listAllItensEstoque(long idGalpao);
    ItemEstoque findById(long id);
    
}