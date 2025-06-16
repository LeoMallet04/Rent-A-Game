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
@Table(name = "cliente_empresarial")
public class EmpresarialEntity extends ClienteEntity {
    private String nomeFantasia;
    private String cnpj;

    protected EmpresarialEntity() {}
}
