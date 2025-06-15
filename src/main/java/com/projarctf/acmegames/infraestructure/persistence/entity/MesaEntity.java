package com.projarctf.acmegames.infraestructure.persistence.entity;

import com.projarctf.acmegames.domain.enums.TipoMesa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MesaEntity extends JogoEntity {
    private TipoMesa tipo;
    private int numeroPecas;

    protected MesaEntity(){}
}
