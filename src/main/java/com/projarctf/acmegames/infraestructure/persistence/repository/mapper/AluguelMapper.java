package com.projarctf.acmegames.infraestructure.persistence.repository.mapper;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.infraestructure.persistence.entity.AluguelEntity;

import lombok.NoArgsConstructor;


@NoArgsConstructor
@Component
public class AluguelMapper {
    
    public static Aluguel toModel(AluguelEntity aluguelEntity){
        return new Aluguel(
            aluguelEntity.getIdentificador(),
            aluguelEntity.getDataInicial(),
            aluguelEntity.getPeriodo(),
            ClienteMapper.toDomain(aluguelEntity.getCliente()),
            JogoMapper.toDomain(aluguelEntity.getJogo())
            );
    }


}
