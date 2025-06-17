package com.projarctf.acmegames.infraestructure.persistence.repository.mapper;

import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.infraestructure.persistence.entity.JogoEntity;

public class JogoMapper {
    public Jogo toDomain(JogoEntity jogoEntity) {
        Jogo jogo = new Jogo();
        jogo.setCodigo(jogoEntity.getCodigo());
        jogo.setNome(jogoEntity.getNome());
        jogo.setPreco(jogoEntity.getPreco());
        
        return jogo;
    }

    // public JogoEntity toEntity(Jogo jogo) {
    //     JogoEntity jogoEntity = new JogoEntity(jogo.getCodigo(), jogo.getNome(), jogo.getValorBase(), null);
        
    //     return jogoEntity;
    // }
}
