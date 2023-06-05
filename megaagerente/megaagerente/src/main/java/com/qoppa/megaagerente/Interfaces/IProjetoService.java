package com.qoppa.megaagerente.Interfaces;

import java.util.List;

import com.qoppa.megaagerente.models.Projeto;

public interface IProjetoService<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(Projeto projeto);

    public void deleteById(Long id);
}
