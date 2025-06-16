package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name="codigo")
public class EmpresarialEntity extends ClienteEntity {
    private String nomeFantasia;
    private String cnpj;

    protected EmpresarialEntity() {}
}
