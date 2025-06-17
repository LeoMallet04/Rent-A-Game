package com.projarctf.acmegames.application.usecases;

import java.util.List;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.service.JogoService;

public class ListaJogoUsecase {
    public List<Jogo> listarJogos() {
        JogoService jogoService = new JogoService();
        
        List<Jogo> jogos = jogoService.listJogos();

        return jogos;
    }
}
