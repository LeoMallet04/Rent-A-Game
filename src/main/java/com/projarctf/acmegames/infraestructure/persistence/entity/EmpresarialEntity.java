package com.projarctf.acmegames.infraestructure.persistence.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class EmpresarialEntity extends ClienteEntity {
    private String nomeFantasia;
    private String cnpj;

}
