package com.projarctf.acmegames.adapter.controller;

import com.projarctf.acmegames.application.usecases.aluguel.ValorAluguelFinalUseCase;
import com.projarctf.acmegames.application.usecases.aluguel.ValorAluguelJogoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/acmegames/aluguel")
@RestController
public class AluguelRelationsController {

    @Autowired
    private ValorAluguelJogoUseCase valorAluguelJogoUseCase;

    @Autowired
    private ValorAluguelFinalUseCase valorAluguelFinalUseCase;

    @GetMapping("/valorjogo/:{codigo}")
    public double getValorAluguelPorJogo(@PathVariable(value = "codigo") int codigo){
        return valorAluguelJogoUseCase.getValorAluguelPorJogo(codigo);
    }

    @GetMapping("/valorfinal/:{identificador}")
    public double gerValorAluguelFinal(@PathVariable(value = "identificador") int identificador){
        return valorAluguelFinalUseCase.getValorAluguelFinal(identificador);
    }


}
