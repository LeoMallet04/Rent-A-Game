package com.projarctf.acmegames.application.usecases.aluguel;

import com.projarctf.acmegames.domain.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidaAluguelUseCase {

    @Autowired
    private AluguelService aluguelService;

    public boolean validaAluguel(int identificador){
        return aluguelService.validaAluguel(identificador);
    }

}
