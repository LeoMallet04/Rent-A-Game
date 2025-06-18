package com.projarctf.acmegames.application.assembler;

import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.model.aluguel.Aluguel;

public class AluguelAssembler {

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
}
