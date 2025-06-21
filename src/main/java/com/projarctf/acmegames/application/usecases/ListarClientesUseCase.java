package com.projarctf.acmegames.application.usecases;

import com.projarctf.acmegames.application.assembler.ClienteAssembler;
import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.repository.IClienteRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarClientesUseCase {

    private final IClienteRepository repository;

    public ListarClientesUseCase(IClienteRepository repository) {
        this.repository = repository;
    }

    public List<ClienteDTO> execute() {
        List<Cliente> clientes = repository.findAllClientes();
        return clientes.stream()
                .map(ClienteAssembler::toDto)
                .toList();
    }
}
