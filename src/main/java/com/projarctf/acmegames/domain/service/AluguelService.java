package com.projarctf.acmegames.domain.service;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import org.springframework.stereotype.Service;

@Service
public class AluguelService {
    public double calculaValorAluguel(Aluguel aluguel){
        return aluguel.calcularValorAluguel();
    }
}
 