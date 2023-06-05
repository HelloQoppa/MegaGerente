package com.qoppa.megaagerente.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qoppa.megaagerente.Interfaces.IColaboradorService;
import com.qoppa.megaagerente.models.Colaborador;
import com.qoppa.megaagerente.repositories.ColaboradorRepository;

@Service
public class ColaboradorService implements IColaboradorService<Colaborador> {

    final private ColaboradorRepository colaboradorRepository;

    public ColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    @Override
    public List<Colaborador> findAll() {
        return colaboradorRepository.findAll();
    }

    @Override
    public Colaborador findById(Long id) {
        if (colaboradorRepository.findById(id).isEmpty()) {
            return null;
        }
        return colaboradorRepository.findById(id).get();
    }

    @Override
    public Colaborador save(Colaborador colaborador) {
        return colaboradorRepository.save(colaborador);
    }

    @Override
    public void deleteById(Long id) {
        colaboradorRepository.deleteById(id);
    }

}
