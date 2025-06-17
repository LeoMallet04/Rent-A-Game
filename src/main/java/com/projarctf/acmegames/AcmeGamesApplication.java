package com.projarctf.acmegames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages={"src.main.java.com.projarctf.acmegames.infraestructure.repository"})
@SpringBootApplication
public class AcmeGamesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcmeGamesApplication.class, args);
	}

}
