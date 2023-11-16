package com.bcopstein.demo.Dominio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcopstein.demo.Dominio.model.Produto;
import com.bcopstein.demo.Persistencias.repositories.RepProdutosMem;

@Service
public class ServicoEstoque{
    private RepProdutosMem produtosRep;

    @Autowired
    public ServicoEstoque(RepProdutosMem produtosRep){
        this.produtosRep = produtosRep;
    }

    public List<Produto> produtosDisponiveis(){
        return produtosRep.all();
    }

    public Produto findProdById(long id){
        return produtosRep.findById(id);
    }
}
