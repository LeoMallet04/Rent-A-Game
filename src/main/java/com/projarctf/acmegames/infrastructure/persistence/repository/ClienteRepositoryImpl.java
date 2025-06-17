package com.projarctf.acmegames.infrastructure.persistence.repository;

import com.projarctf.acmegames.application.assembler.ClienteMapper;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.repository.IClienteRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

    private final ClienteJpaRepository jpa;

    public ClienteRepositoryImpl(ClienteJpaRepository jpa) {
        this.jpa = jpa;
    }

    @Override
    public List<Cliente> findAllClientes() {
        return jpa.findAll().stream()
                .map(entity -> ClienteMapper.toModel(entity))
                .collect(Collectors.toList());
    }
}
