package com.felipeserejo.cardapioTeste.domain;

import com.felipeserejo.cardapioTeste.dto.CardapioDTO;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "cardapio")
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pratoPrincipal;

    @Column(nullable = true)
    private String pratoAlternativo;
    private String opcaoVegetariana;
    private String acompanhamento;
    private String guarnicao;
    private String salada;
    private String sobremesa;

    public Cardapio(CardapioDTO cardapioDTO){
        BeanUtils.copyProperties(cardapioDTO, this);
    }

}

