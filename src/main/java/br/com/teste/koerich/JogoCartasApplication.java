package br.com.teste.koerich;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JogoCartasApplication {

	public static void main(String[] args) {
		SpringApplication.run(JogoCartasApplication.class, args);
	}

}
