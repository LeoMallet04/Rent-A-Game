package com.projarctf.acmegames.application.usecases.cliente;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.projarctf.acmegames.application.assembler.ClienteAssembler;
import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.service.ClienteService;

@Component
public class ListarClientesUseCase {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    ClienteAssembler clienteAssembler;

    public List<ClienteDTO> listarClientes() {
        List<Cliente> clientes = clienteService.listClientes();

        List<ClienteDTO> dtos = clientes.stream()
                .map(cliente -> {
                    return ClienteAssembler.toDto(cliente);
                })
                .toList();

        return dtos;
    }
}
