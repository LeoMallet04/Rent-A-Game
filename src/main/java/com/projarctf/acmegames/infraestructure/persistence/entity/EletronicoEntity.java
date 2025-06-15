package com.projarctf.acmegames.infraestructure.persistence.entity;

import com.projarctf.acmegames.domain.enums.TipoEletronico;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EletronicoEntity extends JogoEntity {
    private TipoEletronico tipo;
    private String plataforma;

    protected EletronicoEntity() {}
}
