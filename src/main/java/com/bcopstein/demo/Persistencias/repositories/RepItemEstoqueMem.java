package com.bcopstein.demo.Persistencias.repositories;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bcopstein.demo.Dominio.interface_repositories.IRepItemEstoque;
import com.bcopstein.demo.Dominio.model.ItemEstoque;

@Repository
public class RepItemEstoqueMem implements IRepItemEstoque{

    List<ItemEstoque> list;

    public RepItemEstoqueMem(){
        list = new LinkedList<>();
        list.add(new ItemEstoque(10, 100, 10, 50));
        list.add(new ItemEstoque(20, 109, 11, 90));
    }

    @Override
    public List<ItemEstoque> listarItensEstoque() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listarItensEstoque'");
    }

    @Override
    public ItemEstoque obterItemEstoquePorId(long itemId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterItemEstoquePorId'");
    }

    @Override
    public void adicionarItemEstoque(ItemEstoque itemEstoque) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'adicionarItemEstoque'");
    }

    @Override
    public void atualizarItemEstoque(ItemEstoque itemEstoque) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarItemEstoque'");
    }

    @Override
    public void removerItemEstoque(long itemId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removerItemEstoque'");
    }
    
}
