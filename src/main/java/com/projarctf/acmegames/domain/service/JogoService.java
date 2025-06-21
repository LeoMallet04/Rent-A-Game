package com.projarctf.acmegames.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.repository.IJogoRepository;

@Service
public class JogoService {
    @Autowired
    IJogoRepository jogoRepository;

    public List<Jogo> listJogos() {
        return jogoRepository.getJogos();
    }

    public boolean jogoExists(int codigo) {
        return jogoRepository.getJogoByCodigo(codigo) != null;
    }

    public boolean cadastraJogo(Jogo jogo) {
        return jogoRepository.cadastraJogo(jogo);
    }
}
