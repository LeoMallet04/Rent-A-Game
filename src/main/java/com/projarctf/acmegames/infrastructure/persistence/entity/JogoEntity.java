package com.projarctf.acmegames.infrastructure.persistence.entity;

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
@Table(name = "jogo")
public class JogoEntity {
    @Id
    @Column(name = "codigo")
    private Integer codigo;
    private String nome;
    private double valorBase;
    private String tipo; //isso aq vai ter q ser traduzido e validado pro enum certo

    @Column(nullable = true)
    private String plataforma;

    @Column(nullable = true)
    private Integer numeroPecas;

    @OneToMany(mappedBy = "jogo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AluguelEntity> alugueis = new ArrayList<>();

    protected JogoEntity() {}
}