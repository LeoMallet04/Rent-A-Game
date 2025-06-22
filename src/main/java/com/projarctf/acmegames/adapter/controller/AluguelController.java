package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import com.projarctf.acmegames.application.dto.AluguelCreateDTO;
import com.projarctf.acmegames.application.usecases.aluguel.CadastraAluguelUseCase;
import com.projarctf.acmegames.application.usecases.aluguel.ValidaAluguelUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.application.usecases.aluguel.ListaAlugueisUseCase;

@RequestMapping("/acmegames")
@RestController
public class AluguelController {

    @Autowired
    private ListaAlugueisUseCase listarAlugueisUseCase;

    @Autowired
    private ValidaAluguelUseCase validaAluguelUseCase;

    @Autowired
    private CadastraAluguelUseCase cadastraAluguelUseCase;

    @GetMapping("/cadastro/listaalugueis")
    public List<AluguelDTO> getAlugueis(){
        return listarAlugueisUseCase.listarAlugueis();
    }

    @PostMapping("/cadastro/cadaluguel")
    public boolean cadastraAluguel(@RequestBody AluguelCreateDTO aluguelCreateDTO){
        return cadastraAluguelUseCase.cadastraAluguel(aluguelCreateDTO);
    }

    @PostMapping("/validaaluguel")
    public boolean validaAluguel(@RequestBody int identificador){
        return validaAluguelUseCase.validaAluguel(identificador);
    }
}
