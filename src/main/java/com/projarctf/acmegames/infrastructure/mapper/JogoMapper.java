package com.projarctf.acmegames.infrastructure.mapper;

import com.projarctf.acmegames.domain.enums.TipoEletronico;
import com.projarctf.acmegames.domain.enums.TipoMesa;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import com.projarctf.acmegames.domain.model.jogo.JogoMesa;
import com.projarctf.acmegames.infrastructure.persistence.entity.JogoEntity;


public class JogoMapper {
    public static Jogo toDomain(JogoEntity jogoEntity) {
        if (jogoEntity == null) {
            return null; // ou lançar uma exceção, dependendo do caso de uso
        }

        if (jogoEntity.getPlataforma() != null) { // eletronico
            return new JogoEletronico(
                jogoEntity.getCodigo(), 
                jogoEntity.getNome(), 
                jogoEntity.getValorBase(), 
                TipoEletronico.valueOf(jogoEntity.getTipo()), 
                jogoEntity.getPlataforma()
            );
        } else {
           return new JogoMesa(
                jogoEntity.getCodigo(), 
                jogoEntity.getNome(), 
                jogoEntity.getValorBase(), 
                TipoMesa.valueOf(jogoEntity.getTipo()), 
                jogoEntity.getNumeroPecas()
            ); 
        }
    }
}