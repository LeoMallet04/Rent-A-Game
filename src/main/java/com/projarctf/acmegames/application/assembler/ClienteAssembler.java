package com.projarctf.acmegames.application.assembler;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Individual;
import com.projarctf.acmegames.infraestructure.persistence.entity.ClienteEntity;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;

@Component
public final class ClienteAssembler {

    public static ClienteDTO toDto(Cliente cliente) {
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

}