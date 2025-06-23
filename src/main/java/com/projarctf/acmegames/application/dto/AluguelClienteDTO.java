package com.projarctf.acmegames.application.dto;

import com.projarctf.acmegames.domain.model.cliente.Cliente;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AluguelClienteDTO {
    private int numeroCliente;
    private int identificador;
    private Date dataInicial;
    private int periodo;

    private int codigoJogo;

}