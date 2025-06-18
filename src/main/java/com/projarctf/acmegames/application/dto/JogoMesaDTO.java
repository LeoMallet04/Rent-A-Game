package com.projarctf.acmegames.application.dto;

import com.projarctf.acmegames.domain.enums.TipoMesa;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JogoMesaDTO {
    private int codigo;
    private String nome;
    private double valorBase;
    private double valorAluguel;
    private TipoMesa tipo;
    private int numeroPecas;
}