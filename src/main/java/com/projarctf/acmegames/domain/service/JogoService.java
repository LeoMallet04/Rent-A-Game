package com.projarctf.acmegames.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.repository.IAluguelRepository;
import com.projarctf.acmegames.domain.repository.IJogoRepository;

@Service
public class JogoService {
    @Autowired
    IJogoRepository jogoRepository;

    @Autowired
    IAluguelRepository aluguelRepository;

    public List<Jogo> listJogos() {
        return jogoRepository.getJogos();
    }

    public boolean jogoExists(int codigo) {
        return jogoRepository.getJogoByCodigo(codigo) != null;
    }

    public Jogo getJogoPorCodigo(int codigo){
        return jogoRepository.getJogoByCodigo(codigo);
    }

    public boolean cadastraJogo(Jogo jogo) {
        return jogoRepository.cadastraJogo(jogo);
    }

    public List<Aluguel> getAlugueisForJogo(int codigo) {
        return aluguelRepository.getAlugueis().stream()
                .filter(aluguel -> aluguel.getJogo().getCodigo() == codigo)
                .toList();
    }
}
