package com.projarctf.acmegames.domain.repository;

import java.util.List;

import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public interface IJogoRepository {
    List<JogoEntity> getJogos();
    JogoEntity getJogoByCodigo(int codigo);
}
