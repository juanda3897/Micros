package com.univers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UniversApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversApplication.class, args);
	}

}
