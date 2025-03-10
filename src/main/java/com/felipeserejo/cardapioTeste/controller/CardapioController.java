package com.felipeserejo.cardapioTeste.controller;

import com.felipeserejo.cardapioTeste.domain.Cardapio;
import com.felipeserejo.cardapioTeste.dto.CardapioDTO;
import com.felipeserejo.cardapioTeste.mapper.CardapioMapper;
import com.felipeserejo.cardapioTeste.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/cardapios")
public class CardapioController {

    @Autowired
    private CardapioService cardapioService;
    @Autowired
    private CardapioMapper cardapioMapper;

    @GetMapping
    public ResponseEntity<List<CardapioDTO>> findAllCardapios() {

        List<Cardapio> cardapios = cardapioService.findAll();
        List<CardapioDTO> cardapioDTO = new ArrayList<>();
        for (Cardapio cardapio : cardapios) {
            System.out.println(cardapio);
            cardapioDTO.add(new CardapioDTO(cardapio));
        }

        return ResponseEntity.ok(cardapioDTO);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CardapioDTO> findById(@PathVariable Long id) {
        Cardapio cardapio = cardapioService.findById(id);
        CardapioDTO cardapioDTO = new CardapioDTO(cardapio);
        return ResponseEntity.ok(cardapioDTO);
    }
}
