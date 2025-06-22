package com.projarctf.acmegames.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.projarctf.acmegames.domain.repository.IClienteRepository;
import com.projarctf.acmegames.domain.model.cliente.Cliente;

@Service  
public class ClienteService {
    @Autowired
    IClienteRepository clienteRepository;

    public List<Cliente> listClientes() {
        return clienteRepository.getClientes();
    }
    public boolean clienteExists(long numero) {
        return clienteRepository.getClienteByNumero(numero) != null;
    }
    public boolean cadastraCliente(Cliente cliente) {
        return clienteRepository.cadastraCliente(cliente);
    }
}
