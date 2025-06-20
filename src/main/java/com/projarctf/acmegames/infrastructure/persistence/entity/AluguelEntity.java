package com.projarctf.acmegames.infrastructure.persistence.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "aluguel")
public class AluguelEntity {
    @Id
    private Integer identificador;
    private Date dataInicial;
    private int periodo;

    @ManyToOne
    @JoinColumn(name = "numero_cliente", nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "codigo_jogo", nullable = false)
    private JogoEntity jogo;

    protected AluguelEntity(){}
}