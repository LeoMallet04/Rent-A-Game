package com.projarctf.acmegames.application.usecases.jogo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.assembler.AluguelAssembler;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class ListaAlugueisDoJogoUseCase {
    @Autowired
    private JogoService jogoService;

    public List<AluguelDTO> listarAlugueisDoJogo(int codigo) {
        return jogoService.getAlugueisForJogo(codigo)
                .stream()
                .map(aluguel -> {
                    return AluguelAssembler.toDTO(aluguel);
                })
                .toList();
    }
}
