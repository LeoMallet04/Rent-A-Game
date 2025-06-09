package com.projarctf.acmegames.domain.model.cliente;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Empresarial extends Cliente {
    private String nomeFantasia;
    private String cnpj;
}
