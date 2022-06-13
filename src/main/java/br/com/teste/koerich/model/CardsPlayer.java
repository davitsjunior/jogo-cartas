package br.com.teste.koerich.model;

import java.util.List;

import lombok.Data;

@Data

public class CardsPlayer {

	private String deck_id;
	private List<Cards> cards;

	public CardsPlayer(String deck_id, List<Cards> cards) {
		super();
		this.deck_id = deck_id;
		this.cards = cards;
	}

	public CardsPlayer() {
		super();
	}


}

