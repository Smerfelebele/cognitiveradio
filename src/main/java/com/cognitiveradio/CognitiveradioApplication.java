package com.cognitiveradio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.cognitiveradio.controllers", "com.cognitiveradio.services" })
@EnableJpaRepositories(basePackages = "com.cognitiveradio.repositories")
@EntityScan(basePackages = "com.cognitiveradio.entities")
public class CognitiveradioApplication {

	public static void main(String[] args) {
		SpringApplication.run(CognitiveradioApplication.class, args);
	}

}
