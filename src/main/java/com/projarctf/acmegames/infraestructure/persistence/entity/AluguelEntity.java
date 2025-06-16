package com.projarctf.acmegames.infraestructure.persistence.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class AluguelEntity {

    @Id
    @GeneratedValue
    private int identificador;
    private Date dataInicial;
    private int periodo;

    @ManyToOne
    private ClienteEntity cliente;
    @ManyToOne
    private JogoEntity jogo;

    protected AluguelEntity(){}
}
