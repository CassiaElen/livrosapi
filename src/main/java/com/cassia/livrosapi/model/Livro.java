package com.cassia.livrosapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;

    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonBackReference
    private Autor autor;
}
