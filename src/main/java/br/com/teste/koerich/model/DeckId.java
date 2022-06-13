package br.com.teste.koerich.model;

import lombok.Data;

@Data
public class DeckId {
	
	private String deck_id;//Identificador do Deck para distribuição de cartas

	public DeckId(String deck_id) {
		super();
		this.deck_id = deck_id;
	}
	
	public DeckId() {
		
	}

}
