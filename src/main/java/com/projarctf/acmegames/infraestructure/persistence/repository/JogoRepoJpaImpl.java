package com.projarctf.acmegames.infraestructure.persistence.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projarctf.acmegames.domain.repository.IJogoJpaItfRep;
import com.projarctf.acmegames.domain.repository.IJogoRepository;
import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public class JogoRepoJpaImpl implements IJogoRepository {
    private IJogoJpaItfRep repository;

    @Autowired
    public JogoRepoJpaImpl(IJogoJpaItfRep repository) {
        this.repository = repository;
    }

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
