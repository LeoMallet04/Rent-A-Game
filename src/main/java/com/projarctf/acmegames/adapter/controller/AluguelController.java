package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import com.projarctf.acmegames.application.dto.AluguelClienteDTO;
import com.projarctf.acmegames.application.dto.AluguelCreateDTO;
import com.projarctf.acmegames.application.usecases.aluguel.*;
import com.projarctf.acmegames.application.usecases.jogo.ListaAlugueisDoClienteUseCase;
import com.projarctf.acmegames.application.usecases.jogo.ListaAlugueisDoJogoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.projarctf.acmegames.application.dto.AluguelDTO;

@RequestMapping("/acmegames")
@RestController
public class AluguelController {

    @Autowired
    private ListaAlugueisUseCase listarAlugueisUseCase;

    @Autowired
    private ValidaAluguelUseCase validaAluguelUseCase;

    @Autowired
    private CadastraAluguelUseCase cadastraAluguelUseCase;

    @Autowired
    private ListaAlugueisDoClienteUseCase listaAlugueisDoClienteUseCase;

    @Autowired
    private ListaAlugueisDoJogoUseCase listaAlugueisDoJogoUseCase;

    @Autowired
    private ValorAluguelJogoUseCase valorAluguelJogoUseCase;

    @Autowired
    private ValorAluguelFinalUseCase valorAluguelFinalUseCase;


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

    @GetMapping("/cliente/aluguel/:{numero}")
    public List<AluguelClienteDTO> listaAlugueisDoCliente(@PathVariable(value = "numero") final int numero) {
        return listaAlugueisDoClienteUseCase.listarAlugueisDoCliente(numero); // Exemplo de código do cliente
    }

    @GetMapping("/jogo/aluguel/:{codigo}")
    public List<AluguelDTO> listaAlugueisDoJogo(@PathVariable(value = "codigo") final int codigo) {
        return listaAlugueisDoJogoUseCase.listarAlugueisDoJogo(codigo);
    }

    @GetMapping("/aluguel/valorjogo/:{codigo}")
    public double getValorAluguelPorJogo(@PathVariable(value = "codigo") int codigo){
        return valorAluguelJogoUseCase.getValorAluguelPorJogo(codigo);
    }

    @GetMapping("/aluguel/valorfinal/:{identificador}")
    public double gerValorAluguelFinal(@PathVariable(value = "identificador") int identificador){
        return valorAluguelFinalUseCase.getValorAluguelFinal(identificador);
    }

}
