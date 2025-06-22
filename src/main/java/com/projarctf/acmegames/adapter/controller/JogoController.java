package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.dto.JogoDTO;
import com.projarctf.acmegames.application.usecases.jogo.CadastraJogoUseCase;
import com.projarctf.acmegames.application.usecases.jogo.ListaJogoUsecase;
import com.projarctf.acmegames.application.usecases.jogo.ValidaJogoUsecase;

@RestController
@RequestMapping("/acmegames/cadastro")
public class JogoController {

    @Autowired
    private ListaJogoUsecase listaJogoUsecase;

    @GetMapping("/listajogos")
    public List<JogoDTO> listaJogos() {
        return listaJogoUsecase.listarJogos();
    }

    @Autowired
    private ValidaJogoUsecase validaJogoUsecase;

    @PostMapping("/validajogo")
    public boolean validaJogo(@RequestBody final int codigo) {
        return validaJogoUsecase.validaJogo(codigo);
    }

    @Autowired
    private CadastraJogoUseCase cadastraJogoUseCase;

    @PostMapping("/cadastrajogo")
    public boolean cadastraJogo(@RequestBody final JogoDTO jogo) {
        return cadastraJogoUseCase.cadastraJogo(jogo);
    }
}
