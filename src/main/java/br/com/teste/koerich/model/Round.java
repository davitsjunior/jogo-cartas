package br.com.teste.koerich.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class Round {//Rodada do Jogo
		
	enum enumStatus {EMPATE, VITORIA};
	private List<Player> players = new ArrayList<>();
	
	private enumStatus status = enumStatus.VITORIA;
	
	public void adicionarJogador (Player player) {
		players.add(player);		
	} 
	 
	public void rank(){
		players.sort(new Ranking());
		Collections.reverse(players);
		if (players.get(0).getScore() == players.get(1).getScore() ) {
			status = enumStatus.EMPATE;	
			return;
		}			
		players = Arrays.asList(players.get(0)); 
			 
	}
} 
  