 package com.projarctf.acmegames.infraestructure.persistence.repository.aluguel;

 import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
 import com.projarctf.acmegames.domain.repository.IAluguelRepository;
 import lombok.Getter;
 import lombok.Setter;
 import org.springframework.stereotype.Repository;

 import java.util.List;

 @Getter
 @Setter
 @Repository
 public class AluguelJpaRepositoryImpl implements IAluguelRepository {

    private IAluguelJpaItf repository;

    public AluguelJpaRepositoryImpl(IAluguelJpaItf repository){
        this.repository = repository;
    }


   @Override
    public List<Aluguel> getAlugueis(){
        return repository.findAll();
   }
 }
