package com.projarctf.acmegames.domain.model.cliente;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private int numero;
    private String nome;
    private String endereco;
    private List<Aluguel> alugueis;
}
