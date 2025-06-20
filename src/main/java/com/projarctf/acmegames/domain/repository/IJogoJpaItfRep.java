package com.projarctf.acmegames.domain.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

@Repository
public interface IJogoJpaItfRep extends CrudRepository<JogoEntity, Integer> {
    List<JogoEntity> findAll();
    JogoEntity findById(int codigo);
}
