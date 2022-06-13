package br.com.teste.koerich.infra;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.teste.koerich.model.DeckId;

@FeignClient (value = "deckIdClient", url = "https://deckofcardsapi.com/api/deck/new/shuffle")
public interface DeckIdClient {
	
	@GetMapping(value = "/?deck_count=1")
	DeckId getDeck_Id();

}
