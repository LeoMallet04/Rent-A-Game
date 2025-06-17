package com.projarctf.acmegames.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class ListaJogoUsecase {
    @Autowired
    JogoService jogoService;

    public List<Jogo> listarJogos() {        
        List<Jogo> jogos = jogoService.listJogos();

        return jogos;
    }
}
