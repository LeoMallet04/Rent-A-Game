package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.repository.IClienteRepository;
import com.projarctf.acmegames.infrastructure.mapper.ClienteMapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {

    private final IClienteJpaItfRep jpa;

    public ClienteRepositoryImpl(IClienteJpaItfRep jpa) {
        this.jpa = jpa;
    }

    @Override
    public List<Cliente> findAllClientes() {
        return jpa.findAll().stream()
                .map(entity -> ClienteMapper.toDomain(entity))
                .collect(Collectors.toList());
    }
}
