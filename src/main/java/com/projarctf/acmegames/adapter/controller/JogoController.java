package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.usecases.ListaJogoUsecase;
import com.projarctf.acmegames.domain.model.jogo.Jogo;

@RestController
@RequestMapping("/acmegames/cadastro")
public class JogoController {

    @Autowired
    private ListaJogoUsecase listaJogoUsecase;

    @GetMapping("/listajogos")
    public List<Object> listaJogos() {
        return listaJogoUsecase.listarJogos();
    }
}
