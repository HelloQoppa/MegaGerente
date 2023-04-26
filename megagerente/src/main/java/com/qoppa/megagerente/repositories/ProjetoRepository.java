package com.qoppa.megagerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qoppa.megagerente.models.Projeto;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
