package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.Produto;

public interface IRepGalpao {

    List<Produto> listAllProdutos(long idGalpao);
    Produto findById(long id);
    
}