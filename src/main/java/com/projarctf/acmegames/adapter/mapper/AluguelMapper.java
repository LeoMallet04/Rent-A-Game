package com.projarctf.acmegames.adapter.mapper;

import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.infraestructure.persistence.entity.AluguelEntity;

public class AluguelMapper {

    public static Aluguel toModel(AluguelEntity aluguelEntity){
        return new Aluguel(
                aluguelEntity.getIdentificador(),
                aluguelEntity.getDataInicial(),
                aluguelEntity.getPeriodo(),
                ClienteMapper.toDomain(aluguelEntity.getCliente()),
                aluguelEntity.getJogo()
        );
    }

   public static AluguelDTO toDTO(Aluguel aluguel){
       return AluguelDTO.builder()
               .indentificador(aluguel.getIdentificador())
               .dataInicial(aluguel.getDataInicial())
               .periodo(aluguel.getPeriodo())
               .cliente(aluguel.getCliente())
               .jogo(aluguel.getJogo())
               .build();
   }
}
