package com.projarctf.acmegames.adapter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.application.usecases.cliente.ListarClientesUseCase;
import com.projarctf.acmegames.application.usecases.cliente.ValidaClienteUseCase;

@RestController
@RequestMapping("/acmegames/cadastro")
public class ClienteController {

    @Autowired
    private ListarClientesUseCase listaClientesUseCase;


    @GetMapping("/listaclientes")
    public List<ClienteDTO> listaClientes() {
        return listaClientesUseCase.listarClientes();
    }

    @Autowired
    private ValidaClienteUseCase validaClienteUseCase;

    @PostMapping("/validacliente")
    public boolean validaCliente(@RequestParam final long numero) {
        return validaClienteUseCase.validaCliente(numero);
    }
}
