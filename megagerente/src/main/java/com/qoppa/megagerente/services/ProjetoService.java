package com.qoppa.megagerente.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qoppa.megagerente.models.Projeto;
import com.qoppa.megagerente.repositories.ProjetoRepository;

import jakarta.transaction.Transactional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoService(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    @Transactional
    public Projeto save(Projeto projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public List<Projeto> findAll() {
        return projetoRepository.findAll();
    }
}
