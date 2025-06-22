 package com.projarctf.acmegames.domain.service;

 import com.projarctf.acmegames.application.dto.AluguelDTO;
 import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
 import com.projarctf.acmegames.domain.repository.IAluguelRepository;
 import com.projarctf.acmegames.domain.repository.IJogoRepository;
 import com.projarctf.acmegames.infrastructure.persistence.repository.aluguel.AluguelJpaRepositoryImpl;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import org.springframework.stereotype.Service;

 import java.util.List;

 @Component
 public class AluguelService {

     @Autowired
     private IAluguelRepository aluguelRepository;

     public List<Aluguel> listAlugueis(){
         return aluguelRepository.getAlugueis();
     }

     public boolean cadastraAluguel(Aluguel aluguel){
         return aluguelRepository.cadastraAluguel(aluguel);
     }

     public boolean validaAluguel(int identificador){
        if(aluguelRepository.findAluguelById(identificador) != null){
            return true;
        }
        return false;
     }

//     public double getValorAluguelPorJogo(int codigo){
//         return aluguelRepository.getValorAluguelPorJogo(codigo);
//     }
 }
 