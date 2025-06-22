package com.projarctf.acmegames.application.assembler;

import com.projarctf.acmegames.application.dto.AluguelCreateDTO;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import org.springframework.stereotype.Component;

@Component
public final class AluguelAssembler {

  public static AluguelDTO toDTO(Aluguel aluguel){
      return new AluguelDTO(
        aluguel.getIdentificador(),
        aluguel.getDataInicial(),
        aluguel.getPeriodo(),
        aluguel.getCliente(),
        aluguel.getJogo(),
        aluguel.calcularValorAluguel()
      );
  }

  public static Aluguel CreateDTOtoDomain(AluguelCreateDTO aluguelCreateDTO, Cliente cliente, Jogo jogo){
      return new Aluguel(
              aluguelCreateDTO.getIdentificador(),
              aluguelCreateDTO.getDataInicial(),
              aluguelCreateDTO.getPeriodo(),
              cliente,
              jogo
      );
  }

  // public static Aluguel toDomain(AluguelDTO aluguelDTO){
  //   return new Aluguel(
  //     aluguelDTO.getIdentificador(),
  //     aluguelDTO.
  //   )
  // }
}
