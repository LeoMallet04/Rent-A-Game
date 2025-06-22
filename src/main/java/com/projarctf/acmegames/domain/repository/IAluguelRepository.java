package com.projarctf.acmegames.domain.repository;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;

import java.util.List;

public interface IAluguelRepository {
    List<Aluguel> getAlugueis();

    boolean cadastraAluguel(Aluguel aluguel);

    Aluguel findAluguelById(int identificador);

//    double getValorAluguelPorJogo(int codigoJogo);
}
