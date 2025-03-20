package com.comercio.comercio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comercio.comercio.entity.Contato;


public interface ContatoRepository extends JpaRepository<Contato, Long>{
    
}