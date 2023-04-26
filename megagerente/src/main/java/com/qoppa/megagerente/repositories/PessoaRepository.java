package com.qoppa.megagerente.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.qoppa.megagerente.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
