package com.cassia.livrosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassia.livrosapi.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {}
