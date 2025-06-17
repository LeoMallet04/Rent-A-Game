package com.projarctf.acmegames.application.dto;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import lombok.Builder;

import java.util.Date;

@Builder
public record AluguelDTO(
        int indentificador,
        Date dataInicial,
        int periodo,
        Cliente cliente,
        Jogo jogo
) {}
