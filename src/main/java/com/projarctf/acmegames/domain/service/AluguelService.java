package com.projarctf.acmegames.domain.service;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {
    private Aluguel aluguel;

    public double calculaValorAluguel(){
        return aluguel.calcularValorAluguel();
    }
}
 