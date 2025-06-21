package com.projarctf.acmegames.adapter.controller;

import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.application.usecases.cliente.ListarClientesUseCase;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acmegames/cadastro")
public class ClienteController {

    private final ListarClientesUseCase listar;

    public ClienteController(ListarClientesUseCase listar) {
        this.listar = listar;
    }

    @GetMapping("/listaclientes")
    public ResponseEntity<List<ClienteDTO>> listarTodos() {
        List<ClienteDTO> clientes = listar.execute();
        return ResponseEntity.ok(clientes);
    }
}
