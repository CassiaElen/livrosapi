package com.cassia.livrosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cassia.livrosapi.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {}
