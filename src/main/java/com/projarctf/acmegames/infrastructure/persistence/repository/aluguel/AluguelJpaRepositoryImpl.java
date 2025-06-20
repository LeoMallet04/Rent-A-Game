package com.projarctf.acmegames.infrastructure.persistence.repository.aluguel;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.repository.IAluguelRepository;
import com.projarctf.acmegames.infrastructure.mapper.AluguelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AluguelJpaRepositoryImpl implements IAluguelRepository {
    @Autowired
    private IAluguelJpaItfRep repository;

    public AluguelJpaRepositoryImpl(IAluguelJpaItfRep repository) {
        this.repository = repository;
    }

    @Override
    public List<Aluguel> getAlugueis() {
        return repository.findAll().stream().map(entity -> AluguelMapper.toModel(entity)).collect(Collectors.toList());
    }
}
