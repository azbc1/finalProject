package com.esprit.rendezVous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan("com.esprit.rendezVous.*")
@EnableJpaRepositories("com.esprit.rendezVous.*")
@EntityScan(basePackages = {"com.esprit.rendezVous.*"})
public class RendezvoussServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendezvoussServiceApplication.class, args);
	}

}
