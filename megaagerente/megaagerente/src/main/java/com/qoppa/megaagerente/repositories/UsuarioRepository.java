package com.qoppa.megaagerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qoppa.megaagerente.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
