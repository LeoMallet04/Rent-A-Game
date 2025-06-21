package com.projarctf.acmegames.infrastructure.persistence.repository.jogo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.domain.repository.IJogoRepository;
import com.projarctf.acmegames.infrastructure.persistence.entity.JogoEntity;

@Repository
public class JogoRepoJpaImpl implements IJogoRepository {
    @Autowired
    private IJogoJpaItfRep repository;

    @Override
    public List<JogoEntity> getJogos() {
        List<JogoEntity> jogos = repository.findAll();
        if (jogos.size() == 0)
            return new LinkedList<JogoEntity>();
        else
            return jogos.stream().toList();
    }

    @Override
    public JogoEntity getJogoByCodigo(int codigo) {
        return repository.findById(codigo);
    }  
}
