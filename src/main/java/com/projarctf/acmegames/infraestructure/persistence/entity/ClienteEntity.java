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
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @Column(name = "numero")
    private Long numero;

    private String nome;
    private String endereco;

    @Column(nullable = true)
    private String nomeFantasia;

    @Column(nullable = true)
    private String cnpj; //tem q validar, se tem CNPJ, não pode ter CPF

    @Column(nullable = true)
    private String cpf;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AluguelEntity> alugueis = new ArrayList<>();

    protected ClienteEntity() {}
}