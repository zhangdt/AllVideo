package com.abner.fff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FffApplication {

	public static void main(String[] args) {
		SpringApplication.run(FffApplication.class, args);
	}
}
