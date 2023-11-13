package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.Produto;

public interface IRepGalpao {

    List<Produto> listAllProdutos();
    Produto findById(long id);
    
}