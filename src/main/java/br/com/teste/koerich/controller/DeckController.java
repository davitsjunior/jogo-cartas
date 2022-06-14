package br.com.teste.koerich.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.koerich.model.DeckId;
import br.com.teste.koerich.service.DeckService;

@RestController
@RequestMapping("/deck")
public class DeckController {
	
	@Autowired
	private DeckService deckService;
	
	@GetMapping
	public ResponseEntity<DeckId> buscarDeckId(Model model) {
		
		DeckId deck = deckService.getIdeck();
		
		model.addAttribute("deck_id", deck.getDeck_id());
		
		return new ResponseEntity<DeckId>(deck, HttpStatus.OK);	 
	} 
	

}