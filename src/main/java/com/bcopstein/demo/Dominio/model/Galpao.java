package com.bcopstein.demo.Dominio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Galpao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long idItem;
    private int quantItem;

    public long getId() {
        return id;
    }

    public long getIdItem() {
        return idItem;
    }

    public int getQuantItem() {
        return quantItem;
    }
    
}
