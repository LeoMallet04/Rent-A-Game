package com.projarctf.acmegames.infrastructure.persistence.repository.aluguel;

import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
import com.projarctf.acmegames.domain.repository.IAluguelRepository;
import com.projarctf.acmegames.infrastructure.mapper.AluguelMapper;

import com.projarctf.acmegames.infrastructure.persistence.entity.AluguelEntity;
import com.projarctf.acmegames.infrastructure.persistence.repository.jogo.IJogoJpaItfRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class AluguelJpaRepositoryImpl implements IAluguelRepository {
    @Autowired
    private IAluguelJpaItfRep aluguelRepository;

    @Autowired
    private IJogoJpaItfRep jogoRepository;

    public AluguelJpaRepositoryImpl(IAluguelJpaItfRep aluguelRepository) {
        this.aluguelRepository = aluguelRepository;
    }

    @Override
    public List<Aluguel> getAlugueis() {
        return aluguelRepository.findAll().stream().map(AluguelMapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public boolean cadastraAluguel(Aluguel aluguel){
        if(aluguelRepository.findById(aluguel.getIdentificador()) != null){
            return false;
        }

        AluguelEntity aluguelEntity = AluguelMapper.toEntity(aluguel);
        aluguelRepository.save(aluguelEntity);
        return true;
    }

    @Override
    public Aluguel findAluguelById(int identificador){
            return AluguelMapper.toDomain(aluguelRepository.findById(identificador));
    }

//    @Override
//    public double getValorAluguelPorJogo(int codigoJogo){
//        double valorAluguel = 0;
//        if(jogoRepository.findById(codigoJogo) != null){
//            valorAluguel = jogoRepository.findById(codigoJogo).getValorBase();
//        }
//        return valorAluguel;
//    }

}
