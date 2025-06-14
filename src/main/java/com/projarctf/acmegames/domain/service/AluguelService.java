package com.projarctf.acmegames.domain.service;

import com.projarctf.acmegames.domain.model.Jogo;
import com.projarctf.acmegames.domain.model.JogoEletronico;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;

public class AluguelService {
    public double calcularValorAluguel(Cliente cliente, Jogo jogo, int duracaoDias) {
        if (cliente instanceof Empresarial) {
            if (duracaoDias < 7) { // 0-6
                return (jogo.calculaValorAluguel() * 0.9 * duracaoDias);
            } else if (duracaoDias <= 14) { // 7-14
                return (jogo.calculaValorAluguel() * 0.8 * duracaoDias);
            } else { // 15+
                return (jogo.calculaValorAluguel() * 0.75 * duracaoDias);
            }
        } else {
            if (jogo instanceof JogoEletronico) {
                return jogo.calculaValorAluguel() * duracaoDias;
            } else { // mesa
                return jogo.calculaValorAluguel() * duracaoDias * 0.85;
            }
        }
    }
}
 