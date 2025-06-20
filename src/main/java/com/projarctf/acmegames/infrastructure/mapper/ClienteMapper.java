package com.projarctf.acmegames.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class ClienteMapper{
    public static Cliente toDomain(ClienteEntity clienteEntity) {
        if (clienteEntity.getCpf() != null && !clienteEntity.getCpf().isBlank()) {
            return new Individual(
                    clienteEntity.getNumero().intValue(),
                    clienteEntity.getNome(),
                    clienteEntity.getEndereco(),
                    clienteEntity.getCpf());
        } else {
            return new Empresarial(
                    clienteEntity.getNumero().intValue(),
                    clienteEntity.getNome(),
                    clienteEntity.getEndereco(),
                    clienteEntity.getNomeFantasia(),
                    clienteEntity.getCnpj());
        }
    }
}