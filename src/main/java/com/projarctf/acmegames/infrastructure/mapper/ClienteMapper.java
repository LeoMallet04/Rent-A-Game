package com.projarctf.acmegames.infrastructure.mapper;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Component
@NoArgsConstructor
public class ClienteMapper{
    public static Cliente toDomain(ClienteEntity clienteEntity) {
        if (clienteEntity == null) {
            throw new IllegalArgumentException("ClienteEntity não pode ser nulo.");// Handle null case
        }
        if (clienteEntity.getCpf() != null && !clienteEntity.getCpf().isBlank()) {
            return new Individual(
                    clienteEntity.getNumero(),
                    clienteEntity.getNome(),
                    clienteEntity.getEndereco(),
                    clienteEntity.getCpf());
        } else {
            return new Empresarial(
                    clienteEntity.getNumero(),
                    clienteEntity.getNome(),
                    clienteEntity.getEndereco(),
                    clienteEntity.getNomeFantasia(),
                    clienteEntity.getCnpj());
        }
    }

    public static ClienteEntity toEntity(Cliente cliente){
        ClienteEntity clienteEntity = null;
        if(cliente instanceof Individual){
            clienteEntity = new ClienteEntity(
                    (int) cliente.getNumero(),
                    cliente.getNome(),
                    cliente.getEndereco(),
                    null,
                    null,
                    ((Individual) cliente).getCpf(),
                    new ArrayList<>()
            );
        }
        if(cliente instanceof Empresarial){
            clienteEntity = new ClienteEntity(
                    (int) cliente.getNumero(),
                    cliente.getNome(),
                    cliente.getEndereco(),
                    ((Empresarial) cliente).getNomeFantasia(),
                    ((Empresarial) cliente).getCnpj(),
                    null,
                    new ArrayList<>()
            );
        }

        return clienteEntity;
    }
}