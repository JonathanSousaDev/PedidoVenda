package com.algaworks.pedidoVenda.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PedidoVendaPU");
        EntityManager manager = factory.createEntityManager();
    }
}
