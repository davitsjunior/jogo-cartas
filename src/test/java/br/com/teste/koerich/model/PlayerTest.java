package br.com.teste.koerich.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest { 
	
	@Test
	void testeSunScore() {

		Player testP1 = new Player();
		List<Cards> listCards = new ArrayList<Cards>();
		CardsPlayer cardsPlayer = new CardsPlayer();
		
		for( int i= 0; i < 5; i++ ) {
			Cards cards = new Cards();
			cards.setValue("2");
			listCards.add(cards);
		}
		cardsPlayer.setCards(listCards);
		
		testP1.setCards(cardsPlayer);
		Assertions.assertEquals(10, testP1.sunScore()); 
	}
	
	@Test
	void testRegras1() {
		
		Player testP1 = new Player();
		List<Cards> listCards = new ArrayList<Cards>();
		CardsPlayer cardsPlayer = new CardsPlayer();
		
		for( int i= 0; i < 3; i++ ) {
			Cards cards = new Cards();
			cards.setValue("1");
			listCards.add(cards);
		}
		Cards cardsA = new Cards();
		Cards cardsK = new Cards();
		
		cardsA.setValue("ACE");
		cardsK.setValue("KING");
		
		listCards.add(cardsA);
		listCards.add(cardsK);
		
		cardsPlayer.setCards(listCards);
		
		testP1.setCards(cardsPlayer);
		Assertions.assertEquals(17, testP1.sunScore());
		
	}
	
	@Test
	void testRegras2() {
		
		Player testP1 = new Player();
		List<Cards> listCards = new ArrayList<Cards>();
		CardsPlayer cardsPlayer = new CardsPlayer();
		
		for( int i= 0; i < 3; i++ ) {
			Cards cards = new Cards();
			cards.setValue("1");
			listCards.add(cards);
		}
		Cards cardsA = new Cards();
		Cards cardsK = new Cards();
		 
		cardsA.setValue("QUEEN");
		cardsK.setValue("JACK");
		
		listCards.add(cardsA);
		listCards.add(cardsK);
		
		cardsPlayer.setCards(listCards);
		
		testP1.setCards(cardsPlayer);
		Assertions.assertEquals(26, testP1.sunScore());
		
	}
}
