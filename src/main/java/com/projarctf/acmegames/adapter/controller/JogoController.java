package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.usecases.ListaJogoUsecase;
import com.projarctf.acmegames.application.usecases.ValidaJogoUsecase;

@RestController
@RequestMapping("/acmegames/cadastro")
public class JogoController {

    @Autowired
    private ListaJogoUsecase listaJogoUsecase;

    @GetMapping("/listajogos")
    public List<Object> listaJogos() {
        return listaJogoUsecase.listarJogos();
    }

    @Autowired
    private ValidaJogoUsecase validaJogoUsecase;

    @GetMapping("/validajogo")
    public boolean validaJogo(@RequestBody final int codigo) {
        System.out.println("Validando jogo com código: " + codigo);
        
        return validaJogoUsecase.validaJogo(codigo);
    }
}
