package com.bcopstein.demo.Persistencias.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bcopstein.demo.Dominio.interface_repositories.IRepGalpao;
import com.bcopstein.demo.Dominio.model.Produto;

@Repository
public class RepGalpaoMem implements IRepGalpao{

    @Override
    public List<Produto> listAllProdutos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listAllProdutos'");
    }

    @Override
    public Produto findById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
