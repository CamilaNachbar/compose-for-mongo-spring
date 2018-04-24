package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.*")
@EnableAutoConfiguration
@SpringBootApplication
public class ExemploMongodbBluemixApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploMongodbBluemixApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ExemploMongodbBluemixApplication.class);
	}

}
