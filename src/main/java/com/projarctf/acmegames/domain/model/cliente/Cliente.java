package com.projarctf.acmegames.domain.model.cliente;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private int numero;
    private String nome;
    private String endereco;
}
