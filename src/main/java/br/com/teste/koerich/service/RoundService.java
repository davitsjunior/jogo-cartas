package br.com.teste.koerich.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.teste.koerich.infra.CardsClient;
import br.com.teste.koerich.model.CardsPlayer;
import br.com.teste.koerich.model.Player;
import br.com.teste.koerich.model.Round;

@Service
public class RoundService{

	@Autowired
	private CardsClient cardsClient;
		
	public Round distCards(String id) throws Exception {
		
		Round round = new Round();
				
		try {
			for (int i = 0; i < 4; i++) {
				CardsPlayer cardsPlayer = cardsClient.getCardsPlayer(id);
				
				if (cardsPlayer.getCards().size() < 5) {
					throw new Exception("Baralho insuficiente! Gere novo Deck_Id");
				}
				Player p1 = new Player();
				
				p1.setId(i);
				p1.setName("PLAYER " + i);
				p1.setCards(cardsPlayer);
				p1.sunScore();
				
				round.adicionarJogador(p1);	 	 	
			}
			round.rank();
			
		} catch (Exception e) {

			throw e;
		}
		
			
		return round; 
				
	}	
}
