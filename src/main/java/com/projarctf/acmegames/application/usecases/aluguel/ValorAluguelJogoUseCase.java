package com.projarctf.acmegames.application.usecases.aluguel;

import com.projarctf.acmegames.domain.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ValorAluguelJogoUseCase {

    @Autowired
    private JogoService jogoService;

    public double getValorAluguelPorJogo(int codigoJogo){
       return jogoService.getValorAluguelJogo(codigoJogo);
    }
}
