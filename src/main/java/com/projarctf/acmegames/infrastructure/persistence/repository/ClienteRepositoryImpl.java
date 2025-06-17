package com.projarctf.acmegames.infrastructure.persistence.repository;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.domain.model.cliente.Individual;
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
            .map(entity -> {
                if (entity.getCpf() != null && !entity.getCpf().isBlank()) {
                    return new Individual(
                        entity.getNumero().intValue(),
                        entity.getNome(),
                        entity.getEndereco(),
                        entity.getCpf()
                    );
                } else {
                    return new Empresarial(
                        entity.getNumero().intValue(),
                        entity.getNome(),
                        entity.getEndereco(),
                        entity.getNomeFantasia(),
                        entity.getCnpj()
                    );
                }
            })
            .collect(Collectors.toList());
    }
}
