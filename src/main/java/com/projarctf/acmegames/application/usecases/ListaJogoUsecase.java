package com.projarctf.acmegames.application.usecases;

import java.util.List;

import com.projarctf.acmegames.domain.service.JogoService;
import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public class ListaJogoUsecase {
    public List<Jogo> listarJogos() {
        JogoService jogoService = new JogoService();
        
        List<Jogo> jogos = jogoService.getJogos();

        return jogos;
    }
}
