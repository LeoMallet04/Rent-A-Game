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
public class ClienteEntity {

    @Id
    @Column(name = "numero")
    private Long numero;

    private String nome;

    private String endereco;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AluguelEntity> alugueis = new ArrayList<>();

    protected ClienteEntity() {}
}
