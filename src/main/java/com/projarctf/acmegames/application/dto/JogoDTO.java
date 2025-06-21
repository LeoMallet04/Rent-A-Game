package com.projarctf.acmegames.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JogoDTO {
    private int codigo;
    private String nome;
    private double valorBase;
    private double valorAluguel;
    private String tipo;
    private String plataforma;
    private Integer numeroPecas;
}
