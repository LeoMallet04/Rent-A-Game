package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class JogoEntity {

    @Id
    @Column(name = "codigo")
    private int codigo;
    private String nome;
    private double valorBase;

    @OneToMany(mappedBy = "jogo",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AluguelEntity> alugueis = new ArrayList<>();

    protected JogoEntity() {}
}
