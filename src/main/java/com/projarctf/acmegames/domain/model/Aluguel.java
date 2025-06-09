package com.projarctf.acmegames.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class Aluguel {
    private int identificador;
    private Date dataInicial;
    private int periodo;
}
