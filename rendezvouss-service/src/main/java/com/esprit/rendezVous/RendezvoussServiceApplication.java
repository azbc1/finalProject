package com.esprit.rendezVous;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RendezvoussServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RendezvoussServiceApplication.class, args);
	}

}
