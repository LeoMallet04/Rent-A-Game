package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.domain.repository.IClienteRepository;
import com.projarctf.acmegames.infrastructure.mapper.ClienteMapper;
import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

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
    public Cliente getClienteByNumero(int numero) {
        ClienteEntity entity = repository.findByNumero((long) numero);
        if (entity == null) {
            return null;
        }
        return ClienteMapper.toDomain(entity);
    }

    @Override
    public boolean cadastraCliente(Cliente cliente) {
        if (getClienteByNumero(cliente.getNumero()) != null) {
            return false;
        }
        if (cliente instanceof Individual individual && repository.existsByCpf(individual.getCpf())) {
            return false;
        }
        if (cliente instanceof Empresarial empresarial && repository.existsByCnpj(empresarial.getCnpj())) {
            return false;
        }

        ClienteEntity clienteEntity = ClienteMapper.toEntity(cliente);
        repository.save(clienteEntity);
        return true;
    }
}
