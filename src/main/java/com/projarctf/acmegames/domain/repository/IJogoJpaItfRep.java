package com.projarctf.acmegames.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public interface IJogoJpaItfRep extends CrudRepository<JogoEntity, Integer> {
    List<JogoEntity> findAll();
    JogoEntity findById(int codigo);
}
