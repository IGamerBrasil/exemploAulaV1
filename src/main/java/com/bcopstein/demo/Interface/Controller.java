package com.bcopstein.demo.Interface;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bcopstein.demo.Aplicacao.ProdutosDisponiveis_UC;
import com.bcopstein.demo.Dominio.model.Produto;

@RestController
public class Controller {
    @Autowired
    private ProdutosDisponiveis_UC produtosDisponiveis_UC;

    @GetMapping("id={id}")
    @CrossOrigin("*")
    public Produto byId(@PathVariable long id){
        return produtosDisponiveis_UC.byId(id);
    }

    @GetMapping("produtosDisponiveis")
    @CrossOrigin("*")
    public List<Produto> produtosDisponiveis() {
        return produtosDisponiveis_UC.run();
    }
    
}
