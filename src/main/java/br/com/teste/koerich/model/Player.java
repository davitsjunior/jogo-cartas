package br.com.teste.koerich.model;

import lombok.Data;

@Data
public class Player {
	
	private Integer id;
	private String name;
	private CardsPlayer cards;
	private Integer score;
	
	public Integer sunScore() {
		
		score = 0;
			
		for (int i = 0; i < 5; i++) {
			score = score + cards.getCards().get(i).getValue();
			//System.out.println("Valor...: " + i + " " + cards.getCards().get(i).getValue());
		} 				
		//System.out.println(score);
		return score;		
//		score = cards.stream()
//				.map(x -> x.getCards().get(0).getValue())
//				.reduce(0, Integer::sum);
//		return score;
	}	
}