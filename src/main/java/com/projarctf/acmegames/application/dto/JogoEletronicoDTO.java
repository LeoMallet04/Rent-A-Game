package com.projarctf.acmegames.application.dto;

import com.projarctf.acmegames.domain.enums.TipoEletronico;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JogoEletronicoDTO {
    private int codigo;
    private String nome;
    private double valorBase;
    private double valorAluguel;
    private TipoEletronico tipo;
    private String plataforma;
}
