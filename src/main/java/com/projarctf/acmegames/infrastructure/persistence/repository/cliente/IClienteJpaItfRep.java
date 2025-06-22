package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

import java.util.List;

@Repository
public interface IClienteJpaItfRep extends CrudRepository<ClienteEntity, Long> {
    public List<ClienteEntity> findAll();
    public ClienteEntity findByNumero(Long numero);
}
