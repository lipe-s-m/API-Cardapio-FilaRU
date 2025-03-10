package com.felipeserejo.cardapioTeste.dto;

import com.felipeserejo.cardapioTeste.domain.Cardapio;
import org.springframework.beans.BeanUtils;

public class CardapioDTO {
    String pratoPrincipal;
    String pratoAlternativo;
    String opcaoVegetariana;
    String acompanhamento;
    String guarnicao;
    String salada;
    String sobremesa;

    public CardapioDTO(Cardapio cardapio) {
        BeanUtils.copyProperties(cardapio, this);
    }

    public CardapioDTO() {
    }


    //GETTERS AND SETTERS
    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getPratoAlternativo() {
        return pratoAlternativo;
    }

    public void setPratoAlternativo(String pratoAlternativo) {
        this.pratoAlternativo = pratoAlternativo;
    }

    public String getOpcaoVegetariana() {
        return opcaoVegetariana;
    }

    public void setOpcaoVegetariana(String opcaoVegetariana) {
        this.opcaoVegetariana = opcaoVegetariana;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getGuarnicao() {
        return guarnicao;
    }

    public void setGuarnicao(String guarnicao) {
        this.guarnicao = guarnicao;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }
}
