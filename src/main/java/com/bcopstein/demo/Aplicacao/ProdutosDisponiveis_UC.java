package com.bcopstein.demo.Aplicacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bcopstein.demo.Dominio.model.Produto;
import com.bcopstein.demo.Dominio.services.ServicoEstoque;

@Component
public class ProdutosDisponiveis_UC {
    @Autowired
    private ServicoEstoque servicoEstoque;

    public List<Produto> run(){
        return servicoEstoque.produtosDisponiveis();
    }

}
