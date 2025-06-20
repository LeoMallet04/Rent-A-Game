package com.projarctf.acmegames.infrastructure.persistence.repository.aluguel;

import com.projarctf.acmegames.infrastructure.persistence.entity.AluguelEntity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface IAluguelJpaItfRep extends CrudRepository<AluguelEntity, Integer> {
    List<AluguelEntity> findAll();
}
