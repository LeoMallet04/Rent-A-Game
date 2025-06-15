package com.projarctf.acmegames.domain.model.aluguel;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import lombok.Data;

import java.util.Date;

@Data
public class Aluguel {
    private int identificador;
    private Date dataInicial;
    private int periodo;

    private Cliente cliente;
    private Jogo jogo;

    public double calcularValorAluguel() {
        double valorAluguel = 0;
            if (cliente instanceof Individual) {
                if (periodo < 7) { // 0-6
                    valorAluguel = (jogo.calculaValorAluguel() * periodo * 0.9 );
                } else if (periodo <= 14) { // 7-14
                    valorAluguel = (jogo.calculaValorAluguel() * periodo * 0.8 );
                } else { // 15+
                    valorAluguel = (jogo.calculaValorAluguel() * periodo * 0.75 );
                }
            } else if(cliente instanceof Empresarial){
                if (jogo instanceof JogoEletronico) {
                    valorAluguel = jogo.calculaValorAluguel() * periodo;
                } else { // mesa
                    valorAluguel =  jogo.calculaValorAluguel() * periodo * 0.85;
                }
            }
        return valorAluguel;
    }
}
