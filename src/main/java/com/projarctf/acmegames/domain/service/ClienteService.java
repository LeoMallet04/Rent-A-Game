package com.projarctf.acmegames.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.projarctf.acmegames.domain.repository.IAluguelRepository;
import com.projarctf.acmegames.domain.repository.IClienteRepository;
import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.model.cliente.Cliente;

@Service  
public class ClienteService {
    @Autowired
    IClienteRepository clienteRepository;

    @Autowired
    IAluguelRepository aluguelRepository;

    public List<Cliente> listClientes() {
        return clienteRepository.getClientes();
    }
    public boolean clienteExists(int numero) {
        return clienteRepository.getClienteByNumero(numero) != null;
    }

    public Cliente getClientePorNumero(int numero){
        return clienteRepository.getClienteByNumero(numero);
    }

    public boolean cadastraCliente(Cliente cliente) {
        return clienteRepository.cadastraCliente(cliente);
    }

    public List<Aluguel> getAlugueisForCliente(int codigo) {
        return aluguelRepository.getAlugueis().stream()
                .filter(aluguel -> aluguel.getCliente().getNumero() == codigo)
                .toList();
    }

}
