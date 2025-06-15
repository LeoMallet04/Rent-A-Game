package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class IndividualEntity extends ClienteEntity{
    private String cpf;

    protected IndividualEntity(){}
}
