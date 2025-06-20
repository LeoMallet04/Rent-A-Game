package com.projarctf.acmegames.domain.repository;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import java.util.List;

public interface IClienteRepository {
    List<Cliente> findAllClientes();
}

