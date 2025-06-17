package com.projarctf.acmegames.application.dto;

import lombok.Builder;

@Builder
public record JogoDTO(
        int codigo,
        String nome,
        double valorBase
) {}
