package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.repository.IClienteRepository;
import com.projarctf.acmegames.infrastructure.mapper.ClienteMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository {
    @Autowired
    private IClienteJpaItfRep repository;

    @Override
    public List<Cliente> getClientes() {
        return repository.findAll().stream()
                .map(entity -> ClienteMapper.toDomain(entity))
                .collect(Collectors.toList());
    }

    @Override
    public Cliente getClienteByNumero(long numero) {
        return ClienteMapper.toDomain(repository.findByNumero((long) numero));
    }
    
    @Override
    public boolean cadastraCliente(Cliente cliente) {
        if (getClienteByNumero(cliente.getNumero()) != null) {
            return false; // Cliente já existe
        }

        repository.save(ClienteMapper.toEntity(cliente));
        return true;
    }
}
