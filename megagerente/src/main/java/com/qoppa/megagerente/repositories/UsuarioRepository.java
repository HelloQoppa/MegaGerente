package com.qoppa.megagerente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qoppa.megagerente.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
