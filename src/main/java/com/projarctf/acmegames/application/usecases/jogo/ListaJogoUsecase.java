package com.projarctf.acmegames.application.usecases.jogo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.assembler.JogoAssembler;
import com.projarctf.acmegames.application.dto.JogoDTO;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class ListaJogoUsecase {
    @Autowired
    private JogoService jogoService;

    @Autowired
    private JogoAssembler jogoAssembler;

    public List<JogoDTO> listarJogos() {        
        List<Jogo> jogos = jogoService.listJogos();

        List<JogoDTO> dtos = jogos.stream()
            .map(jogo -> {
                return jogoAssembler.domainToDTO(jogo);
            })
            .toList();

        return dtos;
    }
}
