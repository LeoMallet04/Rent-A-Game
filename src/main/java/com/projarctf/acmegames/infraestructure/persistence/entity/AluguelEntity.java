package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class AluguelEntity {

    @Id
    @GeneratedValue
    private int identificador;
    private Date dataInicial;
    private int periodo;
}
