package com.projarctf.acmegames.infraestructure.persistence.repository.aluguel;

import com.projarctf.acmegames.infraestructure.persistence.entity.AluguelEntity;
import org.springframework.data.repository.CrudRepository;

public interface IAluguelJpaItf extends CrudRepository<AluguelEntity, Integer> {
}
