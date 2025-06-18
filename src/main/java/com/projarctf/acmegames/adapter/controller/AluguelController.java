package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projarctf.acmegames.application.dto.AluguelDTO;

import com.projarctf.acmegames.application.usecases.ListarAlugueisUseCase;

@RequestMapping("/acmegames/cadastro")
@RestController
public class AluguelController {

    @Autowired
    private ListarAlugueisUseCase listarAlugueisUseCase;

    @GetMapping("/acmegames/cadastro/listaalugueis")
    public List<AluguelDTO> getAlugueis(){
        return listarAlugueisUseCase.execute();
    }
}
