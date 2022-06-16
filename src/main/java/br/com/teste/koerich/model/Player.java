package br.com.teste.koerich.model;

import lombok.Data;

@Data
public class Player {

	private Integer id;
	private String name;
	private CardsPlayer cards;
	private Integer score;

	public Integer sunScore(){

		score = 0;

		for (int i = 0; i < 5; i++) {//Soma os valores das cartas no jogador
			score = score + cards.getCards().get(i).getValue();			
		}
		return score;		  

	}	
}