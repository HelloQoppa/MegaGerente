package com.qoppa.megaagerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qoppa.megaagerente.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
