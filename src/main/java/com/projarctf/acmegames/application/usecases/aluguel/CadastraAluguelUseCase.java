 package com.projarctf.acmegames.application.usecases.aluguel;

 import com.projarctf.acmegames.application.assembler.AluguelAssembler;
 import com.projarctf.acmegames.application.dto.AluguelCreateDTO;
 import com.projarctf.acmegames.domain.model.cliente.Cliente;
 import com.projarctf.acmegames.domain.model.jogo.Jogo;
 import com.projarctf.acmegames.domain.service.AluguelService;
 import com.projarctf.acmegames.domain.service.ClienteService;
 import com.projarctf.acmegames.domain.service.JogoService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Component;
 import org.springframework.stereotype.Service;

 @Component
 public class CadastraAluguelUseCase {

     @Autowired
     private AluguelService aluguelService;

     @Autowired
     private ClienteService clienteService;

     @Autowired
     private JogoService jogoService;

     public boolean cadastraAluguel(AluguelCreateDTO aluguelCreateDTO){
         Cliente cliente = clienteService.getClientePorNumero(aluguelCreateDTO.getNumeroCliente());
         Jogo jogo = jogoService.getJogoPorCodigo(aluguelCreateDTO.getCodigoJogo());

         return aluguelService.cadastraAluguel(AluguelAssembler.CreateDTOtoDomain(aluguelCreateDTO, cliente,jogo));
     }
 }
