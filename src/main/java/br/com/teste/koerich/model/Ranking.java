package br.com.teste.koerich.model;

import java.util.Comparator;

public class Ranking implements Comparator<Player>{
	
	@Override
	public int compare(Player p1, Player p2) {
		return Integer.compare(p1.sunScore(), p2.sunScore());
	}
}