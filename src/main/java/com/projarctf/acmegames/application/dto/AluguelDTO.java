package com.projarctf.acmegames.application.dto;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AluguelDTO{
    private int identificador;
    private Date dataInicial;
    private int periodo;

    private Cliente cliente;
    private Jogo jogo;

    private double valorFinal;

}
