package com.projarctf.acmegames.domain.model;

import lombok.Data;

@Data
public abstract class Jogo {
    private int codigo;
    private String nome;
    private double valorBase;

    public abstract double calculaValorAluguel();
}
