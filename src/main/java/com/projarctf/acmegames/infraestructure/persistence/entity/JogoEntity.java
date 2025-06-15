package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class JogoEntity {

    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private double valorBase;
}
