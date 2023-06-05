package com.qoppa.megaagerente.Interfaces;

import java.util.List;
import com.qoppa.megaagerente.models.Administrador;

public interface IAdministradorService<T> {

    public List<T> findAll();

    public T findById(Long id);

    public T save(Administrador administrador);

    public void deleteById(Long id);

    // public T login(String email, String senha);

}
