package br.com.teste.koerich.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.koerich.model.Round;
import br.com.teste.koerich.service.RoundService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/round")
public class RoundController {
	
	@Autowired
	private RoundService roundService;
	
	@GetMapping("/{id}")
	@ApiOperation(value = "Executa uma rodada do jogo com 4 jogadores com 5 cartas do deck")
	public ResponseEntity<Round> obterCartas(@PathVariable String id) throws Exception{
				
		Round round = roundService.distCards(id);
				
		return new ResponseEntity<Round>(round,HttpStatus.OK);			  	
	}
}