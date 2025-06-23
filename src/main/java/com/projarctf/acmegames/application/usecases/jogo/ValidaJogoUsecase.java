package com.projarctf.acmegames.application.usecases.jogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class ValidaJogoUsecase {
    @Autowired
    private JogoService jogoService;

    public boolean validaJogo(int codigo) {   
        return jogoService.jogoExists(codigo);
    }
}
