package com.algaworks.pedidoVenda.repository;

import com.algaworks.pedidoVenda.model.Categoria;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;

public class Categorias implements Serializable {

    @Inject
    private EntityManager manager;

    public List<Categoria> raizes() {
        return manager.createQuery("from Categoria c where c.categoriaPai is null", Categoria.class).getResultList();
    }

    public Categoria porId(Long id) {
        return manager.find(Categoria.class, id);
    }

    public List<Categoria> subcategoriasDe(Categoria categoriaPai) {
        return manager.createQuery("from Categoria where categoriaPai = :raiz", Categoria.class)
                .setParameter("raiz", categoriaPai).getResultList();
    }
}
