package br.com.teste.koerich.response;



import java.util.Date;

import lombok.Data;

@Data
public class ErrorMessage {
	
	private Date currentDate;
	private String message;
	
	public ErrorMessage(Date currentDate, String message) {
		this.currentDate = currentDate;
		this.message = message;
	}

	public ErrorMessage() {}
	
	
}
