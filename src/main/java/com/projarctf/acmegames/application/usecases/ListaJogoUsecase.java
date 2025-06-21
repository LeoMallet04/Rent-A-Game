package com.projarctf.acmegames.application.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.assembler.JogoAssembler;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import com.projarctf.acmegames.domain.model.jogo.JogoMesa;
import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class ListaJogoUsecase {
    @Autowired
    JogoService jogoService;

    @Autowired
    JogoAssembler jogoAssembler;

    public List<Object> listarJogos() {        
        List<Jogo> jogos = jogoService.listJogos();

        List<Object> dtos = jogos.stream()
            .map(jogo -> {
                if (jogo instanceof JogoEletronico) {
                    return jogoAssembler.eletronicoToDTO((JogoEletronico) jogo);
                } else if (jogo instanceof JogoMesa) {
                    return jogoAssembler.mesaToDTO((JogoMesa) jogo);
                } else {
                    return null;
                }
            })
            .toList();

        return dtos;
    }
}
