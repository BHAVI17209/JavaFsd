package com.restful.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.restful")
public class RestfullapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullapiApplication.class, args);
	}

}
