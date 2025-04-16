package com.cassia.livrosapi.controller;

import org.springframework.web.bind.annotation.*;

import com.cassia.livrosapi.model.Autor;
import com.cassia.livrosapi.repository.AutorRepository;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    private  final AutorRepository repository;

    public AutorController(AutorRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Autor> listar(){
        return repository.findAll();
    }

    @PostMapping
    public Autor criar(@RequestBody Autor autor){
        return repository.save(autor);
    }

    @GetMapping("/{id}")
    public Autor buscar(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }



}
