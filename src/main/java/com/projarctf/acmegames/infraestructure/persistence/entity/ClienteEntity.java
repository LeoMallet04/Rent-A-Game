package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ClienteEntity {

    @Id
    @GeneratedValue
    private int numero;
    private String nome;
    private String endereco;

    @OneToMany
    private List<AluguelEntity> alugueis;

    protected ClienteEntity() {}
}
