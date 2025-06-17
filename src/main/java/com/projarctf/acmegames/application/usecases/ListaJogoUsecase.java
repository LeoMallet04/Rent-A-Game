package com.projarctf.acmegames.application.usecases;

import java.util.List;

import com.projarctf.acmegames.domain.service.JogoService;
import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public class ListaJogoUsecase {
    public List<JogoEntity> listarJogos() {
        JogoService jogoService = new JogoService();
        
        List<JogoEntity> jogos = jogoService.getJogos();

        return jogos;
    }
}
