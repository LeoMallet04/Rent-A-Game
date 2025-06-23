package com.projarctf.acmegames.domain.repository;

import java.util.List;
import com.projarctf.acmegames.domain.model.cliente.Cliente;

public interface IClienteRepository {
    List<Cliente> getClientes();
    Cliente getClienteByNumero(int numero);
    boolean cadastraCliente(Cliente cliente);
}

