package com.bcopstein.demo.Persistencias.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bcopstein.demo.Dominio.interface_repositories.IRepOrcamentos;
import com.bcopstein.demo.Dominio.model.Orcamento;

@Repository
public class RepOrcamentosMem implements IRepOrcamentos{

    @Override
    public List<Orcamento> listarOrcamentos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarOrcamentos'");
    }

    @Override
    public Orcamento obterOrcamentosPorId(long orcId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterOrcamentosPorId'");
    }

    @Override
    public void adicionarOr(Orcamento orcamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarOr'");
    }

    @Override
    public void atualizarItemEstoque(Orcamento orcamento) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarItemEstoque'");
    }

    @Override
    public void removerOrcamento(long orcId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerOrcamento'");
    }
    
}
