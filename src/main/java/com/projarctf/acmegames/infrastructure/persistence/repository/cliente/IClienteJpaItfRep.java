package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import org.springframework.data.repository.CrudRepository;

import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

import java.util.List;

public interface IClienteJpaItfRep extends CrudRepository<ClienteEntity, Long> {
    public List<ClienteEntity> findAll();
}
