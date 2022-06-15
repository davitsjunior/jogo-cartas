package br.com.teste.koerich.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.teste.koerich.model.Round.enumStatus;

public class RoundTest {

	@Test
	void testRank() {
		
		Round round = new Round();
		
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

		testP1.sunScore();
		 
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1); 
		 
		round.rank(); 
		
		Assertions.assertEquals(enumStatus.EMPATE, round.getStatus());
	}
	
	@Test
	void testRank2() {

		Round round = new Round();

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

		testP1.sunScore();

		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1); 

		round.rank();  

		Assertions.assertEquals(enumStatus.VITORIA, round.getStatus());
	}
	
	@Test
	void testRank3() {

		Round round = new Round();

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

		testP1.sunScore();

		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		round.adicionarJogador(testP1);
		
		Player testP2 = new Player();
		List<Cards> listCards2 = new ArrayList<Cards>();
		CardsPlayer cardsPlayer2 = new CardsPlayer();
		
		for( int i= 0; i < 5; i++ ) {
			Cards cards = new Cards();
			cards.setValue("5");
			listCards2.add(cards);
		}
		
		cardsPlayer2.setCards(listCards2);

		testP2.setCards(cardsPlayer2);

		testP2.sunScore();
		
		round.adicionarJogador(testP2); 

		round.rank();  

		Assertions.assertEquals(enumStatus.VITORIA, round.getStatus());		
	}	
}
 