package com.primeiroprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
