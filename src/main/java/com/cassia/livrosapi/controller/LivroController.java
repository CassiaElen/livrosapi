package com.cassia.livrosapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.cassia.livrosapi.model.Livro;
import com.cassia.livrosapi.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
public class LivroController {
    
    private final LivroRepository repository;

    public LivroController(LivroRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Livro> listar(){
        return repository.findAll();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro livro){
        return repository.save(livro);
    }

    @GetMapping("/{id}")
    public Livro buscar(@PathVariable Long id){
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }
}
