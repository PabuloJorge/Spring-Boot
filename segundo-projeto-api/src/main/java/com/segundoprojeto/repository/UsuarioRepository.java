package com.segundoprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.segundoprojeto.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
