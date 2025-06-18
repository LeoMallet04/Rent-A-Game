package com.projarctf.acmegames.domain.model.jogo;

import com.projarctf.acmegames.domain.enums.TipoMesa;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class JogoMesa extends  Jogo{

    private TipoMesa tipoMesa;
    private int numeroPecas;

    public JogoMesa(int codigo, String nome, double valorBase, TipoMesa tipoMesa, int numeroPecas) {
        super(codigo, nome, valorBase);
        this.tipoMesa = tipoMesa;
        this.numeroPecas = numeroPecas;
    }

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
