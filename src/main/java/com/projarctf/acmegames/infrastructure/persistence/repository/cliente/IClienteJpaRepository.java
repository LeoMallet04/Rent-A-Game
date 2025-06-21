package com.projarctf.acmegames.infrastructure.persistence.repository.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projarctf.acmegames.infrastructure.persistence.entity.ClienteEntity;

@Repository
public interface IClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {
}
