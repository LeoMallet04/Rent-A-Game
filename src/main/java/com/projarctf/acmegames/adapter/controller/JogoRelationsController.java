package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.application.usecases.jogo.ListaAlugueisDoJogoUseCase;

@RestController
@RequestMapping("/acmegames/jogo")
public class JogoRelationsController {

    @Autowired
    private ListaAlugueisDoJogoUseCase listaAlugueisDoJogoUseCase;

    @GetMapping("/aluguel/:{codigo}")
    public List<AluguelDTO> listaAlugueisDoJogo(@PathVariable(value = "codigo") final int codigo) {
        return listaAlugueisDoJogoUseCase.listarAlugueisDoJogo(codigo);
    }
    
}
