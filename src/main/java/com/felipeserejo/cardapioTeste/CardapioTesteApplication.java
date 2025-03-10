package com.felipeserejo.cardapioTeste;

import com.felipeserejo.cardapioTeste.domain.Cardapio;
import com.felipeserejo.cardapioTeste.service.CardapioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class CardapioTesteApplication implements CommandLineRunner {

    @Autowired
    CardapioService cardapioService;

    @Autowired
    CriarCardapio criarCardapio;

    public static void main(String[] args) {
        SpringApplication.run(CardapioTesteApplication.class, args);
    }

    public CardapioTesteApplication() {
    }

    @Override
    public void run(String... args) throws Exception {
//        criarCardapio.gerarCardapio();
    }
}

@Component
class CriarCardapio {

    @Autowired
    CardapioService cardapioService;

    public CriarCardapio() {
    }

    public void gerarCardapio(){
        cardapioService.save(new Cardapio(
                null,
                "Frango assado",
                "",
                "Hambuguer de Soja",
                "Arroz branco / Feijão preto",
                "Farofa",
                "Macarronese",
                "Fruta")
        );
        cardapioService.save(new Cardapio(
                null,
                "Bife acebolado",
                "Ovo frito",
                "Hambúrguer de grão-de-bico",
                "Arroz integral / Feijão carioca",
                "Batata frita",
                "Salada de alface e tomate",
                "Gelatina"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Peixe grelhado",
                "Omelete de queijo",
                "Tofu temperado",
                "Arroz branco / Feijão preto",
                "Purê de batata",
                "Vinagrete",
                "Banana"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Frango à milanesa",
                "Legumes salteados",
                "Almôndega de lentilha",
                "Arroz branco / Feijão carioca",
                "Farofa de bacon",
                "Salada de rúcula",
                "Maçã"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Carne de panela",
                "Calabresa acebolada",
                "Quibe de abóbora",
                "Arroz branco / Feijão vermelho",
                "Polenta frita",
                "Salada de cenoura e beterraba",
                "Melancia"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Lasanha à bolonhesa",
                "Pão de alho",
                "Lasanha de espinafre",
                "Arroz branco",
                "Batata gratinada",
                "Salada de repolho",
                "Abacaxi"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Costela assada",
                "Linguiça toscana",
                "Escondidinho de cogumelos",
                "Arroz branco / Feijão preto",
                "Vinagrete",
                "Salada de alface americana",
                "Laranja"
        ));

        cardapioService.save(new Cardapio(
                null,
                "Strogonoff de frango",
                "Batata palha",
                "Strogonoff de palmito",
                "Arroz branco",
                "Purê de abóbora",
                "Salada de couve",
                "Pera"
        ));
    }
}