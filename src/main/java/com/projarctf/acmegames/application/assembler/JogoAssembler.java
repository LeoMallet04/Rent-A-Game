package com.projarctf.acmegames.application.assembler;

import org.springframework.stereotype.Component;

import com.projarctf.acmegames.application.dto.JogoDTO;
import com.projarctf.acmegames.domain.enums.TipoEletronico;
import com.projarctf.acmegames.domain.enums.TipoMesa;
import com.projarctf.acmegames.domain.model.jogo.Jogo;
import com.projarctf.acmegames.domain.model.jogo.JogoEletronico;
import com.projarctf.acmegames.domain.model.jogo.JogoMesa;

@Component
public final class JogoAssembler {
    public Jogo dtoToDomain(JogoDTO dto) {
        if (dto.getPlataforma() != null) {
            return dtoToEletronico(dto);
        } else if (dto.getNumeroPecas() != null) {
            return dtoToMesa(dto);
        }

        return null; // Tipo de jogo não suportado
    }

    public JogoDTO domainToDTO(Jogo domain) {
        if (domain instanceof JogoEletronico) {
            return eletronicoToDTO((JogoEletronico) domain);
        } else if (domain instanceof JogoMesa) {
            return mesaToDTO((JogoMesa) domain);
        }

        return null; // Tipo de jogo não suportado
    }

    private JogoEletronico dtoToEletronico(JogoDTO dto) {
        JogoEletronico jogo = new JogoEletronico(
            dto.getCodigo(),
            dto.getNome(),
            dto.getValorBase(),
            TipoEletronico.valueOf(dto.getTipo()),
            dto.getPlataforma()
        );

        return jogo;
    }

    private JogoMesa dtoToMesa(JogoDTO dto) {
        JogoMesa jogo = new JogoMesa(
            dto.getCodigo(),
            dto.getNome(),
            dto.getValorBase(),
            TipoMesa.valueOf(dto.getTipo()),
            dto.getNumeroPecas()
        );

        return jogo;
    }
    
    private JogoDTO eletronicoToDTO(JogoEletronico jogo) {
        JogoDTO dto = new JogoDTO(
            jogo.getCodigo(),
            jogo.getNome(),
            jogo.getValorBase(),
            jogo.calculaValorAluguel(),
            jogo.getTipoEletronico().name(),
            jogo.getPlataforma(),
            null
        );

        return dto;
    }

    private JogoDTO mesaToDTO(JogoMesa jogo) {
        JogoDTO dto = new JogoDTO(
            jogo.getCodigo(),
            jogo.getNome(),
            jogo.getValorBase(),
            jogo.calculaValorAluguel(),
            jogo.getTipoMesa().name(),
            null,
            jogo.getNumeroPecas()
        );

        return dto;
    }
}
