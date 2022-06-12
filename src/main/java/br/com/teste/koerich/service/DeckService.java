package br.com.teste.koerich.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.koerich.infra.DeckIdClient;
import br.com.teste.koerich.model.DeckId;

@Service
public class DeckService {

	@Autowired
	private DeckIdClient deckIdClient;
	
	public DeckId getIdeck() {
		return deckIdClient.getDeckId();
	}
}
