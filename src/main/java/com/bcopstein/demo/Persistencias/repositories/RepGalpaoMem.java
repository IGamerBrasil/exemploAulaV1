package com.bcopstein.demo.Persistencias.repositories;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bcopstein.demo.Dominio.interface_repositories.IRepGalpao;
import com.bcopstein.demo.Dominio.model.Galpao;
import com.bcopstein.demo.Dominio.model.Produto;

@Repository
public class RepGalpaoMem implements IRepGalpao{

    List<Galpao> galpoes;


    public RepGalpaoMem(){
        galpoes = new LinkedList<>();
        galpoes.add(new Galpao(1, 10, 60));
        galpoes.add(new Galpao(2, 20, 80));
    }

    @Override
    public List<Produto> listAllProdutos(long idGalpao) {
        List<Produto> list = new LinkedList<>();
        for (Galpao g : galpoes) {
            if(g.getId() == idGalpao){
                g.
            }
        }
        return list;
    }

    @Override
    public Produto findById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }
    
}
