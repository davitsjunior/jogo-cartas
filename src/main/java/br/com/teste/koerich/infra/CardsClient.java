package br.com.teste.koerich.infra;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.teste.koerich.model.CardsPlayer;

@FeignClient(name = "cardsClient", url = "https://deckofcardsapi.com/api/deck/")
public interface CardsClient {
	
	@GetMapping(value = "/{id}/draw/?count=5")
	CardsPlayer getCardsPlayer(@PathVariable("id") String id);
}
