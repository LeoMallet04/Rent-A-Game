package com.projarctf.acmegames.adapter.mapper;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.cliente.Empresarial;
import com.projarctf.acmegames.infraestructure.persistence.entity.ClienteEntity;
import com.projarctf.acmegames.infraestructure.persistence.entity.EmpresarialEntity;

public class ClienteMapper {

    public static Cliente toDomain(ClienteEntity clienteEntity){
        if(clienteEntity instanceof EmpresarialEntity empresarialEntity){
            return new Empresarial(
                    empresarialEntity.getNomeFantasia(),
                    empresarialEntity.getCnpj()

            )
        }

        return new Cliente(
                clienteEntity.getNumero(),
                clienteEntity.getNome(),
                clienteEntity.getEndereco()
        );
    }
}
