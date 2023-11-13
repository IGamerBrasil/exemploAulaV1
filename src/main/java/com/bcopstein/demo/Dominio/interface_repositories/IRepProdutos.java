package com.bcopstein.demo.Dominio.interface_repositories;

import java.util.List;

import com.bcopstein.demo.Dominio.model.Produto;

public interface IRepProdutos {
    void save(Produto p);
    List<Produto> all();
}
