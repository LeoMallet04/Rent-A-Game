package com.projarctf.acmegames.domain.model.cliente;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Individual extends Cliente {
    private String cpf;
}
