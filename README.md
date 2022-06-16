## Teste Vaga Desenvolvedor - Koerich

Projeto escrito para resolução do teste/desafio para integrar a equipe de desenvolvimento Koerich.

O desafio consiste em criar um baralho (utilizando a API disponível no fim do arquivo) e
montar quatro “mãos” com 5 cartas cada uma, verificando qual “mão” tem a maior
somatória. Se houver empate, retornar todos os jogadores na tela.

## Funcionalidades

Endpoints disponibilizados para validação do teste::

* Busca o ID do Deck de Cartas: `GET/deck`
* Executa uma rodada do jogo: `GET/round/{deckId}`

### API

`GET/deck`

Busca o ID do Deck para distribuição de cartass

**Body:**

```json
{
  "deck_id":"DECK_ID"
}
```

**Dados:**

`deck_id` - identificador do deck.

**STATUS:**

* 200 - Requisição realizada com sucesso.
* 500 - Excessão encontrada durante a execução.


`GET/round/{deckId}`

Executa uma rodada do jogo com 4 jogadores com 5 cartas do deck

**Body:**

```json
{"players":
  [
    {
      "id":0,
      "name":"PLAYER 0",
      "cards":{
        "deck_id":"9pxmvqqpwl55",
        "cards":[
          {
            "image":"https://deckofcardsapi.com/static/img/9S.png",
            "value":9
          },
          {
            "image":"https://deckofcardsapi.com/static/img/0D.png",
            "value":10
          },
          {
            "image":"https://deckofcardsapi.com/static/img/8S.png",
            "value":8
          },
          {
            "image":"https://deckofcardsapi.com/static/img/8C.png",
            "value":8
          },
          {
            "image":"https://deckofcardsapi.com/static/img/QD.png",
            "value":12
          }
        ]
      },
      "score":47
    }
  ],
  "status":"VITORIA"
}
```
**Dados:**

`players` - Lista de jogadores. Pode conter Apenas 1 em caso de vitória ou 4 em caso de empate.

`players[i].id` - Identificador do jogador

`players[i].name` - Nome do jogador

`players[i].cards` - Encapsula as Cartas do jogador + deck

`players[i].cards.deck_id` - Deck qual as cartas pertencem

`players[i].cards.cards` - Cartas do jogador

`players[i].cards.cards[i].image` - Representação da carta(imagem)

`players[i].cards.cards[i].value` - Valor da carta

`status` - Resultado do Jogo(EMPATE OU VITORIA)

**STATUS:**

* 200 - Requisição realizada com sucesso.
* 500 - Excessão encontrada durante a execução.

### Tecnologias utilizadas

* **Java**
* **Spring Boot**
* **Feign**
* **Maven**
* **JUnit**
* **Swagger**


### Executar
```bash
mvn spring-boot:run
```

### Documentação

[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)