package br.com.teste.koerich.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Cards {
	
	//private String deck_id;

	private String image;
	private String value;
	
		
	public Cards() {
		
	}

	public Cards(String image, String value) {
		super();
		this.image = image;
		this.value = value; 
	}
	 
	public Integer getValue() {
		switch (value) {
		case "KING": 
			return 13;
		case "QUEEN": 
			return 12;
		case "JACK": 
			return 11;
		case "ACE": 
			return 1;
		default: 
			return Integer.parseInt(value);		
		} 
	} 
}