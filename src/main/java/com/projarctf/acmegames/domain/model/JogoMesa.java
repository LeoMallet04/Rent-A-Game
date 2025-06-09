package com.projarctf.acmegames.domain.model;

import com.projarctf.acmegames.domain.enums.TipoMesa;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class JogoMesa extends  Jogo{

    private TipoMesa tipoMesa;
    private int numeroPecas;

    @Override
    public double calculaValorAluguel(){
        return 0;
    }
}
