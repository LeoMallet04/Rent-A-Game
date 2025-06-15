package com.projarctf.acmegames.domain.model.jogo;

import com.projarctf.acmegames.domain.enums.TipoEletronico;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class JogoEletronico extends Jogo {

    private TipoEletronico tipoEletronico;
    private String plataforma;

    @Override
    public double calculaValorAluguel(){
        double valor = this.getValorBase();
        switch (tipoEletronico){
            case TipoEletronico.AVENTURA:
                valor += valor * 0.05;
                break;
            case TipoEletronico.ESTRATEGIA:
                valor += valor * 0.15;
                break;
            case TipoEletronico.SIMULACAO:
                valor += valor * 0.25;
        }
        return valor;
    }
}
