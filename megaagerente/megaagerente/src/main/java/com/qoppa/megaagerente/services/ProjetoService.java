package com.qoppa.megaagerente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qoppa.megaagerente.Interfaces.IProjetoService;
import com.qoppa.megaagerente.models.Projeto;
import com.qoppa.megaagerente.repositories.ProjetoRepository;

@Service
public class ProjetoService implements IProjetoService<Projeto> {

    final private ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    @Override
    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }

    @Override
    public Projeto findById(Long id) {
        return projetoRepository.findById(id).get();
    }

    @Override
    public Projeto save(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    @Override
    public void deleteById(Long id) {
        projetoRepository.deleteById(id);
    }

}
