package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

import java.util.List;

@Repository
public interface IClienteJpaItfRep extends CrudRepository<ClienteEntity, Long> {
    List<ClienteEntity> findAll();
    ClienteEntity findByNumero(Long numero);
    boolean existsByCpf(String cpf);
    boolean existsByCnpj(String cnpj);
}
