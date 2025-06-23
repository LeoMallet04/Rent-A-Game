package com.projarctf.acmegames.application.usecases.jogo;

import java.util.List;

import com.projarctf.acmegames.application.dto.AluguelClienteDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.assembler.AluguelAssembler;
import com.projarctf.acmegames.application.dto.AluguelDTO;
import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.service.ClienteService;

@Component
public class ListaAlugueisDoClienteUseCase {

    @Autowired
    private ClienteService clienteService;

    public List<AluguelClienteDTO> listarAlugueisDoCliente(int codigoCliente) {
        List<Aluguel> alugueis = clienteService.getAlugueisForCliente(codigoCliente);
        
        return alugueis.stream()
                .map(aluguel -> AluguelAssembler.toAluguelClienteDTO(aluguel))
                .toList();
    }
    
}
