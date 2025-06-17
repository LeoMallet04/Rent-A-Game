package com.projarctf.acmegames.domain.repository;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;

import java.util.List;

public interface IAluguelRepository {
    public List<Aluguel> getAlugueis();
}
