package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name="numero")
@Table(name = "cliente_individual")
public class IndividualEntity extends ClienteEntity{
    private String cpf;

    protected IndividualEntity(){}
}
