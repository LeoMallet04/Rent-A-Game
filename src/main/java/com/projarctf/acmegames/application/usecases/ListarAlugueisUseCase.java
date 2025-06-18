package com.projarctf.acmegames.application.usecases;

import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.projarctf.acmegames.application.assembler.AluguelAssembler;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.repository.IAluguelRepository;

@Service
public class ListarAlugueisUseCase{

    private final IAluguelRepository repository;

    public ListarAlugueisUseCase(IAluguelRepository repository){
        this.repository =  repository;
    }

    public List<AluguelDTO> execute(){
        return repository.getAlugueis().stream().map(entity -> AluguelAssembler.toDTO(entity)).collect(Collectors.toList());
    }

}