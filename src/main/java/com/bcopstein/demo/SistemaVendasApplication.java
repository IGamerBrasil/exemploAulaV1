package com.bcopstein.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bcopstein.demo")
public class SistemaVendasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaVendasApplication.class, args);
	}

}
