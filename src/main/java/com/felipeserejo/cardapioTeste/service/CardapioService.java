package com.felipeserejo.cardapioTeste.service;

import com.felipeserejo.cardapioTeste.domain.Cardapio;
import com.felipeserejo.cardapioTeste.repository.CardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardapioService {

    @Autowired
    CardapioRepository cardapioRepository;


    public List<Cardapio> findAll(){
        return cardapioRepository.findAll();
    }
    public Cardapio findById(Long id){
        Optional<Cardapio> cardapio = cardapioRepository.findById(id);
        return cardapio.get();
    }
    public void save(Cardapio cardapio){
        cardapioRepository.save(cardapio);
    }
}
