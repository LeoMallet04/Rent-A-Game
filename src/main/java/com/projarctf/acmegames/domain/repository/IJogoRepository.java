package com.projarctf.acmegames.domain.repository;

import java.util.List;

import com.projarctf.acmegames.domain.model.jogo.Jogo;

public interface IJogoRepository {
    List<Jogo> getJogos();
    Jogo getJogoByCodigo(int codigo);
    boolean cadastraJogo(Jogo jogo);
}
