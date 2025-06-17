package com.projarctf.acmegames.domain.model.cliente;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Empresarial extends Cliente {
    private String nomeFantasia;
    private String cnpj;

    public Empresarial(int numero, String nome, String endereco, String nomeFantasia, String cnpj) {
        super(numero, nome, endereco);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
}
