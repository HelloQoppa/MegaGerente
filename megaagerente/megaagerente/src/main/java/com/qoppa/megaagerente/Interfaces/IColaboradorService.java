package com.qoppa.megaagerente.Interfaces;

import java.util.List;

import com.qoppa.megaagerente.models.Colaborador;

public interface IColaboradorService<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(Colaborador colaborador);

    public void deleteById(Long id);
}
