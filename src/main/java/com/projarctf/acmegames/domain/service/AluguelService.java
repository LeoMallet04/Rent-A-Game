 package com.projarctf.acmegames.domain.service;


 import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
 import com.projarctf.acmegames.domain.repository.IAluguelRepository;


 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import org.springframework.stereotype.Service;


 import java.util.List;

@Service
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
         return aluguelRepository.findAluguelById(identificador) != null;
     }

     public double getValorFinalAluguel(int identificador){
         double valorFinal = 0;
         Aluguel aluguel = aluguelRepository.findAluguelById(identificador);
         if(aluguel != null){
             valorFinal = aluguel.calcularValorAluguel();
         }
         return valorFinal;
     }
}
