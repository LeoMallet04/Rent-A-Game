package com.projarctf.acmegames.domain.model.jogo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Jogo {
    private int codigo;
    private String nome;
    private double valorBase;

    public abstract double calculaValorAluguel();
}
