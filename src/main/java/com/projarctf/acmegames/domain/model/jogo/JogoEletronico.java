package com.projarctf.acmegames.domain.model.jogo;

import com.projarctf.acmegames.domain.enums.TipoEletronico;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class JogoEletronico extends Jogo {

    private TipoEletronico tipoEletronico;
    private String plataforma;

    public JogoEletronico(int codigo, String nome, double valorBase, TipoEletronico tipoEletronico, String plataforma) {
        super(codigo, nome, valorBase);
        this.tipoEletronico = tipoEletronico;
        this.plataforma = plataforma;
    }

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

    public JogoEletronico(int codigo, String nome, double valorBase, TipoEletronico tipoEletronico, String plataforma) {
        super(codigo, nome, valorBase);
        this.tipoEletronico = tipoEletronico;
        this.plataforma = plataforma;
    }
}
