package com.projarctf.acmegames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AcmeGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcmeGamesApplication.class, args);
	}

}
