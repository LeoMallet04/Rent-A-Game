package com.projarctf.acmegames.infrastructure.mapper;

import java.util.ArrayList;

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

    public static JogoEntity toEntity(Jogo jogo) {
        if (jogo == null) {
            return null; // ou lançar uma exceção, dependendo do caso de uso
        }

        String tipo;

        if (jogo instanceof JogoEletronico) {
            tipo = ((JogoEletronico) jogo).getTipoEletronico().name();
        } else if (jogo instanceof JogoMesa) {
            tipo = ((JogoMesa) jogo).getTipoMesa().name();
        } else {
            throw new IllegalArgumentException("Tipo de jogo desconhecido");
        }

        JogoEntity jogoEntity = new JogoEntity(
            jogo.getCodigo(), 
            jogo.getNome(), 
            jogo.getValorBase(),
            tipo,
            jogo instanceof JogoEletronico ? ((JogoEletronico) jogo).getPlataforma() : null,
            jogo instanceof JogoMesa ? ((JogoMesa) jogo).getNumeroPecas() : null,
            new ArrayList<>() // nao precisa inicializar com jogos alugados pq o toEntity é usado apenas para salvar novos jogos
        );

        return jogoEntity;
    }
}