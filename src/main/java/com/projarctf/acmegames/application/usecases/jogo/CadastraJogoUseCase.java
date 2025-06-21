package com.projarctf.acmegames.application.usecases.jogo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.assembler.JogoAssembler;
import com.projarctf.acmegames.application.dto.JogoDTO;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.service.JogoService;

@Component
public class CadastraJogoUseCase {
    @Autowired
    JogoService jogoService;

    @Autowired
    JogoAssembler jogoAssembler;

    public boolean cadastraJogo(JogoDTO jogo) { 
        Jogo domainObject = jogoAssembler.dtoToDomain(jogo);        
        
        if (domainObject == null) {
            System.out.println("Tipo de jogo não suportado.");
            return false;
        }
        
        return jogoService.cadastraJogo(domainObject);
    }
}
