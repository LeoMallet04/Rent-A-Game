package com.projarctf.acmegames.application.assembler;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;

@Component
public final class ClienteAssembler {

    public static ClienteDTO toDto(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente não pode ser nulo.");
        }

        if (cliente instanceof Individual ind) {
            return new ClienteDTO(
                ind.getNumero(),
                ind.getNome(),
                ind.getEndereco(),
                "INDIVIDUAL",
                ind.getCpf(),
                null,
                null
            );
        } else if (cliente instanceof Empresarial emp) {
            return new ClienteDTO(
                emp.getNumero(),
                emp.getNome(),
                emp.getEndereco(),
                "EMPRESARIAL",
                null,
                emp.getNomeFantasia(),
                emp.getCnpj()
            );
        } else {
            return new ClienteDTO(
                cliente.getNumero(),
                cliente.getNome(),
                cliente.getEndereco(),
                "DESCONHECIDO",
                null,
                null,
                null
            );
        }
    }

    public static Cliente toDomain(ClienteDTO clienteDTO) {
        if (clienteDTO == null) {
            throw new IllegalArgumentException("ClienteDTO não pode ser nulo.");
        }

        if (clienteDTO.getCpf() != null) {
            return new Individual(
                clienteDTO.getNumero(),
                clienteDTO.getNome(),
                clienteDTO.getEndereco(),
                clienteDTO.getCpf()
            );
        } else if (clienteDTO.getCnpj() != null) {
            return new Empresarial(
                clienteDTO.getNumero(),
                clienteDTO.getNome(),
                clienteDTO.getEndereco(),
                clienteDTO.getNomeFantasia(),
                clienteDTO.getCnpj()
            );
        } else {
            return new Cliente(
                clienteDTO.getNumero(),
                clienteDTO.getNome(),
                clienteDTO.getEndereco()
            );
        }
    }

    public Object domainToDTO(Cliente cliente) {
        throw new UnsupportedOperationException("Unimplemented method 'domainToDTO'");
    }
}