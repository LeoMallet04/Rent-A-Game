package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name="numero")
public class IndividualEntity extends ClienteEntity{
    private String cpf;

    protected IndividualEntity(){}
}
