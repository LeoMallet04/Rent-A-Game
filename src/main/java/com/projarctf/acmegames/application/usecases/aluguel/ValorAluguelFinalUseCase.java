package com.projarctf.acmegames.application.usecases.aluguel;

import com.projarctf.acmegames.domain.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValorAluguelFinalUseCase {

    @Autowired
    private AluguelService aluguelService;

    public double getValorAluguelFinal(int identificador){
        return aluguelService.getValorFinalAluguel(identificador);
    }
}
