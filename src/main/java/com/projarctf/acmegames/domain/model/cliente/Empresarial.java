package com.projarctf.acmegames.domain.model.cliente;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Empresarial extends Cliente {
    private String nomeFantasia;
    private String cnpj;
}
