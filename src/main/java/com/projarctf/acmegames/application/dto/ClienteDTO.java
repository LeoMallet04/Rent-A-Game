package com.projarctf.acmegames.application.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private int numero;
    private String nome;
    private String endereco;
    private String tipo;
    private String cpf;
    private String nomeFantasia;
    private String cnpj;
}
