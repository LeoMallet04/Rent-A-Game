 package com.projarctf.acmegames.domain.service;


 import com.projarctf.acmegames.domain.model.aluguel.Aluguel;
 import com.projarctf.acmegames.domain.repository.IAluguelRepository;


 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;


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
         return aluguelRepository.findAluguelById(identificador) != null;
     }

//     public double getValorAluguelPorJogo(int codigo){
//         return aluguelRepository.getValorAluguelPorJogo(codigo);
//     }
 }
 