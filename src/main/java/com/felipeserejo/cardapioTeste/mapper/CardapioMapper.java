package com.felipeserejo.cardapioTeste.mapper;

import com.felipeserejo.cardapioTeste.domain.Cardapio;
import com.felipeserejo.cardapioTeste.dto.CardapioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardapioMapper {
    CardapioDTO oResponse(Cardapio cardapio);
    Cardapio toEntity(CardapioDTO request);
}
