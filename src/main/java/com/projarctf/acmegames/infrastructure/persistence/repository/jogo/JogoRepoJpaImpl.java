package com.projarctf.acmegames.infrastructure.persistence.repository.jogo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.repository.IJogoRepository;
import com.projarctf.acmegames.infrastructure.persistence.entity.JogoEntity;
import com.projarctf.acmegames.infrastructure.mapper.JogoMapper;

@Repository
public class JogoRepoJpaImpl implements IJogoRepository {
    @Autowired
    private IJogoJpaItfRep repository;

    @Override
    public List<Jogo> getJogos() {
        List<JogoEntity> jogoEntities = repository.findAll();
        if (jogoEntities.size() == 0) {
            return new LinkedList<Jogo>();
        } else {
            List<Jogo> jogos = jogoEntities.stream()
            .map(jogoEntity -> JogoMapper.toDomain(jogoEntity))
            .toList();

            return jogos.stream().toList();
        }
    }

    @Override
    public Jogo getJogoByCodigo(int codigo) {
        return JogoMapper.toDomain(repository.findById(codigo));
    } 

    @Override
    public boolean cadastraJogo(Jogo jogo) {
        if (getJogoByCodigo(jogo.getCodigo()) != null) {
            return false; // Jogo já existe
        }

        JogoEntity jogoEntity = JogoMapper.toEntity(jogo);
        repository.save(jogoEntity);
        return true;
    }
}
