package br.com.teste.koerich.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class Round {//Rodada do Jogo

	private List<Player> players = new ArrayList<>();
	
	public void adicionarJogador (Player player) {
		players.add(player);
		System.out.println("round " + player);
		System.out.println("---------------------");
	}
	
	public List<Player> Rank(){
		players.sort(new Ranking());
		Collections.reverse(players);
		return players;
	}
}
