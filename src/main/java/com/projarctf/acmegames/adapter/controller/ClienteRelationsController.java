package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.application.usecases.jogo.ListaAlugueisDoClienteUseCase;

@RestController
@RequestMapping("/acmegames/cliente")
public class ClienteRelationsController {

    @Autowired
    private ListaAlugueisDoClienteUseCase listaAlugueisDoClienteUseCase;

    @GetMapping("/aluguel")
    public List<AluguelDTO> listaAlugueisDoCliente(@RequestParam final int numero) {
        return listaAlugueisDoClienteUseCase.listarAlugueisDoCliente(numero); // Exemplo de código do cliente
    }

}
