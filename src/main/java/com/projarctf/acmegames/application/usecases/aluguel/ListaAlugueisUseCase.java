package com.projarctf.acmegames.application.usecases.aluguel;

import java.util.List;


import com.projarctf.acmegames.application.assembler.AluguelAssembler;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ListaAlugueisUseCase {

    @Autowired
    private AluguelService aluguelService;

    public List<AluguelDTO> listarAlugueis(){
        return aluguelService.listAlugueis().stream().map(AluguelAssembler::toDTO).toList();
    }
}