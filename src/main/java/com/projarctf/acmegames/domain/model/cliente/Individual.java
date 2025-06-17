package com.projarctf.acmegames.domain.model.cliente;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Individual extends Cliente {
    private String cpf;

    public Individual(int numero, String nome, String endereco, String cpf) {
        super(numero, nome, endereco);
        this.cpf = cpf;
    }
}
