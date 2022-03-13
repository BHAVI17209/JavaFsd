package com.restful.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.restful.webservices")
public class RestfullWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebServicesApplication.class, args);
	}

}
