package com.bcopstein.demo.Dominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcopstein.demo.Dominio.interface_repositories.IRepProdutos;
import com.bcopstein.demo.Dominio.model.Produto;

@Service
public class ServicoEstoque{
    private IRepProdutos produtosRep;

    @Autowired
    public ServicoEstoque(IRepProdutos produtosRep){
        this.produtosRep = produtosRep;
    }

    public List<Produto> produtosDisponiveis(){
        return produtosRep.all();
    }
}
