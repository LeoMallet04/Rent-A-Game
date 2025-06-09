package com.projarctf.acmegames.domain.model;

import com.projarctf.acmegames.domain.enums.TipoEletronico;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class JogoEletronico extends Jogo {

    private TipoEletronico tipoEletronico;
    private String plataforma;

    @Override
    public double calculaValorAluguel(){
        return 0;
    }
}
