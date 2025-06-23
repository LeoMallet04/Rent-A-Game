package com.projarctf.acmegames.application.usecases.cliente;

import org.springframework.stereotype.Component;
import com.projarctf.acmegames.domain.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class ValidaClienteUseCase {
    @Autowired
    ClienteService clienteService;

    public boolean validaCliente(int numero) {
        return clienteService.clienteExists(numero);
    }
}
