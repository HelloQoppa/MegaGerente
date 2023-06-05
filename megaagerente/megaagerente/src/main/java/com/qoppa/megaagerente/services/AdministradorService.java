package com.qoppa.megaagerente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qoppa.megaagerente.Interfaces.IAdministradorService;
import com.qoppa.megaagerente.models.Administrador;
import com.qoppa.megaagerente.repositories.AdministradorRepository;

@Service
public class AdministradorService implements IAdministradorService<Administrador> {

    final AdministradorRepository administradorRepository;

    public AdministradorService(AdministradorRepository administradorRepository) {
        this.administradorRepository = administradorRepository;
    }

    @Override
    public List<Administrador> findAll() {
        return administradorRepository.findAll();
    }

    @Override
    public Administrador findById(Long id) {
        return administradorRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        administradorRepository.deleteById(id);
    }

    @Override
    public Administrador save(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

  
}
