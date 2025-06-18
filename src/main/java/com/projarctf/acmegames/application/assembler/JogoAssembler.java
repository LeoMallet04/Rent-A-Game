package com.projarctf.acmegames.application.assembler;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.dto.JogoEletronicoDTO;
import com.projarctf.acmegames.application.dto.JogoMesaDTO;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import com.projarctf.acmegames.domain.model.jogo.JogoMesa;

@Component
public class JogoAssembler {
    public JogoEletronicoDTO eletronicoToDTO(JogoEletronico jogo) {
        JogoEletronicoDTO dto = new JogoEletronicoDTO(
            jogo.getCodigo(),
            jogo.getNome(),
            jogo.getValorBase(),
            jogo.calculaValorAluguel(),
            jogo.getTipoEletronico(),
            jogo.getPlataforma()
        );

        return dto;
    }

    public JogoMesaDTO mesaToDTO(JogoMesa jogo) {
        JogoMesaDTO dto = new JogoMesaDTO(
            jogo.getCodigo(),
            jogo.getNome(),
            jogo.getValorBase(),
            jogo.calculaValorAluguel(),
            jogo.getTipoMesa(),
            jogo.getNumeroPecas()
        );

        return dto;
    }
}