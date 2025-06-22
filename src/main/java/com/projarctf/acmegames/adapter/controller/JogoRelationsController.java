package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.application.usecases.jogo.ListaAlugueisDoJogoUseCase;

@RestController
@RequestMapping("/acmegames/jogo")
public class JogoRelationsController {

    @Autowired
    private ListaAlugueisDoJogoUseCase listaAlugueisDoJogoUseCase;

    @GetMapping("/aluguel")
    public List<AluguelDTO> listaAlugueisDoJogo(@RequestParam final int codigo) {
        return listaAlugueisDoJogoUseCase.listarAlugueisDoJogo(codigo);
    }
    
}
