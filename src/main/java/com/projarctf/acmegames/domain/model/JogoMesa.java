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
        double valor = this.getValorBase();
        switch (tipoMesa){
            case TipoMesa.TABULEIRO:
                valor = valor * numeroPecas;
                break;
            case TipoMesa.CARTAS:
                valor += valor * 0.20;
        }
        return valor;
    }
}
