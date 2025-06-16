package com.projarctf.acmegames.domain.model.jogo;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Jogo {
    private int codigo;
    private String nome;
    private double valorBase;
    private List<Aluguel> alugueis;

    public abstract double calculaValorAluguel();
}
