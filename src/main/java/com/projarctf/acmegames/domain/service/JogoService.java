package com.projarctf.acmegames.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.infrastructure.persistence.entity.JogoEntity;
import com.projarctf.acmegames.infrastructure.persistence.repository.jogo.JogoRepoJpaImpl;
import com.projarctf.acmegames.infrastructure.mapper.JogoMapper;

@Service
public class JogoService {
    @Autowired
    JogoRepoJpaImpl jogoRepository;

    public List<Jogo> listJogos() {
        List<JogoEntity> jogoEntities = jogoRepository.getJogos();

        List<Jogo> jogos = jogoEntities.stream()
            .map(jogoEntity -> JogoMapper.toDomain(jogoEntity))
            .toList();

        return jogos;
    }
}
