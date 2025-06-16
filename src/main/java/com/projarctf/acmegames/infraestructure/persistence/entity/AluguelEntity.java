package com.projarctf.acmegames.infraestructure.persistence.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class AluguelEntity {

    @Id
    @GeneratedValue
    private int identificador;
    private Date dataInicial;
    private int periodo;

    @ManyToOne
    @JoinColumn(name = "cliente_numero", nullable = false)
    private ClienteEntity cliente;
    @ManyToOne
    @JoinColumn(name = "jogo_codigo", nullable = false)
    private JogoEntity jogo;

    protected AluguelEntity(){}
}
