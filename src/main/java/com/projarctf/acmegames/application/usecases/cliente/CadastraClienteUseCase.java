package com.projarctf.acmegames.application.usecases.cliente;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.projarctf.acmegames.application.assembler.ClienteAssembler;
import com.projarctf.acmegames.application.dto.ClienteDTO;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.service.ClienteService;

@Component
public class CadastraClienteUseCase {
    @Autowired
    private ClienteService clienteService;

    public boolean cadastraCliente(ClienteDTO clienteDTO) {
        Cliente domainObject = ClienteAssembler.toDomain(clienteDTO);
        
        if (domainObject == null) {
            System.out.println("Tipo de cliente não suportado.");
            return false;
        }
        if (clienteService.clienteExists(domainObject.getNumero())) {
            System.out.println("Cliente já cadastrado.");
            return false;
        }
        if (domainObject.getNumero() <= 0) {
            System.out.println("Número do cliente inválido.");
            return false;
        }
        return clienteService.cadastraCliente(domainObject);
    }
}
