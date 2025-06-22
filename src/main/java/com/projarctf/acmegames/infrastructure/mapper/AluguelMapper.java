package com.projarctf.acmegames.infrastructure.mapper;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.infrastructure.persistence.entity.AluguelEntity;

import lombok.NoArgsConstructor;

import java.sql.Date;


@NoArgsConstructor
@Component
public class AluguelMapper {
    
    public static Aluguel toDomain(AluguelEntity aluguelEntity){
        if(aluguelEntity == null){
            return null;
        }

        return new Aluguel(
            aluguelEntity.getIdentificador(),
            aluguelEntity.getDataInicial(),
            aluguelEntity.getPeriodo(),
            ClienteMapper.toDomain(aluguelEntity.getCliente()),
            JogoMapper.toDomain(aluguelEntity.getJogo())
            );
    }

    public static AluguelEntity toEntity(Aluguel aluguel){
        if(aluguel == null){
            return null;
        }

        return new AluguelEntity(
                aluguel.getIdentificador(),
                new Date(aluguel.getDataInicial().getTime()),
                aluguel.getPeriodo(),
                ClienteMapper.toEntity(aluguel.getCliente()),
                JogoMapper.toEntity(aluguel.getJogo())

        );
    }
}
